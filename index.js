const bitValues = [128, 64, 32, 16, 8, 4, 2, 1];
const bitValuesIndex = bitValues.length;

let usableHosts = "";

let subnetMask = "0.0.0.0";
let netMask = 0;
let subnetClassCount = 0;

let bitCounts = [0, 0, 0, 0];
let remainingBits = 0;
let computedRemainingBits = 0;

let numberOfNetworks = 0;
let ip = [0, 0, 0, 0];

let answersContainer = null;
let answer = "";


window.addEventListener("load", () => {
    answersContainer = document.getElementById("answers")
    document.getElementById("start-calculation").addEventListener("click", () => {
        const octets = document.getElementsByClassName("ip");
        const netmask = document.getElementById("netmask");
        const non = document.getElementById("networks");
        const host = document.getElementById("hosts");
        const empty = /^\s*$/;

        let missingip = false;

        for (const octet of octets) {
            let name = octet.name.split("-");
            let index = Number(name[1]) - 1;

            if (empty.test(octet.value)) {
                missingip = true;
                break;
            }

            ip[index] = Number(octet.value);
        }

        if (empty.test(netmask.value) || empty.test(non.value) || missingip) {
            answer = "Missing field has been detected"
            answersContainer.innerText = answer;
            clear()
            return;
        }

        netMask = netmask.value;
        numberOfNetworks = non.value

        if (!empty.test(host.value)) {
            findClassBitBasedOnHost(host.value);
        }
        findClassBit();
        getSubnetMask();
        getNetworkMinMax();
        answersContainer.innerText = answer;
        clear();
    });

    document.getElementById("find-netmask").addEventListener("click", () => {
        const host = document.getElementById("hosts");
        let hosts = host.value;
        findClassBitBasedOnHost(hosts);
        answersContainer.innerText = answer
        document.getElementById("netmask").value = netMask
        clear();
    });
})

function clear() {
    usableHosts = "";
    subnetMask = "0.0.0.0";
    netMask = 0;
    subnetClassCount = 0;
    bitCounts = [0, 0, 0, 0];
    remainingBits = 0;
    computedRemainingBits = 0;
    numberOfNetworks = 0;
    ip = [0, 0, 0, 0];
    answer = "";
}

function getNetworkMinMax() {
    let networks = computedRemainingBits;
    for (let i = 0; i < numberOfNetworks; i++) {
        answer = answer + `\nSub ${i}: ${displayIp()}\n`;
        ip[3]++;
        networks--;
        checkIp();

        answer = answer + `1st: ${displayIp()}\n`;
        for (let j = 0; j < networks - 2; j++) {
            ip[3]++;
            checkIp();
        }
        networks -= ip[3];

        answer = answer + `last: ${displayIp()}\n`;

        ip[3]++;
        checkIp()
        networks = computedRemainingBits;
        answer = answer + `broadcast: ${displayIp()}\n`;
        ip[3]++;
        checkIp();
    }
}

function checkIp() {
    for (let i = 0; i < ip.length; i++) {
        if (ip[i] == 256) {
            let prevOctet = i - 1;
            ip[i] = 0;
            ip[prevOctet]++;
            if(ip[prevOctet] == 256){
                ip[prevOctet] = 0;
                ip[prevOctet - 1]++;
            }
        }
    }
}

function displayIp() {
    return ` ${ip[0]}.${ip[1]}.${ip[2]}.${ip[3]}`;
}

function findClassBitBasedOnHost(host) {
    netMask = 32;
    findClassBit(netMask);
    while (computedRemainingBits < host) {
        console.log("bits: " + netMask + " | hosts: " + computedRemainingBits + " | usable hosts: " + (computedRemainingBits - 2));
        console.log()
        netMask--;
        remainingBits = 0;
        findClassBit(netMask);
    }
    answer = `Suitable Bits for ${host} hosts is ` + netMask + " bits";
    usableHosts = `Hosts: ${computedRemainingBits} - 2 = ${computedRemainingBits - 2} usable hosts`;
    answer = answer + "\n" + usableHosts;
    console.log(netMask)
    remainingBits = 0;
    computedRemainingBits = 0;

}

function findClassBit() {
    let totalCount = 0;
    let currentBitIndex = 0;
    let currentBit = 0;

    //get subnet octets bits.
    for (let i = 1; i <= 32; i++) {

        if (totalCount == netMask) {
            bitCounts[currentBitIndex] = currentBit;
            break;
        }

        totalCount++;
        currentBit++;

        if (currentBit == 8) {
            bitCounts[currentBitIndex] = currentBit;
            currentBit = 0;
            currentBitIndex++;
        }
    }
    //get the remaining octet bits then compute the the total number of hosts
    for (const bit of bitCounts) {
        if (bit != 8) {
            remainingBits += 8 - bit;
        }
    }
    computedRemainingBits = Math.pow(2, remainingBits);
}

function getSubnetMask() {
    //get subnet mask values
    let subnetValues = [0, 0, 0, 0];
    for (let i = 0; i < bitCounts.length; i++) {
        switch (bitCounts[i]) {
            case 8:
                subnetValues[i] = 255
                break;

            case 0:
                subnetClassCount[i] = 0;
                break;

            default:
                for (let j = 0; j < bitCounts[i]; j++) {
                    subnetValues[i] += bitValues[j];
                }
                break;
        }
    }
    answer = answer + "\nbits: " + bitCounts + "\n";
    answer = answer + "remaining: " + remainingBits + "\n";
    subnetMask = `${subnetValues[0]}.${subnetValues[1]}.${subnetValues[2]}.${subnetValues[3]}`;
    usableHosts = `${computedRemainingBits} - 2 = ${computedRemainingBits - 2} usable hosts`;
    answer = answer + "Subnet Mask: " + subnetMask + "\n";
    answer = answer + "Hosts: " + usableHosts + "\n";
}

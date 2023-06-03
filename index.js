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

let vlsm = [];
let calculatingVlsm = false;

const empty = /^\s*$/;

window.addEventListener("load", () => {
    answersContainer = document.getElementById("answers")

    document.getElementById("compute-vlsm").addEventListener("click", () => {
        const octets = document.getElementsByClassName("ip");
        const vslmInput = document.getElementById("vlsm-hosts");

        const missingip = checkIPInput(octets);

        if (missingip || empty.test(vslmInput.value)) {
            displayMissingInput();
            return;
        }

        let vlsmValues = vslmInput.value.split(" ");
        calculatingVlsm = true;

        for (const data of vlsmValues) {

            let requiredhosts = 0;
            let netmask = 0;
            let netmaskhosts = 0;

            remainingBits = 0;
            computedRemainingBits = 0;
            if (data.includes("/")) {
                netMask = Number(data.split("/")[1])
                findClassBit();
                requiredhosts = computedRemainingBits;
                netmask = netMask;
                netmaskhosts = computedRemainingBits;
            } else {
                findClassBitBasedOnHost(Number(data))
                requiredhosts = Number(data);
                netmask = netMask;
                netmaskhosts = computedRemainingBits;
            }

            vlsm.push({
                network: data,
                requiredHosts: requiredhosts,
                netMaskHosts: netmaskhosts,
                netMask: netmask
            });
        }
        
        bitCounts = [0, 0, 0, 0];

        vlsm.sort((a, b) => {
            return b.requiredHosts - a.requiredHosts
        });
        console.log(vlsm)
        answer = answer + "Sorted VLSM:";
        vlsm.forEach(data => {
            answer = answer + `\nNet: ${data.network} = {Hosts: ${data.requiredHosts} || NetMask: ${data.netMask} || NetMask Hosts: ${data.netMaskHosts}}`;
        });
        answer = answer + "\n";
        let index = 0;
        for (const networkData of vlsm) {
            netMask = networkData.netMask;
            findClassBit();
            getSubnetMask();
            answer = answer + `\nNetwork ${index + 1} - ${networkData.network} || NetMask: ${networkData.netMask}`;
            getNetworkMinMax(networkData.netMaskHosts, index);
            index++;
        }

        answersContainer.innerText = answer;

        clear();
    });

    document.getElementById("start-calculation").addEventListener("click", () => {
        const octets = document.getElementsByClassName("ip");
        const netmask = document.getElementById("netmask");
        const non = document.getElementById("networks");
        const host = document.getElementById("hosts");

        const missingip = checkIPInput(octets);

        if (empty.test(netmask.value) || empty.test(non.value) || missingip) {
            displayMissingInput();
            return;
        }

        netMask = netmask.value;
        numberOfNetworks = non.value

        if (!empty.test(host.value)) {
            findClassBitBasedOnHost(host.value);
        }
        findClassBit();
        getSubnetMask();
        for (let i = 0; i < numberOfNetworks; i++) {
            getNetworkMinMax(computedRemainingBits, i);
        }
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

function getNetworkMinMax(hostIteration, sub) {
    let networks = hostIteration;
    answer = answer + `\nSub ${sub}: ${displayIp()} - ${subnetMask}\n`
    incrementIp();
    networks--;

    answer = answer + `1st: ${displayIp()}\n`;
    for (let j = 0; j < networks - 2; j++) {
        incrementIp();
    }
    networks -= ip[3];

    answer = answer + `last: ${displayIp()}\n`;

    incrementIp();
    networks = computedRemainingBits;
    answer = answer + `broadcast: ${displayIp()}\n`;
    incrementIp();
}

function displayMissingInput() {
    answer = "Missing field has been detected"
    answersContainer.innerText = answer;
    clear()
}

function checkIPInput(octets) {
    for (const octet of octets) {
        let name = octet.name.split("-");
        let index = Number(name[1]) - 1;
        if (empty.test(octet.value)) {
            return true;
        }

        ip[index] = Number(octet.value);
    }
    return false;
}

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
    vlsm = [];
}

function incrementIp() {
    ip[3]++;
    checkIp();
}

function checkIp() {
    for (let i = 0; i < ip.length; i++) {
        if (ip[i] == 256) {
            let prevOctet = i - 1;
            ip[i] = 0;
            ip[prevOctet]++;
            if (ip[prevOctet] == 256) {
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
    findClassBit();
    while (computedRemainingBits < host) {
        console.log("bits: " + netMask + " | hosts: " + computedRemainingBits + " | usable hosts: " + (computedRemainingBits - 2));
        console.log()
        netMask--;
        remainingBits = 0;
        findClassBit();
    }
    console.log(`Suitable Bits for ${host} hosts is ${netMask} bits`);
    if (!calculatingVlsm) {
        answer = `Suitable Bits for ${host} hosts is ${netMask} bits`;
        usableHosts = `Hosts: ${computedRemainingBits} - 2 = ${computedRemainingBits - 2} usable hosts`;
        answer = answer + "\n" + usableHosts;
    }
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
    
    subnetMask = `${subnetValues[0]}.${subnetValues[1]}.${subnetValues[2]}.${subnetValues[3]}`;
        
    if (!calculatingVlsm) {
        answer = answer + "Bits: " + bitCounts + "\n";
        answer = answer + "remaining: " + remainingBits + "\n";
        usableHosts = `${computedRemainingBits} - 2 = ${computedRemainingBits - 2} usable hosts`;
        answer = answer + "Subnet Mask: " + subnetMask + "\n";
        answer = answer + "Hosts: " + usableHosts + "\n";
    }
}
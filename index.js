const bitValues = [128, 64, 32, 16, 8, 4, 2, 1];
const bitValuesIndex = bitValues.length;

const ip = "192.168.10.0";
const hostCount = 280;
let usableHosts = "";

let subnetMask = "0.0.0.0";
let netMask = 1;
let subnetClassCount = 0;

let bitCounts = [0, 0, 0, 0];
let remainingBits = 0;
let computedRemainingBits = 0;

findClassBitBasedOnHost(hostCount);
findClassBit(netMask);
getSubnetMask();

function findClassBitBasedOnHost(host){
    netMask = 32;
    findClassBit(netMask);
    while(computedRemainingBits - 2 < host){
        console.log("bits: " + netMask + " | hosts: " + computedRemainingBits + " | usable hosts: " + (computedRemainingBits - 2));
        console.log()
        netMask--;
        remainingBits = 0;
        findClassBit(netMask);
    }
    console.log(`Suitable Bits for ${host} hosts is ` + netMask + " bits");
    usableHosts = `Hosts: ${computedRemainingBits} - 2 = ${computedRemainingBits - 2} usable hosts`;
    console.log(usableHosts);
    console.log()
    
    remainingBits = 0;
    computedRemainingBits = 0;
    
}

function findClassBit(netMask){
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
    console.log("bits: " + bitCounts)
    console.log("remaining: " + remainingBits)
    subnetMask = `${subnetValues[0]}.${subnetValues[1]}.${subnetValues[2]}.${subnetValues[3]}`;
    usableHosts = `${computedRemainingBits} - 2 = ${computedRemainingBits - 2} usable hosts`;
    console.log("Subnet Mask: " + subnetMask)
    console.log("Hosts: " + usableHosts)
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author SHarp
 */
public class Subnetting extends javax.swing.JFrame {

    public Subnetting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        octect1 = new javax.swing.JTextField();
        octect2 = new javax.swing.JTextField();
        octect3 = new javax.swing.JTextField();
        octect4 = new javax.swing.JTextField();
        netmaskField = new javax.swing.JTextField();
        nonField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        calculateIPPanel = new javax.swing.JPanel();
        calculateIP = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        findNetMaskPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        requiredHosts = new javax.swing.JTextField();
        findNetMask = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        vlsmPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        vlsmHosts = new javax.swing.JTextField();
        computeVLSM = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        answerContainer = new java.awt.TextArea("", 0, 0, java.awt.TextArea.SCROLLBARS_VERTICAL_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subnetting");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Subnetting");

        jLabel2.setText("Netmask");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText(".");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText(".");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText(".");

        jLabel6.setText("/");

        jLabel7.setText("IP Address");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Answer");

        jLabel9.setText("Number of Networks");

        calculateIPPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        calculateIP.setText("Calculate IP");
        calculateIP.setToolTipText("");
        calculateIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateIPActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("<html> <p>Will start the computation process,  ALL INPUTS MUST HAVE A VALUE</p>  <br> <p>OPTIONAL: you can add a value on \"Number of Host\" to overwrite the given netmask and find a more suitable netmask for the required number of hosts</p>  </html>");

        javax.swing.GroupLayout calculateIPPanelLayout = new javax.swing.GroupLayout(calculateIPPanel);
        calculateIPPanel.setLayout(calculateIPPanelLayout);
        calculateIPPanelLayout.setHorizontalGroup(
            calculateIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculateIPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculateIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(calculateIPPanelLayout.createSequentialGroup()
                        .addComponent(calculateIP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        calculateIPPanelLayout.setVerticalGroup(
            calculateIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculateIPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculateIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        findNetMaskPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("Number of Hosts");

        findNetMask.setText("Find Netmask");
        findNetMask.setToolTipText("");
        findNetMask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNetMaskActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("<html> <p>Finds the suitable netmask for the given Number of Needed Hosts.</p>  </html>");

        javax.swing.GroupLayout findNetMaskPanelLayout = new javax.swing.GroupLayout(findNetMaskPanel);
        findNetMaskPanel.setLayout(findNetMaskPanelLayout);
        findNetMaskPanelLayout.setHorizontalGroup(
            findNetMaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findNetMaskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(findNetMaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(findNetMaskPanelLayout.createSequentialGroup()
                        .addGroup(findNetMaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requiredHosts, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findNetMask, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        findNetMaskPanelLayout.setVerticalGroup(
            findNetMaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findNetMaskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requiredHosts, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findNetMask, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vlsmPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setText("VLSM Computation");

        computeVLSM.setText("Compute VLSM");
        computeVLSM.setToolTipText("");
        computeVLSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeVLSMActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setText("<html> Arange and calculates the Variable Length Subnet Mask or VLSM inputs must be separated with a space. Inputs can be the number of host or the netmask <br><br>Requirements: IP Address and VLSM text fields must have a value </html>");

        javax.swing.GroupLayout vlsmPanelLayout = new javax.swing.GroupLayout(vlsmPanel);
        vlsmPanel.setLayout(vlsmPanelLayout);
        vlsmPanelLayout.setHorizontalGroup(
            vlsmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vlsmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vlsmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vlsmHosts)
                    .addGroup(vlsmPanelLayout.createSequentialGroup()
                        .addGroup(vlsmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computeVLSM, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        vlsmPanelLayout.setVerticalGroup(
            vlsmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vlsmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vlsmHosts, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computeVLSM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        answerContainer.setEditable(false);
        answerContainer.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(octect1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(octect2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(octect3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(octect4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(netmaskField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(nonField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(calculateIPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findNetMaskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(vlsmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(octect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(octect4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(octect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(octect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(netmaskField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(findNetMaskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculateIPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vlsmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private final int[] bitValues = {128, 64, 32, 16, 8, 4, 2, 1};
    
    private int[] ip = {0, 0, 0, 0};
    private int[] netMaskBitCount = {0, 0, 0, 0};
    private int netmask = 0;
    private int numberOfNetworks = 0;
    private int remainingNetMaskBit = 0;
    private int netMaskHostCapacity = 0;
    private String subnetMask = "";
    
    private boolean calculatingVlsm = false;
    
    private String line = "";
    private StringBuilder answerBuilder = new StringBuilder();
    
    private Pattern emptyPattern = Pattern.compile("^\\s*$");
    
    private void calculateIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateIPActionPerformed
        System.out.println("calculate ip triggered with event " + evt.getActionCommand());
        ip[0] = Integer.parseInt(octect1.getText());
        ip[1] = Integer.parseInt(octect2.getText());
        ip[2] = Integer.parseInt(octect3.getText());
        ip[3] = Integer.parseInt(octect4.getText());
        
        calculatingVlsm = false;
        
        netmask = Integer.parseInt(netmaskField.getText());
        numberOfNetworks = Integer.parseInt(nonField.getText());
        
        if (!emptyPattern.matcher(requiredHosts.getText()).find()){
            findNetMaskBasedOnHost(Integer.parseInt(requiredHosts.getText()));
        }
        findNetMask();
        getSubnetMask();
        for (int i = 0; i < numberOfNetworks; i++) {
            getNetworkMinMax(netMaskHostCapacity, i);
        }
        displayAnswer();
        clear();
        
    }//GEN-LAST:event_calculateIPActionPerformed

    private void findNetMaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNetMaskActionPerformed
        findNetMaskBasedOnHost(Integer.parseInt(requiredHosts.getText()));
        netmaskField.setText(netmask + "");
        getSubnetMask();
        displayAnswer();
    }//GEN-LAST:event_findNetMaskActionPerformed

    private void computeVLSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeVLSMActionPerformed
        ip[0] = Integer.parseInt(octect1.getText());
        ip[1] = Integer.parseInt(octect2.getText());
        ip[2] = Integer.parseInt(octect3.getText());
        ip[3] = Integer.parseInt(octect4.getText());
        
        calculatingVlsm = true;
        
        String[] vlsms = vlsmHosts.getText().split(" ");
        ArrayList<vlsm> vlsmData = new ArrayList<>();
        
        for (String data : vlsms){
            
            int requiredhost = 0;
            int vlsmNetmask = 0;
            int netmaskhost = 0;
            
            netMaskHostCapacity = 0;
            remainingNetMaskBit = 0;
            
            if (data.contains("/")) {
                netmask = Integer.parseInt(data.split("/")[1]);
                findNetMask();
                requiredhost = netMaskHostCapacity;
                vlsmNetmask = netmask;
                netmaskhost = netMaskHostCapacity;
            }else {
                findNetMaskBasedOnHost(Integer.parseInt(data));
                requiredhost = Integer.parseInt(data);
                vlsmNetmask = netmask;
                netmaskhost = netMaskHostCapacity;
            }
            
            vlsmData.add(new vlsm(data, requiredhost, netmaskhost, netmask));
            
        }
        netMaskBitCount = new int[]{0, 0, 0, 0};
            
        vlsmData.sort((o1, o2) -> {
            return o2.getRequiredHosts() - o1.getRequiredHosts();
        });
            
        line = "Sorted VLSM: \n";
        append();
        vlsmData.forEach((data) -> {
            line = "Net: " + data.getNetwork() + " {Hosts: " + data.getRequiredHosts() + " || NetMask: " + data.getNetMask() + " || NetMask Hosts: " + data.getNetMaskHosts() + "}\n\n";
            append();
        });
        
        for (int i = 0; i < vlsmData.size(); i++) {
            vlsm data = vlsmData.get(i);
            netmask = data.getNetMask();
            findNetMask();
            getSubnetMask();
            line = "\nNetwork " + (i + 1) + " - " + data.getNetwork() + " || NetMask: " + data.getNetMask();
            append();
            getNetworkMinMax(data.getNetMaskHosts(), i);
        }
        
        displayAnswer();
        clear();
    }//GEN-LAST:event_computeVLSMActionPerformed

    private void clear(){
        ip = new int[]{0,0,0,0};
        netMaskBitCount = new int[]{0, 0, 0, 0};
        netmask = 0;
        numberOfNetworks = 0;
        remainingNetMaskBit = 0;
        netMaskHostCapacity = 0;
        subnetMask = "";
        answerBuilder.setLength(0);
    }
    
    private void getNetworkMinMax(int hostIteration, int sub){
        int networks = hostIteration;
        line = "\nSub " + sub + ": " + displayIP() + " - " + subnetMask + "\n";
        append();
        incrementIp();
        networks--;
        
        line = "1st: " + displayIP() + "\n";
        append();
        int numberOfIncrements = 0;
        
        for (int i = 0; i < networks - 2; i++) {
            incrementIp();
            numberOfIncrements++;
        }
        networks = networks - numberOfIncrements;
                
        line = "last: " + displayIP() + "\n";
        append();
        
        incrementIp();
        networks = netMaskHostCapacity;
        line = "broadcast: " + displayIP() + "\n";
        append();
        incrementIp();
    }
    
    private void append(){
        answerBuilder.append(line);
    }
    
    private void displayAnswer(){
        answerContainer.setText(answerBuilder.toString());
    }
    
    private void incrementIp(){
        ip[3]++;
        checkIp();
    }
    
    private String displayIP(){
        return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
    }
    
    private void checkIp(){
        for (int i = 0; i < ip.length; i++) {
            if (ip[i] == 256) {
                int prevOctect = i - 1;
                ip[i] = 0;
                ip[prevOctect]++;
                if (ip[prevOctect] == 256) {
                    ip[prevOctect] = 0;
                    ip[prevOctect - 1]++;
                }
            }
        }
    }
    
    private void findNetMaskBasedOnHost(int host){
        netmask = 32;
        findNetMask();
        while (netMaskHostCapacity < host) {            
            System.out.println("bits: " + netmask + " | hosts: " + netMaskHostCapacity + " | usable hosts: " + (netMaskHostCapacity - 2));
            System.out.println("");
            netmask--;
            remainingNetMaskBit = 0;
            findNetMask();
        }
        String suitableNetmask = "Suitable Netmask for " + host + " hosts is " + netmask + "\n\n";
        System.out.println(suitableNetmask);
        
        if (!calculatingVlsm) {
            line = suitableNetmask + "\n"
                    + "Hosts: " + netMaskHostCapacity + " - 2 = " + (netMaskHostCapacity - 2) + " usable hosts\n";
            append();
        }
    }
    
    private void findNetMask(){
        int totalCount = 0;
        int currentBitIndex = 0;
        int currentBitCount = 0;
        remainingNetMaskBit = 0;
        
        for (int i = 1; i <= 32; i++) {
            
            if (totalCount == netmask) {
                netMaskBitCount[currentBitIndex] = currentBitCount;
                break;
            }
            
            totalCount++;
            currentBitCount++;
            
            if (currentBitCount == 8) {
                netMaskBitCount[currentBitIndex] = currentBitCount;
                currentBitCount = 0;
                currentBitIndex++;
            }
        }
        
        for (int bit : netMaskBitCount) {
            if (bit != 8) {
                remainingNetMaskBit += 8 - bit;
            }
        }
        netMaskHostCapacity = (int) Math.pow(2, remainingNetMaskBit);
        
        System.out.println("[" + netMaskBitCount[0] + ", " + netMaskBitCount[1] + ", " + netMaskBitCount[2] + ", " + netMaskBitCount[3] + "]");
    }
    
    private void getSubnetMask(){
        int[] values = {0, 0, 0, 0};
        
        for (int i = 0; i < netMaskBitCount.length; i++) {
            switch (netMaskBitCount[i]) {
                case 8:
                    values[i] = 255;
                    break;
                    
                case 0:
                    System.out.println("subnet octect " + (i + 1) + " is 0");
                    break;
                    
                default:
                    for (int j = 0; j < netMaskBitCount[i]; j++) {
                        values[i] += bitValues[j];
                    }
                    break;
            }
        }
        subnetMask = values[0] + "." + values[1] + "." + values[2] + "." + values[3];
        System.out.println("Subnet Mask: " + subnetMask);
        
        if (!calculatingVlsm) {
            line = "Bits: " + Arrays.toString(netMaskBitCount) + "\n"
                    + "remaining: " + remainingNetMaskBit + "\n"
                    + "Subnet Mask: " + subnetMask + "\n"
                    + "Hosts: " + netMaskHostCapacity + " - 2 = " + (netMaskHostCapacity - 2) + " usable hosts\n";
            append();
        }
        
    }
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Subnetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subnetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subnetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subnetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subnetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea answerContainer;
    private javax.swing.JButton calculateIP;
    private javax.swing.JPanel calculateIPPanel;
    private javax.swing.JButton computeVLSM;
    private javax.swing.JButton findNetMask;
    private javax.swing.JPanel findNetMaskPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField netmaskField;
    private javax.swing.JTextField nonField;
    private javax.swing.JTextField octect1;
    private javax.swing.JTextField octect2;
    private javax.swing.JTextField octect3;
    private javax.swing.JTextField octect4;
    private javax.swing.JTextField requiredHosts;
    private javax.swing.JTextField vlsmHosts;
    private javax.swing.JPanel vlsmPanel;
    // End of variables declaration//GEN-END:variables
}

class vlsm{
    private String network;
    private int requiredHosts;
    private int netMaskHosts;
    private int netMask;

    public String getNetwork() {
        return network;
    }

    public int getRequiredHosts() {
        return requiredHosts;
    }

    public int getNetMaskHosts() {
        return netMaskHosts;
    }

    public int getNetMask() {
        return netMask;
    }
    
    public vlsm(String network, int requiredHosts, int netMaskHosts, int netMask) {
        this.network = network;
        this.requiredHosts = requiredHosts;
        this.netMaskHosts = netMaskHosts;
        this.netMask = netMask;
    }
    
    
    
}

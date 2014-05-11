/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BoothAlgorithmMain.java
 *
 * Created on 14 nov. 2012, 16:35:24
 */

package GUI;

import boothalgorithm.Booth;
import boothalgorithm.ModifiedBooth;
import java.awt.Color;

/**
 *
 * @author imad
 */
public class BoothAlgorithmMain extends javax.swing.JFrame {

    /** Creates new form BoothAlgorithmMain */
    public BoothAlgorithmMain() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booth Algorithm");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("VALUE OF A:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel2.setText("VALUE OF B:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Booth's algorithm", "Modified Booth's algorithm" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("CHOOSE ALGORITHM:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("CHOOSE MODE:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Simple", "Debug" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setText("COMPUTE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jComboBox2, 0, 180, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jComboBox1, 0, 180, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel4))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(66, 66, 66)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2)
                .add(4, 4, 4)
                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel5.setText("Booth's algorithm and modified Booth's algorithm simulation");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("By Imad Maadadi");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(129, 129, 129)
                .add(jLabel5)
                .addContainerGap(135, Short.MAX_VALUE))
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .add(jLabel6)
                .add(328, 328, 328))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 542, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // variables
        int q=0,i,j, a, b, temp;
        int[] A={0,0,0,0,0,0,0,0},C={0,0,0,0,0,0,0,1},C1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int s=0,z=0;
        int[] Q=new int[8]; 
        int[] M=new int[8];
        int[] temp1=new int [8];
        int[] ans=new int[16];
        int y,x=0, c=0, v, w;
        
        jTextArea1.setForeground(Color.black);
        jTextArea1.setText("");
        
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
            
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Please enter the multiplicant and the multiplier!");
        }
        else {
        a = Integer.parseInt(this.jTextField1.getText());
        b = Integer.parseInt(this.jTextField2.getText());
        if(Booth.verify(a).compareTo("true") != 0 || Booth.verify(b).compareTo("true") != 0) {
            jTextArea1.setForeground(Color.red);
            if(Booth.verify(a).compareTo("true") != 0)
            jTextArea1.append(Booth.verify(a));
            else
            jTextArea1.append(Booth.verify(b));
        }
        else {

        Booth.binary(a,M);
        Booth.binary(b,Q);
       
        jTextArea1.append("\nTHE BINARY EQUIVALENT OF "+a+" IS : ");
        for(i=0;i< 8;i++)
            jTextArea1.append(Integer.toString(M[i]));
        
        jTextArea1.append("\nTHE BINARY EQUIVALENT OF "+b+" IS : ");
        for(i=0;i< 8;i++)
        jTextArea1.append(Integer.toString(Q[i]));
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\n\n---------------------------------------------------\n");
        
        if(jComboBox1.getSelectedItem().toString().compareTo("Booth's algorithm") == 0) {  // Booth
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append(" OPERATION\t\t A\t Q\t Q'\t M");  // begining computation
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\n\n INITIAL\t\t");
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(A[i]));
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\t");
        
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(Q[i])); 
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) { // debug mode
        jTextArea1.append("\t");
        jTextArea1.append(q+"\t");
        }
        
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(M[i]));
        
        for(j=0;j< 8;j++) { // compute
            
            if((Q[7]==0)&&(q==1)) {
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A+M \t\t");
                Booth.add(A,M);
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }

            if((Q[7]==1)&&(q==0)) { // second condition
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A-M \t\t");

                for(i=0;i< 8;i++)
                    temp1[i] = 1-M[i];

                Booth.add(temp1,C);
                Booth.add(A,temp1);

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }

            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\n Shift \t\t");

            y = A[7];
            q = Q[7];

            Booth.rshift(A[0],A);
            Booth.rshift(y,Q);

            for(i=0;i< 8;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append(Integer.toString(A[i]));

            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\t");

            for(i=0;i< 8;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append(Integer.toString(Q[i]));

           if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) { // debug mode
           jTextArea1.append("\t");
           jTextArea1.append(q+"\t");
           }
           
           for(i=0;i< 8;i++)
               if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
               jTextArea1.append(Integer.toString(M[i]));

        }
        
        
        }
        else {
            
            //jTextArea1.append("booth modfied");
            // Booth modified
            
            
            
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append(" OPERATION\t\t A\t Q\t Q'\t M");  // begining computation
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\n\n INITIAL\t\t");
        
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(A[i]));
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
        jTextArea1.append("\t");
        
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(Q[i])); 
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) { // debug mode
        jTextArea1.append("\t");
        jTextArea1.append(q+"\t");
        }
        
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(M[i]));
        
        for(j=0;j< 4;j++) { // compute
            
            
            if((Q[6]==0)&&(Q[7]==1)&&(q==0)) {  //010
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A+M \t\t");
                Booth.add(A,M);
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }
            
            if((Q[6]==0)&&(Q[7]==0)&&(q==1)) {  //001
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A+M \t\t");
                Booth.add(A,M);
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }
            
            if((Q[6]==1)&&(Q[7]==1)&&(q==0)) { // 110
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A-M \t\t");

                for(i=0;i< 8;i++)
                    temp1[i] = 1-M[i];

                Booth.add(temp1,C);
                Booth.add(A,temp1);

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }

            if((Q[6]==1)&&(Q[7]==0)&&(q==1)) { // 101
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A-M \t\t");

                for(i=0;i< 8;i++)
                    temp1[i] = 1-M[i];

                Booth.add(temp1,C);
                Booth.add(A,temp1);

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }
            
            if((Q[6]==0)&&(Q[7]==1)&&(q==1)) {  //011
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A+(2*M) \t\t");
                
                Booth.add(A,M);
                Booth.add(A,M);
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }
            
            if((Q[6]==1)&&(Q[7]==0)&&(q==0)) { // 100
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n A=A-(2*M) \t\t");

                for(i=0;i< 8;i++)
                    temp1[i] = 1-M[i];

                Booth.add(temp1,C);
                Booth.add(A,temp1);
                
                for(i=0;i< 8;i++)
                    temp1[i] = 1-M[i];

                Booth.add(temp1,C);
                Booth.add(A,temp1);

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t"+q+"\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(M[i]));
            }
            

            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\n 2 Bit Shift \t\t");

            v = A[6];
            y = A[7];
            
            
            q = Q[6];


            ModifiedBooth.rshift(A[0], A[1], A);
            ModifiedBooth.rshift(v, y, Q);

            for(i=0;i< 8;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append(Integer.toString(A[i]));

            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\t");

            for(i=0;i< 8;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append(Integer.toString(Q[i]));

           if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) { // debug mode
           jTextArea1.append("\t");
           jTextArea1.append(q+"\t");
           }
           
           for(i=0;i< 8;i++)
               if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
               jTextArea1.append(Integer.toString(M[i]));

        }
        
        
        
        
        
        
        
            
        }
        
        jTextArea1.append("\n\n---------------------------------------------------\n");
        jTextArea1.append("\nTHE ANSWER IN BINARY IS : ");
        
        for(i=0;i< 8;i++)
            ans[i]=A[i];
        
        for(i=0;i< 8;i++)
            ans[i+8]=Q[i];
        
        if(((a< 0)&&(b>0))||((a>0)&&(b< 0))) {
            
            for(i=0;i< 16;i++)
                ans[i]=1-ans[i];
            
            for(i=15;i>=0;i--) {
                x = ans[i];
                ans[i]=c^x^C1[i];
                
                if(((c==1)&&(x==1))||((x==1)&&(C1[i]==1))||((C1[i]==1)&&(c==1)))
                    c=1;
                
                else
                    c=0;
            }

        }
        
        for(i=0;i< 16;i++)
            jTextArea1.append(Integer.toString(ans[i]));
        
        for(i=15;i>=0;i--) { //  conversion to decimal
            s = s + ((int)Math.pow(2,z) * ans[i]);
            z = z+1;
        }

        if(((a< 0)&&(b>0))||((a>0)&&(b< 0)))
            jTextArea1.append("\nTHE ANSWER IN DECIMAL IS :- "+s+"\n");
        else
            jTextArea1.append("\nTHE ANSWER IN DECIMAL IS : "+s+"\n");
        
        }
        }
        jTextField1.setText("");
        jTextField2.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BoothAlgorithmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartwarehousemanagement;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Lahiru
 */
public class ManagerMenu extends javax.swing.JFrame {

    /**
     * Creates new form ManagerMenu
     */
    public ManagerMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        if(Login.userwiseback.equals("Operator")){
            btn_deleteuser.setVisible(false); 
            btn_addoperator.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Sidepanal = new javax.swing.JPanel();
        btn_adduser = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_dash = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_deleteuser = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_addoperator = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_addstoragejob = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_bill = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_closestorage = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidepanal.setBackground(new java.awt.Color(54, 33, 89));

        btn_adduser.setBackground(new java.awt.Color(53, 33, 89));
        btn_adduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_adduserMousePressed(evt);
            }
        });
        btn_adduser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add User");
        btn_adduser.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 149, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\icons8_add_user_male_26px.png")); // NOI18N
        btn_adduser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 37, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_google_contacts_96px_1.png"))); // NOI18N

        btn_dash.setBackground(new java.awt.Color(85, 65, 118));
        btn_dash.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dashMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dashboard");

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\icons8_home_26px_1.png")); // NOI18N

        javax.swing.GroupLayout btn_dashLayout = new javax.swing.GroupLayout(btn_dash);
        btn_dash.setLayout(btn_dashLayout);
        btn_dashLayout.setHorizontalGroup(
            btn_dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_dashLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        btn_dashLayout.setVerticalGroup(
            btn_dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_dashLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        btn_deleteuser.setBackground(new java.awt.Color(53, 33, 89));
        btn_deleteuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_deleteuserMousePressed(evt);
            }
        });
        btn_deleteuser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Delete User");
        btn_deleteuser.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 149, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\icons8_denied_26px.png")); // NOI18N
        btn_deleteuser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 37, -1));

        btn_addoperator.setBackground(new java.awt.Color(53, 33, 89));
        btn_addoperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_addoperatorMousePressed(evt);
            }
        });
        btn_addoperator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Add Operator");
        btn_addoperator.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 166, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\icons8_plus_math_26px.png")); // NOI18N
        btn_addoperator.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 37, -1));

        btn_addstoragejob.setBackground(new java.awt.Color(53, 33, 89));
        btn_addstoragejob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_addstoragejobMousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add New Storage Job");

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\icons8_warehouse_26px.png")); // NOI18N

        javax.swing.GroupLayout btn_addstoragejobLayout = new javax.swing.GroupLayout(btn_addstoragejob);
        btn_addstoragejob.setLayout(btn_addstoragejobLayout);
        btn_addstoragejobLayout.setHorizontalGroup(
            btn_addstoragejobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_addstoragejobLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        btn_addstoragejobLayout.setVerticalGroup(
            btn_addstoragejobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addstoragejobLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_addstoragejobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        btn_bill.setBackground(new java.awt.Color(54, 33, 89));
        btn_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_billMousePressed(evt);
            }
        });
        btn_bill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\icons8_bill_26px.png")); // NOI18N
        btn_bill.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 41, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Calculate the Bill");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        btn_bill.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 140, 40));

        btn_closestorage.setBackground(new java.awt.Color(53, 33, 89));
        btn_closestorage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_closestorageMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Close Storage Job");

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\icons8_close_window_26px.png")); // NOI18N

        javax.swing.GroupLayout btn_closestorageLayout = new javax.swing.GroupLayout(btn_closestorage);
        btn_closestorage.setLayout(btn_closestorageLayout);
        btn_closestorageLayout.setHorizontalGroup(
            btn_closestorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_closestorageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        btn_closestorageLayout.setVerticalGroup(
            btn_closestorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_closestorageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_closestorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_closestorageLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\software\\OOP Software Project\\WareHouseManagementSystem\\icon\\log1.png")); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Manager Menu");

        javax.swing.GroupLayout SidepanalLayout = new javax.swing.GroupLayout(Sidepanal);
        Sidepanal.setLayout(SidepanalLayout);
        SidepanalLayout.setHorizontalGroup(
            SidepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_adduser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_dash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_deleteuser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_addoperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_closestorage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidepanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_addstoragejob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SidepanalLayout.createSequentialGroup()
                .addGroup(SidepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidepanalLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SidepanalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel19))
                    .addGroup(SidepanalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SidepanalLayout.setVerticalGroup(
            SidepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidepanalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(btn_dash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deleteuser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_addoperator, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_addstoragejob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_closestorage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        bg.add(Sidepanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 620));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("SMART WAREHOUSE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 950, 170));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/images/warehouse-delivery-logistic-service-vector-31343788.jpg"))); // NOI18N
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 960, 440));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("Developed By Group 4");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashMouseClicked

    private void btn_dashMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashMousePressed
        // TODO add your handling code here:
        setColor(btn_dash);
        resetColor(btn_adduser);
        resetColor(btn_deleteuser);
        resetColor(btn_addoperator);
        resetColor(btn_addstoragejob);
        resetColor(btn_closestorage);
        resetColor(btn_bill);
        
        ManagerMenu reguser = new ManagerMenu();
        reguser.setVisible(true);
        this.setVisible(false);
       
        
    }//GEN-LAST:event_btn_dashMousePressed

    private void btn_adduserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adduserMousePressed
        // TODO add your handling code here:
        resetColor(btn_dash);
        setColor(btn_adduser);
        resetColor(btn_deleteuser);
        resetColor(btn_addoperator);
        resetColor(btn_addstoragejob);
        resetColor(btn_closestorage);
        resetColor(btn_bill);
        
        AddUser reguser = new AddUser();
        reguser.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_adduserMousePressed

    private void btn_deleteuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteuserMousePressed
        // TODO add your handling code here:
        resetColor(btn_dash);
        resetColor(btn_adduser);
        setColor(btn_deleteuser);
        resetColor(btn_addoperator);
        resetColor(btn_addstoragejob);
        resetColor(btn_closestorage);
        resetColor(btn_bill);
        
        DeleteUser reguser = new DeleteUser();
        reguser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_deleteuserMousePressed

    private void btn_addoperatorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addoperatorMousePressed
        // TODO add your handling code here:
        resetColor(btn_dash);
        resetColor(btn_adduser);
        resetColor(btn_deleteuser);
        setColor(btn_addoperator);
        resetColor(btn_addstoragejob);
        resetColor(btn_closestorage);
        resetColor(btn_bill);
        
        
        AddOperator reguser = new AddOperator();
        reguser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_addoperatorMousePressed

    private void btn_addstoragejobMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addstoragejobMousePressed
        // TODO add your handling code here:
        resetColor(btn_dash);
        resetColor(btn_adduser);
        resetColor(btn_deleteuser);
        resetColor(btn_addoperator);
        setColor(btn_addstoragejob);
        resetColor(btn_closestorage);
        resetColor(btn_bill);
        
         AddStorageJob addstore = new AddStorageJob();
         addstore.setVisible(true);
        this.setVisible(false);
        
        
        
        
        
    }//GEN-LAST:event_btn_addstoragejobMousePressed

    private void btn_closestorageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closestorageMousePressed
        // TODO add your handling code here:
        resetColor(btn_dash);
        resetColor(btn_adduser);
        resetColor(btn_deleteuser);
        resetColor(btn_addoperator);
        resetColor(btn_addstoragejob);
        setColor(btn_closestorage);
        resetColor(btn_bill);
        
        CloseStorageJob closestore = new CloseStorageJob();
        closestore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_closestorageMousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel14MousePressed

    private void btn_billMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_billMousePressed
        // TODO add your handling code here:
        setColor(btn_bill);
        resetColor(btn_dash);
        resetColor(btn_adduser);
        resetColor(btn_deleteuser);
        resetColor(btn_addoperator);
        resetColor(btn_addstoragejob);
        resetColor(btn_closestorage);
        
        CalculateBill calbill = new CalculateBill();
        calbill.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btn_billMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
   void setColor(JPanel panel)
   {
       panel.setBackground(new Color(85,65,118));
   }
   
   void resetColor(JPanel panel)
   {
       panel.setBackground(new Color(54,33,89));
 
   }
   
   
   
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ManagerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sidepanal;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_addoperator;
    private javax.swing.JPanel btn_addstoragejob;
    private javax.swing.JPanel btn_adduser;
    private javax.swing.JPanel btn_bill;
    private javax.swing.JPanel btn_closestorage;
    private javax.swing.JPanel btn_dash;
    private javax.swing.JPanel btn_deleteuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

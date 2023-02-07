/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartwarehousemanagement;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Lahiru
 */
public class AddOperator extends javax.swing.JFrame {
    
     Connection con=null;
     Statement stmt = null;

    /**
     * Creates new form ManagerMenu
     */
    public AddOperator() {
        initComponents();
        con = DatabaseConnection.connection();
        this.setLocationRelativeTo(null);  
        show_operator();
        
     
    }
    
    
     public ArrayList<Operators>userList(){
        ArrayList<Operators> operatorsList = new ArrayList<>();
       
        try
        {
            String query= "SELECT * FROM login WHERE role='Operator'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Operators operators;
            while(rs.next()){
            operators = new Operators(rs.getString("id"),rs.getString("name"),rs.getString("username"),rs.getString("password"),rs.getString("role"));
            operatorsList.add(operators);
            }
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"Data Base Error"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
           
        }
            return operatorsList;   
    }
     
     
     public void show_operator(){
        ArrayList<Operators> list = userList();
        DefaultTableModel model = (DefaultTableModel)ta_operator.getModel();
        Object[] row = new Object[6];
        
        for(int i=0; i<list.size(); i++)
        {
            
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getUsername();
            row[3]=list.get(i).getPassword();
            row[4]=list.get(i).getRole();
            model.addRow(row);
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
        btn_closestorage = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_bill = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        oid = new javax.swing.JTextField();
        ousername = new javax.swing.JTextField();
        oname = new javax.swing.JTextField();
        opassword = new javax.swing.JPasswordField();
        orole = new javax.swing.JComboBox<>();
        btn_registerOperator = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_operator = new javax.swing.JTable();

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_add_user_male_26px.png"))); // NOI18N
        btn_adduser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 37, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_google_contacts_96px_1.png"))); // NOI18N

        btn_dash.setBackground(new java.awt.Color(54, 33, 89));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_home_26px_1.png"))); // NOI18N

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_denied_26px.png"))); // NOI18N
        btn_deleteuser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 37, -1));

        btn_addoperator.setBackground(new java.awt.Color(85, 65, 118));
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_plus_math_26px.png"))); // NOI18N
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_warehouse_26px.png"))); // NOI18N

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

        btn_closestorage.setBackground(new java.awt.Color(53, 33, 89));
        btn_closestorage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_closestorageMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Close Storage Job");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_close_window_26px.png"))); // NOI18N

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

        btn_bill.setBackground(new java.awt.Color(54, 33, 89));
        btn_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_billMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/icons8_bill_26px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Calculate the Bill");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_billLayout = new javax.swing.GroupLayout(btn_bill);
        btn_bill.setLayout(btn_billLayout);
        btn_billLayout.setHorizontalGroup(
            btn_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_billLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_billLayout.setVerticalGroup(
            btn_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_billLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Manager Dashboard");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartwarehousemanagement/icon/log1.png"))); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGap(70, 70, 70)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SidepanalLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidepanalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        SidepanalLayout.setVerticalGroup(
            SidepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidepanalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
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
                .addComponent(btn_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        bg.add(Sidepanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 620));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("OPERATOR REGISTRATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 940, 110));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("OPERATOR ID          :-");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 190, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("OPERATOR NAME   :-");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 190, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("PASSWORD   :-");
        bg.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 130, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("USERNAME   :-");
        bg.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 130, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("ROLE                        :-");
        bg.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 180, -1));

        oid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bg.add(oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 210, 30));

        ousername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bg.add(ousername, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 210, 30));

        oname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bg.add(oname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 210, 30));

        opassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bg.add(opassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 210, 30));

        orole.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operator" }));
        bg.add(orole, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 210, 30));

        btn_registerOperator.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registerOperator.setForeground(new java.awt.Color(51, 0, 204));
        btn_registerOperator.setText("Register");
        btn_registerOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerOperatorActionPerformed(evt);
            }
        });
        bg.add(btn_registerOperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 120, 30));

        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(0, 0, 204));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        bg.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 110, 30));

        ta_operator.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ta_operator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ta_operator);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 860, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
        
        ManagerMenu mmenu = new ManagerMenu();
        mmenu.setVisible(true);
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
        
        AddOperator addope = new AddOperator();
        addope.setVisible(true);
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

    private void btn_registerOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerOperatorActionPerformed
        // TODO add your handling code here:
        
        
        
            if(oid.getText().isEmpty())
            {
                displayerror();
                oid.requestFocus();
            }
            else if(opassword.getText().isEmpty())
            {
                displayerror();
                opassword.requestFocus();
            }
            else if(ousername.getText().isEmpty())
            {
                 displayerror();
                 ousername.requestFocus();
            }
            else if(oname.getText().isBlank())
            {
               displayerror();
               oname.requestFocus();
                
            }
            else{
                
                try
             {   
            String oId = oid.getText();
            String oName = opassword.getText();
            String oUsername = ousername.getText();
            String oPassword = oname.getText();
            String oRole = (String)orole.getSelectedItem();
            
            String query = "INSERT INTO login (id, name, username, password, role)VALUES(?,?,?,?,?)";
            
            PreparedStatement preparedstmt =  con.prepareStatement(query);
            preparedstmt.setString(1,oId);
            preparedstmt.setString(2, oName);
            preparedstmt.setString(3, oUsername);
            preparedstmt.setString(4, oPassword);
            preparedstmt.setString(5, oRole);
            
            preparedstmt.execute();
            JOptionPane.showMessageDialog(null,"Operator Added successfully"); 
             
                oid.setText("");
                opassword.setText("");
                ousername.setText("");
                oname.setText("");
                oid.requestFocus();
                
            }
          catch(Exception e)
          {
                JOptionPane.showMessageDialog(null,"DB Failed."+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
               
          }
       }
    }//GEN-LAST:event_btn_registerOperatorActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        oid.setText("");
        opassword.setText("");
        ousername.setText("");
        oname.setText("");
        oid.requestFocus();
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
public void displayerror(){
        JOptionPane.showMessageDialog(null,"Can't Keep Empty","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    
    
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
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AddOperator().setVisible(true);
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
    private javax.swing.JButton btn_clear;
    private javax.swing.JPanel btn_closestorage;
    private javax.swing.JPanel btn_dash;
    private javax.swing.JPanel btn_deleteuser;
    private javax.swing.JButton btn_registerOperator;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oid;
    private javax.swing.JTextField oname;
    private javax.swing.JPasswordField opassword;
    private javax.swing.JComboBox<String> orole;
    private javax.swing.JTextField ousername;
    private javax.swing.JTable ta_operator;
    // End of variables declaration//GEN-END:variables
}

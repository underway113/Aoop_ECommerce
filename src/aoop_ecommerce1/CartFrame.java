/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoop_ecommerce1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author J . Renael
 */
public class CartFrame extends javax.swing.JFrame {

    /**
     * Creates new form CartFrame
     */
    int total = 0 ;
    Connection con = null;
    Statement state = null;
    ResultSet res = null;
    ResultSet sum = null ;
    
    public CartFrame() {
        initComponents();
        
        String query = "SELECT * FROM Cart";
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TokipedDB");
            state = con.createStatement();
            res = state.executeQuery(query);
            tableCart.setModel(DbUtils.resultSetToTableModel(res));  
            sum = state.executeQuery("SELECT SUM(Harga) FROM Cart");
            if (sum.next()) {
                labelTotal.setText(String.valueOf(sum.getInt(1)));
                total = sum.getInt(1);
            }
           
        }
        catch(SQLException e){
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCart = new javax.swing.JTable();
        btnCredit = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(68, 138, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CART");

        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CartID", "Nama Barang", "Jumlah", "Harga"
            }
        ));
        tableCart.setRowHeight(40);
        jScrollPane1.setViewportView(tableCart);

        btnCredit.setBackground(new java.awt.Color(0, 94, 203));
        btnCredit.setForeground(new java.awt.Color(255, 255, 255));
        btnCredit.setText("Pay With Credit Card");
        btnCredit.setBorder(null);
        btnCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditActionPerformed(evt);
            }
        });

        btnTransfer.setBackground(new java.awt.Color(0, 94, 203));
        btnTransfer.setForeground(new java.awt.Color(255, 255, 255));
        btnTransfer.setText("Pay Atm Transfer");
        btnTransfer.setBorder(null);
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal.setText("TOTAL");

        btnHome.setBackground(new java.awt.Color(0, 94, 203));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(null);
        btnHome.setFocusable(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTotal.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTotal)
                                .addGap(18, 18, 18)
                                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal)
                        .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HomePageFrame().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        try {
            int id = 0 ;
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TokipedDB");
            String query = "SELECT MAX(TranID) FROM TRANSACTIONID";
            state = con.createStatement();
            res = state.executeQuery(query);
            if (res.next()) {
                 id = res.getInt(1) + 1 ;
            }
            String customer = "John" ;
            String payment = "Transfer" ;
            PreparedStatement add = con.prepareStatement("insert Into TRANSACTIONID values (?,?,?,?)");
            add.setInt(1, id);
            add.setString(2, customer);
            add.setString(3, payment);
            add.setInt(4, total);
            int row = add.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        this.setVisible(false);
        new HomePageFrame().setVisible(true);
        Connection con = null;
        String query = "DELETE FROM CART";
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TokipedDB");
            PreparedStatement deleteInit = con.prepareStatement(query);
            deleteInit.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditActionPerformed
        try {
            int id = 0 ;
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TokipedDB");
            String query = "SELECT MAX(TranID) FROM TRANSACTIONID";
            state = con.createStatement();
            res = state.executeQuery(query);
            if (res.next()) {
                 id = res.getInt(1) + 1 ;
            }
            String customer = "John" ;
            String payment = "Credit" ;
            PreparedStatement add = con.prepareStatement("insert Into TRANSACTIONID values (?,?,?,?)");
            add.setInt(1, id);
            add.setString(2, customer);
            add.setString(3, payment);
            add.setInt(4, total);
            int row = add.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        this.setVisible(false);
        new HomePageFrame().setVisible(true);
        
        Connection con = null;
        String query = "DELETE FROM CART";
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TokipedDB");
            PreparedStatement deleteInit = con.prepareStatement(query);
            deleteInit.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCreditActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new CartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tableCart;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentingsystem;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class AdminProf extends javax.swing.JFrame {

    public addItem ItemInsertionGUI;

    /**
     * Creates new form AdminProf
     */
    public AdminProf() {
        initComponents();
        this.AdminIDLabel.setText("Welcome!! You Admin ID: " + RentingSystemRunner.wc.AdminId);
        try {
            this.ListText.setText(RentingSystemRunner.DB.getInventoryList());
        } catch (SQLException ex) {
            this.ListText.setText(ex.getMessage());
        }
        this.setVisible(true);
    }

    public void setInventoryList() {
        try {
            this.ListText.setText(RentingSystemRunner.DB.getInventoryList());
        } catch (SQLException ex) {
            this.ListText.setText(ex.getMessage());
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

        AdminHeading = new javax.swing.JLabel();
        AdminIDLabel = new javax.swing.JLabel();
        addItemBtn = new javax.swing.JButton();
        removeItemBtn = new javax.swing.JButton();
        updateItemBtn = new javax.swing.JButton();
        addCustomerBtn = new javax.swing.JButton();
        removeCustomerBtn = new javax.swing.JButton();
        updateCustomerBTN = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListText = new javax.swing.JTextArea();
        List = new javax.swing.JLabel();
        notification = new javax.swing.JLabel();
        viewCustomerBtn = new javax.swing.JButton();
        viewRentsBtn = new javax.swing.JButton();
        viewItemsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminHeading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdminHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminHeading.setText("Admin Profile");

        AdminIDLabel.setForeground(new java.awt.Color(0, 153, 0));
        AdminIDLabel.setText("Welcome! Your Admin ID:  ");

        addItemBtn.setText("Add Item");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        removeItemBtn.setText("Remove Item");
        removeItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemBtnActionPerformed(evt);
            }
        });

        updateItemBtn.setText("Update Item");
        updateItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemBtnActionPerformed(evt);
            }
        });

        addCustomerBtn.setText("Add Customer");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        removeCustomerBtn.setText("Remove Customer");
        removeCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerBtnActionPerformed(evt);
            }
        });

        updateCustomerBTN.setText("Update Customer");
        updateCustomerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerBTNActionPerformed(evt);
            }
        });

        logoutBtn.setForeground(new java.awt.Color(204, 0, 0));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        ListText.setEditable(false);
        ListText.setColumns(20);
        ListText.setRows(5);
        jScrollPane1.setViewportView(ListText);

        List.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        List.setText("List");

        notification.setForeground(new java.awt.Color(0, 153, 0));
        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notification.setText("Notification");

        viewCustomerBtn.setText("View Customers");
        viewCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerBtnActionPerformed(evt);
            }
        });

        viewRentsBtn.setText("View Rents");
        viewRentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRentsBtnActionPerformed(evt);
            }
        });

        viewItemsBtn.setText("View Items");
        viewItemsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdminHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AdminIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(logoutBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(notification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addItemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeItemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateItemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewRentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewCustomerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateCustomerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeCustomerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(addCustomerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(viewItemsBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminHeading)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminIDLabel)
                    .addComponent(logoutBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemBtn)
                    .addComponent(addCustomerBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeItemBtn)
                    .addComponent(removeCustomerBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateItemBtn)
                    .addComponent(updateCustomerBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewCustomerBtn)
                    .addComponent(viewRentsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(viewItemsBtn)
                .addGap(18, 18, 18)
                .addComponent(List)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notification)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        RentingSystemRunner.wc.AdminId = "";
        RentingSystemRunner.wc = new Welcome();
        RentingSystemRunner.wc.setNotification("Admin Logged out Successfully");
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        Register reg = new Register();
        reg.isAdmin = true;
        reg.setNotification("Admin view");

    }//GEN-LAST:event_addCustomerBtnActionPerformed

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        // TODO add your handling code here:
        ItemInsertionGUI = new addItem();
        this.notification.setText("List updated Successfully");

    }//GEN-LAST:event_addItemBtnActionPerformed

    private void removeItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemBtnActionPerformed
        // TODO add your handling code here:
        removeItem removeItemGUI = new removeItem();
        this.notification.setText("Notification");

    }//GEN-LAST:event_removeItemBtnActionPerformed

    private void removeCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerBtnActionPerformed
        // TODO add your handling code here:
        removeCustomer removeCustomerGUI = new removeCustomer();
        this.notification.setText("Notification");
    }//GEN-LAST:event_removeCustomerBtnActionPerformed

    private void updateCustomerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerBTNActionPerformed
        // TODO add your handling code here:
        updateCustomer updateCustomerGUI = new updateCustomer();
    }//GEN-LAST:event_updateCustomerBTNActionPerformed

    private void updateItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemBtnActionPerformed
        // TODO add your handling code here:
        updateItem updateItemGUI = new updateItem();

    }//GEN-LAST:event_updateItemBtnActionPerformed

    private void viewItemsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemsBtnActionPerformed
        // TODO add your handling code here:
        setInventoryList();
    }//GEN-LAST:event_viewItemsBtnActionPerformed

    private void viewRentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRentsBtnActionPerformed
        // TODO add your handling code here:
        this.ListText.setText(RentingSystemRunner.DB.getRents());
    }//GEN-LAST:event_viewRentsBtnActionPerformed

    private void viewCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerBtnActionPerformed
        try {
            // TODO add your handling code here:
            ArrayList<Customer> customers = RentingSystemRunner.DB.getCustomers();
            String customerString = new String();
            customerString = customers.stream().map((c) -> c.toString()).reduce(customerString, String::concat);
            this.ListText.setText(customerString);
        } catch (SQLException ex) {
            this.notification.setText(ex.getMessage());
        }
    }//GEN-LAST:event_viewCustomerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminHeading;
    private javax.swing.JLabel AdminIDLabel;
    private javax.swing.JLabel List;
    private javax.swing.JTextArea ListText;
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JButton addItemBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel notification;
    private javax.swing.JButton removeCustomerBtn;
    private javax.swing.JButton removeItemBtn;
    private javax.swing.JButton updateCustomerBTN;
    private javax.swing.JButton updateItemBtn;
    private javax.swing.JButton viewCustomerBtn;
    private javax.swing.JButton viewItemsBtn;
    private javax.swing.JButton viewRentsBtn;
    // End of variables declaration//GEN-END:variables
}

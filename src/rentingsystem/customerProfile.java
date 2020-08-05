/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentingsystem;

import java.io.FileWriter;
import java.io.IOException;

public class customerProfile extends javax.swing.JFrame {

    private Customer customer;

    /**
     * Creates new form customerProfile
     */
    public customerProfile() {
        initComponents();
        this.setTitle("Customer Profile");
        this.setVisible(true);
    }
//, String fines

    public void fillProfile(Customer c, String rentedItems, String fines) {
        customer = c;
        this.NameLabel.setText("Welcome Mr. " + c.getPersonName());
        this.customerIDLabel.setText("Customer ID: " + c.getPersonID());
        this.EmailLabel.setText("Email: " + c.getCustomerEmail());
        this.phoneNoLabel.setText("Phone No: " + c.getPhoneNo());
        this.rentedItemsTextArea.setText(rentedItems);
        this.fineTextArea.setText(fines);
        this.setVisible(true);
    }

    public void setCustomer(Customer c) {
        this.customer = c;
        this.NameLabel.setText("Welcome Mr. " + c.getPersonName());
        this.customerIDLabel.setText("Customer ID: " + c.getPersonID());
        this.EmailLabel.setText("Email: " + c.getCustomerEmail());
        this.phoneNoLabel.setText("Phone No: " + c.getPhoneNo());
    }

    public Customer getCustomer() {

        return customer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentedItemsTextArea = new javax.swing.JTextArea();
        NameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        phoneNoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerIDLabel = new javax.swing.JLabel();
        rentItemBtn = new javax.swing.JButton();
        generateReportBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fineTextArea = new javax.swing.JTextArea();
        logoutBtn = new javax.swing.JButton();
        returnRentedBTN = new javax.swing.JButton();
        notification = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Profile");

        rentedItemsTextArea.setEditable(false);
        rentedItemsTextArea.setColumns(20);
        rentedItemsTextArea.setRows(5);
        jScrollPane1.setViewportView(rentedItemsTextArea);

        NameLabel.setText("Name");

        EmailLabel.setText("Email");

        phoneNoLabel.setText("Phone No. ");

        jLabel3.setText("Rented Items");

        customerIDLabel.setText("Customer ID");

        rentItemBtn.setText("Rent Items");
        rentItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentItemBtnActionPerformed(evt);
            }
        });

        generateReportBtn.setText("Generate Profile Report");
        generateReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Fine ");

        fineTextArea.setEditable(false);
        fineTextArea.setColumns(20);
        fineTextArea.setRows(5);
        jScrollPane2.setViewportView(fineTextArea);

        logoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        returnRentedBTN.setText("Return Rented Items ");
        returnRentedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnRentedBTNActionPerformed(evt);
            }
        });

        notification.setForeground(new java.awt.Color(0, 204, 0));
        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notification.setText("Notification");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerIDLabel)
                        .addComponent(phoneNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rentItemBtn)
                    .addComponent(generateReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnRentedBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(NameLabel)
                        .addGap(4, 4, 4)
                        .addComponent(customerIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(rentItemBtn)
                        .addGap(18, 18, 18)
                        .addComponent(generateReportBtn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(returnRentedBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notification)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutBtn)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        RentingSystemRunner.wc.cL = null;
        RentingSystemRunner.wc = new Welcome();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void generateReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportBtnActionPerformed
        // TODO add your handling code here:
        try {
            try (FileWriter myWriter = new FileWriter(customer.getPersonID() + "_report.txt")) {
                String report[] = RentingSystemRunner.DB.getcurrentCustomerRents(customer.getPersonID());

                myWriter.write("Rents: \n" + report[0]);
                myWriter.write("\nFines: " + report[1]);
                this.notification.setText("File Generate Successfully!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

    }//GEN-LAST:event_generateReportBtnActionPerformed

    private void rentItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentItemBtnActionPerformed
        // TODO add your handling code here:
        rentItem rentItemGUI = new rentItem();
    }//GEN-LAST:event_rentItemBtnActionPerformed

    private void returnRentedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnRentedBTNActionPerformed
        // TODO add your handling code here:
        returnRentedItems returnItemsGUI = new returnRentedItems();
    }//GEN-LAST:event_returnRentedBTNActionPerformed

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
            java.util.logging.Logger.getLogger(customerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel customerIDLabel;
    private javax.swing.JTextArea fineTextArea;
    private javax.swing.JButton generateReportBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel notification;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JButton rentItemBtn;
    private javax.swing.JTextArea rentedItemsTextArea;
    private javax.swing.JButton returnRentedBTN;
    // End of variables declaration//GEN-END:variables
}

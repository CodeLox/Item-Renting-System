package rentingsystem;

import static java.lang.System.exit;
import java.sql.SQLException;

public class Welcome extends javax.swing.JFrame {

    public customerLogin cL;
    public Register reg;
    public Customer C;
    public AdminLogin A;
    String AdminId;

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        this.setTitle("Welcome");
        setVisible(true);
    }

    public void setNotification(String noti) {
        this.notificLabel.setText(noti);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeNoteLabel = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        CustLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        notificLabel = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeNoteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeNoteLabel.setText("Welcome to Renting System");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentingsystem/RentMachine.JPG"))); // NOI18N

        registerBtn.setText("Register?");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        adminBtn.setText("Admin?");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        CustLoginBtn.setText("Customer?");
        CustLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustLoginBtnActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please tell us who you are!");

        notificLabel.setForeground(new java.awt.Color(0, 153, 0));
        notificLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notificLabel.setText("Notification Bar");

        ExitBtn.setForeground(new java.awt.Color(255, 0, 0));
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CustLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(121, 121, 121))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(147, 147, 147)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(welcomeNoteLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notificLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(welcomeNoteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustLoginBtn)
                    .addComponent(adminBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificLabel)
                    .addComponent(ExitBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        reg = new Register();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
        RentingSystemRunner.wc.dispose();
        A = new AdminLogin();

    }//GEN-LAST:event_adminBtnActionPerformed

    private void CustLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustLoginBtnActionPerformed
        // TODO add your handling code here:
        RentingSystemRunner.wc.dispose();
        cL = new customerLogin();
    }//GEN-LAST:event_CustLoginBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustLoginBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton adminBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel notificLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel welcomeNoteLabel;
    // End of variables declaration//GEN-END:variables
}
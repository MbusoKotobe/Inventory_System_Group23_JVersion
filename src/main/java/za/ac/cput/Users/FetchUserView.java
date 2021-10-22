/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Users;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import za.ac.cput.group23.inventory_system_group23_jversion.GUIUtility;

/**
 *
 * @author Mbuso Kotob's
 */
public class FetchUserView extends javax.swing.JFrame {

    /**
     * Creates new form UpdateUserView
     */
    public FetchUserView()
    {
        initComponents();
        hideErrorMessages();
        ImageIcon icon;
        icon = new ImageIcon("Logo/logos.jpg");
        this.setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userIDLabel = new javax.swing.JLabel();
        userIdInputField = new javax.swing.JTextField();
        fetchUserBttn = new javax.swing.JButton();
        fetchUserCancelBtn = new javax.swing.JButton();
        invalidUserIdErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(178, 149, 181));

        userIDLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        userIDLabel.setText("User ID");

        userIdInputField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        userIdInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdInputFieldActionPerformed(evt);
            }
        });

        fetchUserBttn.setBackground(new java.awt.Color(178, 149, 213));
        fetchUserBttn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fetchUserBttn.setForeground(new java.awt.Color(255, 255, 255));
        fetchUserBttn.setText("Fetch User");
        fetchUserBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchUserBttnActionPerformed(evt);
            }
        });

        fetchUserCancelBtn.setBackground(new java.awt.Color(178, 149, 213));
        fetchUserCancelBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fetchUserCancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        fetchUserCancelBtn.setText("Cancel");
        fetchUserCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 1, true));
        fetchUserCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchUserCancelBtnActionPerformed(evt);
            }
        });

        invalidUserIdErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invalidUserIdErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidUserIdErrorLabel.setText("Invalid User ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(invalidUserIdErrorLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userIdInputField)
                        .addComponent(fetchUserBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fetchUserCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fetchUserCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(invalidUserIdErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(userIdInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(fetchUserBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userIdInputFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_userIdInputFieldActionPerformed
    {//GEN-HEADEREND:event_userIdInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdInputFieldActionPerformed

    private void fetchUserBttnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fetchUserBttnActionPerformed
    {//GEN-HEADEREND:event_fetchUserBttnActionPerformed
        if(GUIUtility.isValidUserID(userIdInputField.getText()))
        {
            int id = Integer.parseInt(this.userIdInputField.getText().trim());
            UpdateUserView updateUserView = new UpdateUserView(id);
            updateUserView.setVisible(true);
            this.setVisible(false);
        }else{
            this.invalidUserIdErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_fetchUserBttnActionPerformed

    private void fetchUserCancelBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fetchUserCancelBtnActionPerformed
    {//GEN-HEADEREND:event_fetchUserCancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_fetchUserCancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FetchUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FetchUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FetchUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FetchUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new FetchUserView().setVisible(true);
            }
        });
    }
    
    private void hideErrorMessages()
    {
        this.invalidUserIdErrorLabel.setVisible(false);
    }
            
    private final int MINIMUM_VALID_ID = 100;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fetchUserBttn;
    private javax.swing.JButton fetchUserCancelBtn;
    private javax.swing.JLabel invalidUserIdErrorLabel;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JTextField userIdInputField;
    // End of variables declaration//GEN-END:variables
}

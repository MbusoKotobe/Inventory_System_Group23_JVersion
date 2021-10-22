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
public class RemoveUserView extends javax.swing.JFrame {
    UserDBOperations dbOperation = new UserDBOperations(); 

    public RemoveUserView()
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        removeUserField = new javax.swing.JTextField();
        removeUserBtn = new javax.swing.JToggleButton();
        removeUserCancelBtn = new javax.swing.JButton();
        invalidUserIDErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(178, 149, 213));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Remove User");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("User ID");

        removeUserField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        removeUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserFieldActionPerformed(evt);
            }
        });

        removeUserBtn.setBackground(new java.awt.Color(179, 133, 213));
        removeUserBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeUserBtn.setText("Remove User");
        removeUserBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 1, true));
        removeUserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserBtnActionPerformed(evt);
            }
        });

        removeUserCancelBtn.setBackground(new java.awt.Color(178, 149, 213));
        removeUserCancelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeUserCancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeUserCancelBtn.setText("Cancel");
        removeUserCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 1, true));
        removeUserCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserCancelBtnActionPerformed(evt);
            }
        });

        invalidUserIDErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invalidUserIDErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidUserIDErrorLabel.setText("Invalid User ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeUserCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invalidUserIDErrorLabel))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeUserField)
                        .addComponent(removeUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(removeUserCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invalidUserIDErrorLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(removeUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void removeUserFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_removeUserFieldActionPerformed
    {//GEN-HEADEREND:event_removeUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeUserFieldActionPerformed

    private void removeUserBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_removeUserBtnActionPerformed
    {//GEN-HEADEREND:event_removeUserBtnActionPerformed
        
        if(GUIUtility.isValidUserID(removeUserField.getText()))
        {
            int status = dbOperation.removeUser(Integer.parseInt(removeUserField.getText()));
            if(status == 1)
            {
                JOptionPane.showMessageDialog(null, "User Successfully Removed.");
                this.dispose();
                UsersView userView = new UsersView();
                userView.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "There was an error removing the user.");
                this.dispose();
                UsersView userView = new UsersView();
                userView.setVisible(true);
            }  
        }else{
            this.invalidUserIDErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_removeUserBtnActionPerformed

    private void removeUserCancelBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_removeUserCancelBtnActionPerformed
    {//GEN-HEADEREND:event_removeUserCancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_removeUserCancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RemoveUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RemoveUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RemoveUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new RemoveUserView().setVisible(true);
            }
        });
    }
    
    private void hideErrorMessages()
    {
        this.invalidUserIDErrorLabel.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel invalidUserIDErrorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton removeUserBtn;
    private javax.swing.JButton removeUserCancelBtn;
    private javax.swing.JTextField removeUserField;
    // End of variables declaration//GEN-END:variables
}
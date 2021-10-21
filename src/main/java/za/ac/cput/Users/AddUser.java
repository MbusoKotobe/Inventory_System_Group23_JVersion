/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import za.ac.cput.DBConnection.DBConnection;

/**
 *
 * @author Mbuso Kotob's
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUser()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstNameInputField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastNameInputField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailInputField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cellphoneInputField = new javax.swing.JTextField();
        saveNewUserBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        passwordInputField = new javax.swing.JTextField();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(178, 149, 213));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Add User");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Name");

        firstNameInputField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        firstNameInputField.setMargin(new java.awt.Insets(2, 2, 2, 2));
        firstNameInputField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                firstNameInputFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Surname");

        lastNameInputField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        lastNameInputField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                lastNameInputFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Email");

        emailInputField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        emailInputField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                emailInputFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Cellphone");

        cellphoneInputField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        cellphoneInputField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cellphoneInputFieldActionPerformed(evt);
            }
        });

        saveNewUserBtn.setBackground(new java.awt.Color(178, 149, 213));
        saveNewUserBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveNewUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveNewUserBtn.setText("Save");
        saveNewUserBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveNewUserBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("User Type");

        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        userTypeComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Password");

        passwordInputField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        passwordInputField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                passwordInputFieldActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(178, 149, 213));
        button1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveNewUserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cellphoneInputField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameInputField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameInputField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailInputField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordInputField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 685, Short.MAX_VALUE)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cellphoneInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(saveNewUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        button1.getAccessibleContext().setAccessibleName("addUsersBackBtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameInputFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_lastNameInputFieldActionPerformed
    {//GEN-HEADEREND:event_lastNameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameInputFieldActionPerformed

    private void cellphoneInputFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cellphoneInputFieldActionPerformed
    {//GEN-HEADEREND:event_cellphoneInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellphoneInputFieldActionPerformed

    private void saveNewUserBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveNewUserBtnActionPerformed
    {//GEN-HEADEREND:event_saveNewUserBtnActionPerformed
        // TODO add your handling code here:
        extractValuesFromFormFields();
        saveNewUser();
        resetFormFields();
        this.setVisible(false);
    }//GEN-LAST:event_saveNewUserBtnActionPerformed

    private void firstNameInputFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_firstNameInputFieldActionPerformed
    {//GEN-HEADEREND:event_firstNameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputFieldActionPerformed

    private void emailInputFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_emailInputFieldActionPerformed
    {//GEN-HEADEREND:event_emailInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputFieldActionPerformed

    private void passwordInputFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_passwordInputFieldActionPerformed
    {//GEN-HEADEREND:event_passwordInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new AddUser().setVisible(true);
            }
        });
    }
    
    private void saveNewUser()
    {
        String query = "INSERT INTO PROJECT.IVNSYS_USER VALUES (?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection conn = DBConnection.DerbeyConnection();
            PreparedStatement statement = conn.prepareStatement(query);
            configureStatementValues(statement);
            statement.execute();
            statement.close();
            
        }catch(SQLException exception)
        {
            System.err.print(exception);
        }
    }
    
    private int createId()
    {
        String query = "SELECT MAX(USER_ID) FROM PROJECT.IVNSYS_USER";
        int rowNumber = 0;
        try{
            Connection conn = DBConnection.DerbeyConnection();
            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(query);
            while(results.next())
            {
                rowNumber = results.getInt(1);
            }
            
        }catch(SQLException exception)
        {
            System.err.println(exception);
        }
        
        return ++rowNumber;
    }

    private void configureStatementValues(PreparedStatement statement) throws SQLException
    {
        statement.setInt(1, this.id);
        statement.setString(2, this.firstName);
        statement.setString(3, this.lastName);
        statement.setString(4, this.email);
        statement.setString(5, this.cellphone);
        statement.setString(6, this.userType);
        statement.setString(7, this.password);
    }
    
    private void extractValuesFromFormFields()
    {
        this.id = createId();
        this.firstName = this.firstNameInputField.getText();
        this.lastName = this.lastNameInputField.getText();
        this.email = this.emailInputField.getText();
        this.cellphone = this.cellphoneInputField.getText();
        this.userType = this.userTypeComboBox.getSelectedItem().toString();
        this.password = this.passwordInputField.getText();
    }
    
    private void resetFormFields()
    {
        this.firstNameInputField.setText("");
        this.lastNameInputField.setText("");
        this.emailInputField.setText("");
        this.cellphoneInputField.setText("");
        this.userTypeComboBox.getSelectedItem().toString();
        this.passwordInputField.setText("");
    }
    
    private int id = 0;
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String cellphone = "";
    private String userType = "";
    private String password = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JTextField cellphoneInputField;
    private javax.swing.JTextField emailInputField;
    private javax.swing.JTextField firstNameInputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNameInputField;
    private javax.swing.JTextField passwordInputField;
    private javax.swing.JButton saveNewUserBtn;
    private javax.swing.JComboBox<String> userTypeComboBox;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Products;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import za.ac.cput.Home.HomeView;
import za.ac.cput.dao.ProductDAO;
import za.ac.cput.group23.inventory_system_group23_jversion.GUIUtility;

/**
 *
 * @author Juan
 */
public class AddProductView extends javax.swing.JFrame {

    Products product;
    ProductDAO dao;

    /**
     * Creates new form addProduct
     *
     * @throws java.sql.SQLException
     */
    public AddProductView() throws SQLException
    {
        ImageIcon icon;
        icon = new ImageIcon("Logo/logos.jpg");
        this.setIconImage(icon.getImage());
        initComponents();
        hideErrorMessages();
        dao = new ProductDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProductName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblBarcode = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtBarcode = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        invalidProductNameErrorLabel = new javax.swing.JLabel();
        invalidProductPriceErrorLabel = new javax.swing.JLabel();
        invalidAmountErrorLabel = new javax.swing.JLabel();
        invalidProductBarcodeErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(212, 209, 206));

        lblProductName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProductName.setText("Name of Product:");

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrice.setText("Price of Product:");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantity.setText("Amount of Product:");

        lblBarcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBarcode.setText("Product ID:");

        btnSave.setBackground(new java.awt.Color(178, 149, 213));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(178, 149, 213));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 1, true));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtProductName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtProductName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtQuantity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        txtBarcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBarcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 2, true));

        jPanel1.setBackground(new java.awt.Color(178, 149, 213));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD PAGE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(377, 377, 377))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnHome.setBackground(new java.awt.Color(178, 149, 213));
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 173, 104), 1, true));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        invalidProductNameErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invalidProductNameErrorLabel.setForeground(new java.awt.Color(255, 10, 29));
        invalidProductNameErrorLabel.setText("Invalid Product Name");

        invalidProductPriceErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invalidProductPriceErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidProductPriceErrorLabel.setText("Invalid Product Price");

        invalidAmountErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invalidAmountErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidAmountErrorLabel.setText("Invalid Amount");

        invalidProductBarcodeErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invalidProductBarcodeErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidProductBarcodeErrorLabel.setText("Invalid Barcode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName)
                            .addComponent(lblPrice)
                            .addComponent(lblQuantity)
                            .addComponent(lblBarcode)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invalidProductNameErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invalidProductPriceErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invalidAmountErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invalidProductBarcodeErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtProductName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBarcode)
                    .addComponent(txtQuantity))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(invalidProductNameErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(invalidProductPriceErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantity)
                    .addComponent(invalidAmountErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarcode)
                    .addComponent(invalidProductBarcodeErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Products newProduct = new Products();
        _productName = txtProductName.getText();
        _productPrice = txtPrice.getText();
        _productQuantity = txtQuantity.getText();
        _productBarcode = txtBarcode.getText();
        
        try
        {
            validateFormData();
            String productName = _productName;
            double productPrice = Double.parseDouble(_productPrice);
            int productQuantity = Integer.parseInt(_productQuantity);
            String productBarcode = _productBarcode;
            newProduct = new Products(productName, productPrice, productQuantity, productBarcode);
            product = dao.save(newProduct);
            this.dispose();
            ProductsView productView = new ProductsView();
            productView.setVisible(true);
        } catch (Exception ex)
        {
            Logger.getLogger(AddProductView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (product.equals(newProduct))
        {
            JOptionPane.showMessageDialog(null, "Success! new Product has been added.");
        } else
        {
            JOptionPane.showMessageDialog(null, "Error could not add new product");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        hideErrorMessages();
        txtProductName.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        txtBarcode.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        HomeView hp = new HomeView();
        hp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtProductNameActionPerformed
    {//GEN-HEADEREND:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtQuantityActionPerformed
    {//GEN-HEADEREND:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void validateFormData() throws Exception
    {
        boolean isErrorFound = false;
        if(!GUIUtility.isNameValid(_productName))
        {
            this.invalidProductNameErrorLabel.setVisible(true);
            isErrorFound = true;
        }
        
        if(!GUIUtility.isValidProductPrice(_productPrice))
        {
            this.invalidProductPriceErrorLabel.setVisible(true);
            isErrorFound = true;
        }
        
        if(!GUIUtility.isValidUnsignedNumber(_productQuantity))
        {
            this.invalidAmountErrorLabel.setVisible(true);
            isErrorFound = true;
        }
        
        if(!GUIUtility.isValidBarcode(_productBarcode))
        {
            this.invalidProductBarcodeErrorLabel.setVisible(true);
            isErrorFound = true;
        }
        
        if(isErrorFound) throw new Exception("Invalid Data Received");
    }
    
    private void hideErrorMessages()
    {
        this.invalidAmountErrorLabel.setVisible(false);
        this.invalidProductPriceErrorLabel.setVisible(false);
        this.invalidProductNameErrorLabel.setVisible(false);
        this.invalidProductBarcodeErrorLabel.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(AddProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AddProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AddProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AddProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try
                {
                    new AddProductView().setVisible(true);
                } catch (SQLException ex)
                {
                    Logger.getLogger(AddProductView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    String _productName = "";
    String _productPrice = "";
    String _productQuantity = "";
    String _productBarcode = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel invalidAmountErrorLabel;
    private javax.swing.JLabel invalidProductBarcodeErrorLabel;
    private javax.swing.JLabel invalidProductNameErrorLabel;
    private javax.swing.JLabel invalidProductPriceErrorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}

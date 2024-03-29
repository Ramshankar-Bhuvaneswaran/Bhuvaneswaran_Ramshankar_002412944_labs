
package ui.supplier;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Supplier;
import model.SupplierDirectory;


public class UpdateSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateSupplierJPanel
     */
    private JPanel workArea;
    private Supplier supplier;
    
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon logoImage;
    public UpdateSupplierJPanel(JPanel workArea, Supplier supplier) {
        initComponents();
         this.workArea = workArea;
        this.supplier = supplier;
        
        FileFilter jpegFilter = new FileNameExtensionFilter("JPEG file","jpg","jpeg");
        FileFilter pngFilter = new FileNameExtensionFilter("PNG file","png","png");
        
        fileChooser.addChoosableFileFilter(jpegFilter);
        fileChooser.addChoosableFileFilter(pngFilter);
        
        fileChooser.setFileFilter(pngFilter);
        txtName.setEnabled(false);
        jTextArea1.setEnabled(false);
        btnSaveSupplier.setEnabled(false);
        populate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgLogo = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnUpdateSupplier = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblLogo = new javax.swing.JLabel();
        btnSaveSupplier = new javax.swing.JButton();

        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAttach.setText("Attach");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblTitle.setText("Update Supplier Information:");

        btnUpdateSupplier.setText("Update");
        btnUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSupplierActionPerformed(evt);
            }
        });

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        lblDescription.setText("Description:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblLogo.setText("Logo:");

        btnSaveSupplier.setText("Save");
        btnSaveSupplier.setEnabled(false);
        btnSaveSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescription)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(backButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(lblName)))
                    .addComponent(lblLogo))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addComponent(jScrollPane1)
                    .addComponent(lblTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnSaveSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAttach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(lblTitle))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLogo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAttach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUpdateSupplier)
                                    .addComponent(btnSaveSupplier))
                                .addGap(81, 81, 81))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);

        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            URL url;

            try{
                url = file.toURI().toURL();
                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                imgLogo.setIcon(logoImage);
            }catch (MalformedURLException ex){
                Logger.getLogger(this.getName()).log(Level.SEVERE,null,ex);
            }
        }

    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:

        logoImage = null;
        imgLogo.setIcon(logoImage);

    }//GEN-LAST:event_btnRemoveActionPerformed
     private void backAction() {
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }
    private void btnUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSupplierActionPerformed
        // TODO add your handling code here:
//        Supplier supplier = supplierDirectory.addSupplier();
        txtName.setEnabled(true);
        jTextArea1.setEnabled(true);
        imgLogo.setEnabled(true);

//        backAction();
        btnSaveSupplier.setEnabled(true);
    }//GEN-LAST:event_btnUpdateSupplierActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnSaveSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSupplierActionPerformed
        // TODO add your handling code here:
        supplier.setSupplyName(txtName.getText());
        supplier.setDes(jTextArea1.getText());
        supplier.setLogoImage(logoImage);
        txtName.setEnabled(false);
        jTextArea1.setEnabled(false);
        imgLogo.setEnabled(false);
        
        JOptionPane.showMessageDialog(this, "Supplier modified added", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSaveSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSaveSupplier;
    private javax.swing.JButton btnUpdateSupplier;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populate() 
    {
        
        txtName.setText(supplier.getSupplyName());
        jTextArea1.setText(supplier.getDes());
        imgLogo.setIcon(supplier.getLogoImage());
    
    }
}

/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package ui.CustomerRole;

import model.Product;
import model.Supplier;
import model.SupplierDirectory;
import ui.CustomerRole.ViewProductDetailJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.MasterOrderList;
import model.OrderItem;
import model.Order;


/**
 *
 * @author Rushabh
 */
public class BrowseProductsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory; 
    MasterOrderList masterOrderList;
    Order currentOrder;
    


    /** Creates new form BrowseProducts */
    public BrowseProductsJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory, MasterOrderList masterOrderList) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.masterOrderList = masterOrderList;
        currentOrder = new Order();
        populateCombo();
        populateProductCatalog();
        populateCartTable();
      
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        lblProductCatalogue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        lblSalesPrice = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        btnProductDetails = new javax.swing.JButton();
        lblItemsInCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        txtNewQuantity = new javax.swing.JTextField();
        btnModifyQuantity = new javax.swing.JButton();
        btnViewOrderItem = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(102, 0, 0));
        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png"))); // NOI18N
        lblTitle.setText("Have a wonderful shopping experience!");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(20);

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSupplier.setForeground(new java.awt.Color(153, 51, 0));
        lblSupplier.setText("Supplier:");

        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        btnSearchProduct.setBackground(new java.awt.Color(204, 255, 204));
        btnSearchProduct.setForeground(new java.awt.Color(153, 51, 0));
        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        lblProductCatalogue.setForeground(new java.awt.Color(153, 51, 0));
        lblProductCatalogue.setText("Product Catalog:");

        tblProductCatalog.setBackground(new java.awt.Color(204, 204, 204));
        tblProductCatalog.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductCatalog);

        lblSalesPrice.setForeground(new java.awt.Color(102, 0, 0));
        lblSalesPrice.setText("Sales Price:");

        lblQuantity.setForeground(new java.awt.Color(102, 0, 0));
        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnAddToCart.setBackground(new java.awt.Color(204, 255, 204));
        btnAddToCart.setForeground(new java.awt.Color(102, 0, 0));
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnProductDetails.setBackground(new java.awt.Color(204, 255, 204));
        btnProductDetails.setForeground(new java.awt.Color(102, 0, 0));
        btnProductDetails.setText("View Product Details");
        btnProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductDetailsActionPerformed(evt);
            }
        });

        lblItemsInCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblItemsInCart.setText("Cart:");

        tblCart.setBackground(new java.awt.Color(204, 204, 204));
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        btnModifyQuantity.setBackground(new java.awt.Color(204, 255, 204));
        btnModifyQuantity.setForeground(new java.awt.Color(102, 0, 0));
        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnViewOrderItem.setBackground(new java.awt.Color(204, 255, 204));
        btnViewOrderItem.setForeground(new java.awt.Color(102, 0, 0));
        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setBackground(new java.awt.Color(204, 255, 204));
        btnRemoveOrderItem.setForeground(new java.awt.Color(102, 0, 0));
        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblProductCatalogue)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearchProduct))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnModifyQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewOrderItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRemoveOrderItem))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblItemsInCart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSalesPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblTitle))
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spnQuantity, txtSalesPrice});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProductCatalogue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductDetails)
                    .addComponent(lblSalesPrice)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart))
                .addGap(18, 18, 18)
                .addComponent(lblItemsInCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewOrderItem)
                    .addComponent(btnRemoveOrderItem)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyQuantity))
                .addGap(18, 18, 18)
                .addComponent(btnCheckOut)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

    }// </editor-fold>//GEN-END:initComponents

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
        populateProductCatalog();
        
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductDetailsActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblProductCatalog.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the item first");
            return;
        }
        
        Product product = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0);
        ViewProductDetailJPanel voip = new ViewProductDetailJPanel(userProcessContainer, product);
        userProcessContainer.add("ViewProductDetailJPanel", voip);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnProductDetailsActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        masterOrderList.addNewOrder(currentOrder);
        currentOrder = new Order();
        
        populateCombo();
        populateProductCatalog();
        populateCartTable();
        
        txtNewQuantity.setText("");
        txtSalesPrice.setText("");
        txtSearch.setText("");
        
        spnQuantity.setValue(0);
        
        JOptionPane.showMessageDialog(this, "Thank you for your purchase");
        
       
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        
       int selectedRowIndex = tblCart.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the order item first");
            return;
        } 
        
        OrderItem orderItem = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0); 
        int quantity = 0;
        
        try{
            quantity = Integer.parseInt(txtNewQuantity.getText());
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please check the modified quantity field.");
            return;
        }
        
        int oldQuant = orderItem.getQuantity();
            if (orderItem.getProduct().getAvail() + oldQuant < quantity) {
                JOptionPane.showMessageDialog(this, "Please check product availability");
                return;
            }
            
        orderItem.getProduct().setAvail(orderItem.getProduct().getAvail()+oldQuant-quantity);
        orderItem.setQuantity(quantity);
        
        populateCartTable();
        populateProductCatalog();
    }//GEN-LAST:event_btnModifyQuantityActionPerformed
   
    
    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed

        String productName = txtSearch.getText();
        populateProductCatalog(productName);
        
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
       
        int selectedRowIndex = tblCart.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the order item first");
            return;
        } 
        
        OrderItem orderItem = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0); 
        int quantity = 0;
        
        orderItem.getProduct().setAvail(orderItem.getProduct().getAvail()+ orderItem.getQuantity());
        currentOrder.deleteItem(orderItem);
        
        populateCartTable();
        populateProductCatalog();
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed

        int selectedRowIndex = tblCart.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the product first");
            return;
        }
        
        OrderItem orderItem = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0);
        ViewOrderItemDetailJPanel vpjp = new ViewOrderItemDetailJPanel(userProcessContainer, orderItem);
        userProcessContainer.add("ViewOrderItemDetailJPanel", vpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblProductCatalog.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the product first");
            return;
        }
        
        Product product = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0); 
        double salesPrice = 0.0;
        int quantity = 0;
        try{
            salesPrice = Double.parseDouble(txtSalesPrice.getText());
            quantity = (Integer) spnQuantity.getValue();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please check the price and quantity fields.");
            return;
        }
        
        if(salesPrice < product.getPrice()){
            JOptionPane.showMessageDialog(this, "Price should be more than it is set in the price.");
            return;
        }
        
        OrderItem item = currentOrder.findProduct(product);
        
        if(item == null) {
            
            if(product.getAvail()>= quantity){
                currentOrder.addNewOrderItem(product, salesPrice, quantity);
                product.setAvail(product.getAvail() - quantity);
            } else {
                JOptionPane.showMessageDialog(this, "Please check the product availability");
                return;
            }
        } else {
            
            int oldQuant = item.getQuantity();
            if (item.getProduct().getAvail() + oldQuant < quantity) {
                JOptionPane.showMessageDialog(this, "Please check product availability");
                return;
            }
            
            item.getProduct().setAvail(item.getProduct().getAvail()+oldQuant-quantity);
            item.setQuantity(quantity);
        }
        populateProductCatalog();
        populateCartTable(); 
    }//GEN-LAST:event_btnAddToCartActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnProductDetails;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblItemsInCart;
    private javax.swing.JLabel lblProductCatalogue;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSalesPrice;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateCombo()
    {
        cmbSupplier.removeAllItems();
        
        for(Supplier s : supplierDirectory.getSupplierlist() ){
            cmbSupplier.addItem(s);
        }
    }

    private void populateProductCatalog() {
        
        Supplier selectedSupplier = (Supplier) cmbSupplier.getSelectedItem();
        
        if(selectedSupplier == null){
            
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);

        for (Product p : selectedSupplier.getProductCatalog().getProductcatalog()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3] = p.getAvail();
            model.addRow(row);
        }
            
    }

    private void populateProductCatalog(String keyword) {
        
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);
        
        for (Supplier s : supplierDirectory.getSupplierlist()){

            for (Product p : s.getProductCatalog().getProductcatalog()) {
                if (p.getProdName().equalsIgnoreCase(keyword)){
                   Object row[] = new Object[4];
                    row[0] = p;
                    row[1] = p.getModelNumber();
                    row[2] = p.getPrice();
                    row[3] = p.getAvail();
                    model.addRow(row);
                } 
            }
                
        
        }
    }
    
    private void populateCartTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        for (OrderItem oi : currentOrder.getOrderItemList()) {
            Object row[] = new Object[4];
            row[0] = oi;
            row[1] = oi.getSalesPrice();
            row[2] = oi.getQuantity();
            row[3] = oi.getQuantity() * oi.getSalesPrice();
            model.addRow(row);
        }
            
    }
    

}

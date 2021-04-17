package com.storesystem.ui;

import com.storesystem.ApplicationHelpers;
import com.storesystem.ApplicationMessages;
import com.storesystem.business.ItemController;
import com.storesystem.business.OrderController;
import com.storesystem.business.OrderItemController;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.model.OrderEntity;
import com.storesystem.persistence.model.OrderItemEntity;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderScreen extends javax.swing.JFrame {
    
    /* Inject the sales screen in the order screen by using spring boot dependency injection */
    @Autowired
    private SalesScreen salesScreen;
    
    /* Inject the order controller in the order screen by using spring boot dependency injection */
    @Autowired
    private OrderController orderController;
    
    /* Inject the item controller in the order screen by using spring boot dependency injection */
    @Autowired
    private ItemController itemController;
    
    @Autowired
    private OrderItemController orderItemController;
    
    private double grandTotal;
    
    /* Creates new form OrderScreen */
    public OrderScreen() {
        initComponents();
        
        /* Make JFrame full screen */
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOrdersHistory = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrderItems = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orders Screen");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Orders History");

        jScrollPane1.setViewportView(lstOrdersHistory);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Current Order(s)");

        tableOrderItems.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableOrderItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR #", "Ordered Item", "Ammount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableOrderItems);

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnComplete.setText("Complete Purchase");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComplete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        initTable();
    }//GEN-LAST:event_formComponentShown

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        // Get selected row from table
        int selectedRow = tableOrderItems.getSelectedRow();
        
        // check if the user has selected any row from table
        if(selectedRow >= 0)
        {
            // Remove the order from the orders list
            ApplicationHelpers.orderedItems.remove(selectedRow);
            
            // Refresh the table
            initTable();
            
            // Show message
            JOptionPane.showMessageDialog(this, "Order removed from the list", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            // Display error to select a row from table
            JOptionPane.showMessageDialog(this, "Please select an order to remove", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // close the order screen
        this.dispose();
        
        // open the sales screen
        salesScreen.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    /*
        This function will be called when a user presses the complete
        purchase button on orders screen. This function will then call
        the business layer controller to add the order in DB along with
        its items
    */
    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        
        OrderEntity order = new OrderEntity();
        order.setGrandTotal(grandTotal);
        
        /* Add a new order */
        OrderEntity addedOrder = orderController.add(order);
        
        /* Add data to order_items table */
        List<ItemEntity> orderedItems = ApplicationHelpers.orderedItems;
        
        List<OrderItemEntity> entities = new ArrayList<>();
        for (ItemEntity item : orderedItems) {
            
            OrderItemEntity entity = new OrderItemEntity();
            
            entity.setOrderId(addedOrder.getId());
            entity.setItemId(item.getId());
            
            entities.add(entity);
        }
        
        ApplicationMessages result = orderItemController.add(entities);
        if(result == ApplicationMessages.DATA_ADDED)
        {
            JOptionPane.showMessageDialog(this, "Order Completed", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Order Purchase Failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void initTable()
    {
        List<ItemEntity> orderedItems = ApplicationHelpers.orderedItems;
        
        DefaultTableModel model = (DefaultTableModel) tableOrderItems.getModel();
        
        int rows = model.getRowCount();
        // Clear the table
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        int count = 0;
        double grandTotal = 0;
        for (ItemEntity item : orderedItems) {
             String orderInfo = "<html> Item: " + item.getTitle() + "<br />"
                    + "Barcode number: " + item.getBarcode()+ "</html>";
             
             double price = item.getPrice();
             double tax = 0.13 * price;
             double total = price + tax;
             
             grandTotal += total;
             
             String ammountInfo = "<html> Price: $" + String.format("%.2f", price) + "<br />"
                    + "Tax: $" + String.format("%.2f", tax) + "<br />"
                    + "Total: $" + String.format("%.2f", total) + "</html>";
             
            Object [] row = {++count, orderInfo, ammountInfo};
            model.addRow(row);
        }
        
        // Set grand total
        this.grandTotal = grandTotal;
        
        Object [] row = {"", "", "Grand Total: $" + String.format("%.2f", grandTotal) };
        model.addRow(row);
        tableOrderItems.setRowHeight(80);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstOrdersHistory;
    private javax.swing.JTable tableOrderItems;
    // End of variables declaration//GEN-END:variables

}

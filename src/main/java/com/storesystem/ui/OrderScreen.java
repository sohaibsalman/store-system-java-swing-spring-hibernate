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
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
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
    
    @Autowired
    private OrderScreen orderScreen;
    
    @Autowired
    private OrderHistoryScreen orderHistoryScreen;
    
    private List<OrderEntity> ordersHistoryList;
    
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnViewOrder = new javax.swing.JButton();

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

        btnRemove.setBackground(new java.awt.Color(204, 0, 0));
        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 153, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnComplete.setBackground(new java.awt.Color(0, 153, 0));
        btnComplete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Orders Screen");
        jPanel3.add(jLabel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnViewOrder.setBackground(new java.awt.Color(102, 102, 255));
        btnViewOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        initTable();
        initHistoryList();
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
            
            // Close the orders screen
            this.dispose();
            
            orderScreen.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Order Purchase Failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    
    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        
        // Get the selected order index from jList
        int selected = lstOrdersHistory.getSelectedIndex();
        
        if(selected >= 0)
        {
            OrderEntity order = ordersHistoryList.get(selected);
            
            // Set values of the form screen
            orderHistoryScreen.getLblDate().setText(order.getOrderDate().toString());
            orderHistoryScreen.getLblID().setText(Long.toString(order.getId()));
            orderHistoryScreen.getLblTotal().setText("$" + Double.toString(order.getGrandTotal()));
            
            // Show the screen
            orderHistoryScreen.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select an order from the history list.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewOrderActionPerformed

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

    private void initHistoryList() {
        /* Get All orders history from DB */
        List<OrderEntity> list = orderController.getAll();
        
        this.ordersHistoryList = list;
        
        DefaultListModel model = new DefaultListModel();
        
        for (OrderEntity order : list) {
            Date orderDate = order.getOrderDate();
            
            // Setup the date
            String month = ApplicationHelpers.months[orderDate.getMonth()];
            int date = orderDate.getDate();
            int year = orderDate.getYear() + 1900;
            
            int hour = orderDate.getHours();
            int minutes = orderDate.getMinutes();
            
            String stamp = hour > 12 ? "PM" : "AM";
            
            // Add the order date to the model
            model.addElement(month + " " + date + ", " + year + " at " + ((hour % 12)) + ":" + minutes + " " + stamp );
        }
        
        lstOrdersHistory.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstOrdersHistory;
    private javax.swing.JTable tableOrderItems;
    // End of variables declaration//GEN-END:variables

    

}

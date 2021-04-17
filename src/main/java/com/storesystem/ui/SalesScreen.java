package com.storesystem.ui;

import com.storesystem.ApplicationHelpers;
import com.storesystem.business.ItemController;
import com.storesystem.persistence.model.ItemEntity;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SalesScreen extends javax.swing.JFrame {

    @Autowired
    private AdminScreen adminScreen;
    
    @Autowired
    private OrderScreen orderScreen;
    
    @Autowired
    private ItemController itemController;
    
    private List<ItemEntity> items;
    
    /**
     * Creates new form SalesDashboard
     */
    public SalesScreen() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Set Current Date
        Date date = new Date();
        String month = ApplicationHelpers.months[date.getMonth()];
        int monthDate = date.getDate();
        int year = date.getYear() + 1900;
        
        // Set label text
        lblDate.setText(lblDate.getText() + " " + month + " " + monthDate + ", " + year);
        
        // Add event listener to JFrame to load the table from db
        this.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent e) {
               // Set name of the logged in user
               lblUser.setText(lblUser.getText() + " " + ApplicationHelpers.username);
               
               // Set account type label
               String accountType = ApplicationHelpers.isAdmin ? "Admin" : "Sales Person";
               lblAccountType.setText(lblAccountType.getText() + " " + accountType); 
               
               // call function to add data in table by fetchin data from db
               initTable(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableItems = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnProceed = new javax.swing.JButton();
        btnAddOrder = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAdminScreen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblScreenHeading = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableItems.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Info", "Item Details", "Item Extras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableItems.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableItems);

        btnProceed.setBackground(new java.awt.Color(0, 153, 51));
        btnProceed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(255, 255, 255));
        btnProceed.setText("Proceed to Order");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddOrder.setBackground(new java.awt.Color(102, 102, 255));
        btnAddOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrder.setText("Add Item to Cart");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        btnAdminScreen.setBackground(new java.awt.Color(204, 109, 0));
        btnAdminScreen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdminScreen.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminScreen.setText("Admin Screen");
        btnAdminScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminScreenActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        lblScreenHeading.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        lblScreenHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblScreenHeading.setText("Store Front – Sales Personnel Login");
        jPanel3.add(lblScreenHeading);

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Logged in as: ");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Today's Date: ");

        lblAccountType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAccountType.setForeground(new java.awt.Color(255, 255, 255));
        lblAccountType.setText("Account Type:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate)
                            .addComponent(lblAccountType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminScreen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdminScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblAccountType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminScreenActionPerformed
        
        // Set size of admin screen to full screen
        adminScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Show admin screen
        adminScreen.setVisible(true);
        
         // close sales screen
        this.dispose();
    }//GEN-LAST:event_btnAdminScreenActionPerformed

    
    /*
        This function will be called when the form is opened
        and visible on screen. Using this function to show
        list of items in table from DB by calling the the 
        ItemsController.
    */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        
        // Get selected row from table
        int selectedRow = tableItems.getSelectedRow();
        
        // check if the user has selected any item from table
        if(selectedRow >= 0)
        {
            ItemEntity selectedItem = items.get(selectedRow);
            
            // Check the quantity of the selected item
            if(selectedItem.getQuantity() == 0)
            {
                // Show out of stock error message
                JOptionPane.showMessageDialog(this, "Selected Item is out of stock...", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                // Add the selected item to the static orders list
                ApplicationHelpers.orderedItems.add(selectedItem);
                
                // Decrease the quantity by one
                selectedItem.setQuantity(selectedItem.getQuantity() - 1);
                items.set(selectedRow, selectedItem);
                
                // Save the decreased quantity in DB
                itemController.update(selectedItem);
                
                // Refresh the table without fetching data from db
                initTable(false);
                
                // Show success message
                JOptionPane.showMessageDialog(this, "Item added to order list", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            // Show error message to select an item
            JOptionPane.showMessageDialog(this, "Please select an item from table", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // close the sales screen
        this.dispose();
        
        // open orders screen
        orderScreen.setVisible(true);
    }//GEN-LAST:event_btnProceedActionPerformed

    private void initTable(boolean fetchFormDB)
    {
        if(fetchFormDB)
        {
            // Get all items from DB by calling the controller
            items = itemController.getAll();
        }
        
        // create data model for the table
        DefaultTableModel model = (DefaultTableModel)tableItems.getModel();
        
        int rows = model.getRowCount();
        // Clear the table
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for (ItemEntity item : items) {
            
            String itemInfo = "<html> Title: " + item.getTitle() + "<br />"
                    + "Color: " + item.getColor() + "</html>";
            
            String itemDetails = "<html> Barcode: " + item.getBarcode() + "<br />"
                    + "Quantity: " + item.getQuantity() + "<br />" 
                    + "Price: $" + item.getPrice() + "</html>";
            
            String itemDesc = "<html> Description: " + item.getDescription() + "<br />"
                    + "<br /> <hr />";
            
            String reason = item.getUnavailableReason();
            itemDesc += "Reason unavailable: ";
            
            if(reason == null || reason.length() == 0)
                itemDesc += "N/A";
            else
                itemDesc += reason;
            
            itemDesc += "</html>";
            
            Object [] row = {item.getId(), itemInfo, itemDetails, itemDesc};
            model.addRow(row);
        }
        
        tableItems.setRowHeight(100);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnAdminScreen;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblScreenHeading;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tableItems;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAdminScreen() {
        return btnAdminScreen;
    }

    public void setBtnAdminScreen(JButton btnAdminScreen) {
        this.btnAdminScreen = btnAdminScreen;
    }

    public JLabel getLblScreenHeading() {
        return lblScreenHeading;
    }

    public void setLblScreenHeading(JLabel lblScreenHeading) {
        this.lblScreenHeading = lblScreenHeading;
    }

    public JLabel getLblDate() {
        return lblDate;
    }

    public void setLblDate(JLabel lblDate) {
        this.lblDate = lblDate;
    }

}

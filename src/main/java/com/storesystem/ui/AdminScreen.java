package com.storesystem.ui;

import com.storesystem.utils.ApplicationHelpers;
import com.storesystem.utils.ApplicationMessages;
import com.storesystem.business.ItemController;
import com.storesystem.business.ItemSizeController;
import com.storesystem.business.SizeController;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.model.ItemSizeEntity;
import com.storesystem.persistence.model.SizeEntity;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AdminScreen extends javax.swing.JFrame {

    @Autowired
    private SalesScreen salesScreen;
    
    @Autowired
    private ItemFormScreen itemFormScreen;
    
    @Autowired
    private ItemController itemController;
    
    @Autowired
    private MarkUnavilableScreen markUnavilableScreen;
    
    @Autowired 
    private SizeController sizeController;
    
    @Autowired
    private ItemSizeController itemSizeController;
    
    @Autowired
    private LoginScreen loginScreen;
    
    private List<ItemEntity> items;
    
    /**
     * Creates new form AdminScreen
     */
    public AdminScreen() {
        initComponents();
        
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
               InitTable();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableItems = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnStore = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblFormHeading = new javax.swing.JLabel();
        lblUsernameMain = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        label123 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        btnUnavailable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 153, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add New Item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tableItems.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Info", "Item Details", "Item Description"
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
        if (tableItems.getColumnModel().getColumnCount() > 0) {
            tableItems.getColumnModel().getColumn(0).setResizable(false);
            tableItems.getColumnModel().getColumn(1).setResizable(false);
            tableItems.getColumnModel().getColumn(2).setResizable(false);
            tableItems.getColumnModel().getColumn(3).setResizable(false);
        }

        btnEdit.setBackground(new java.awt.Color(0, 153, 204));
        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit Item");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Item");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(882, 156));

        btnStore.setBackground(new java.awt.Color(204, 109, 0));
        btnStore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnStore.setForeground(new java.awt.Color(255, 255, 255));
        btnStore.setText("Store Screen");
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        lblFormHeading.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        lblFormHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblFormHeading.setText("Store Backend – Admin Personnel Login ");
        jPanel3.add(lblFormHeading);

        lblUsernameMain.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        lblUsernameMain.setForeground(new java.awt.Color(255, 255, 255));
        lblUsernameMain.setText("Username");
        jPanel3.add(lblUsernameMain);

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Todays Date:");

        label123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label123.setForeground(new java.awt.Color(255, 255, 255));
        label123.setText("Account Type: ");

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Logged in as: ");

        btnLogout.setBackground(new java.awt.Color(102, 153, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("username");

        lblAccountType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAccountType.setForeground(new java.awt.Color(255, 255, 255));
        lblAccountType.setText("type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAccountType))
                    .addComponent(lblUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label123)
                            .addComponent(lblAccountType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate)))
                .addGap(19, 19, 19))
        );

        btnUnavailable.setBackground(new java.awt.Color(102, 102, 255));
        btnUnavailable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUnavailable.setForeground(new java.awt.Color(255, 255, 255));
        btnUnavailable.setText("Mark item unavailable");
        btnUnavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnavailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUnavailable)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Function to redirect back to the sales screen
    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
  
        // Set size of sales screen to full screen
        salesScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Show sales screen
        salesScreen.setVisible(true);
        
        // close admin screen
        this.dispose();
    }//GEN-LAST:event_btnStoreActionPerformed

    // Function to open the Item Form to add a new item in database
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        itemFormScreen.setVisible(true);
        itemFormScreen.isEditing = false;
    }//GEN-LAST:event_btnAddActionPerformed

    /*
        This function will be called when user clicks to edit the item button
    */
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        // Get the index of the selected row from table to delete
        int selectedRow = tableItems.getSelectedRow();
        
        // Check if any row was selected
        if(selectedRow >= 0)
        {
            // Get the id of the item from column ID of table
            Long id = Long.parseLong(tableItems.getModel().getValueAt(selectedRow, 0).toString());
            
            // Get the item data from db
            ItemEntity item = itemController.get(id);
            
            // Fill the form with the selected item values
            itemFormScreen.getTxtBarcode().setText(item.getBarcode());
            itemFormScreen.getTxtTitle().setText(item.getTitle());
            itemFormScreen.getTxtColor().setText(item.getColor());
            itemFormScreen.getTxtQuantity().setText(Integer.toString(item.getQuantity()));
            itemFormScreen.getTxtPrice().setText(Double.toString(item.getPrice()));
            itemFormScreen.getTxtDescription().setText(item.getDescription());
            
            // Set editing mode of items form to true, so that we can
            // call the update method instead of creating a new item.
            itemFormScreen.isEditing = true;
            
            itemFormScreen.lblId.setText(Long.toString(item.getId()));
            
            
            itemFormScreen.setVisible(true);
        }
        else
        {
            // No row was selected from the table, show error message
            JOptionPane.showMessageDialog(this, "Please select a row from table first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    // Function to delete the selected item from table and Database
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        // Get the index of the selected row from table to delete
        int selectedRow = tableItems.getSelectedRow();
        
        // Check if any row was selected
        if(selectedRow >= 0)
        {
            // Get the id of the item from column ID of table
            Long id = Long.parseLong(tableItems.getModel().getValueAt(selectedRow, 0).toString());
            
            // Call the controller to delete the item from DB
            ApplicationMessages result = itemController.delete(id);
            
            if(result == ApplicationMessages.DATA_DELETED)
            {
                // Show success message
                JOptionPane.showMessageDialog(this, "Item Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // Remove the row from the table
                ((DefaultTableModel)tableItems.getModel()).removeRow(selectedRow);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error deleting the item", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            // No row was selected from the table, show error message
            JOptionPane.showMessageDialog(this, "Please select an item from table first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /*
        This function will mark the item unavialbe to purchase
    */
    private void btnUnavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnavailableActionPerformed
        int selected = tableItems.getSelectedRow();
        
        // Check if any item was selected
        if(selected >= 0)
        {
            // Get selected item
            ItemEntity item = items.get(selected);
            
            markUnavilableScreen.item = item;
            markUnavilableScreen.setVisible(true);
        }
        else
        {
            // no item was selected to mark, show error message
            JOptionPane.showMessageDialog(this, "Please select an item from table first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUnavailableActionPerformed

    // function to logout the user and redirect to login screen
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // Close the current screen
        this.dispose();
        
        // Show the login screen
        loginScreen.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        lblUsername.setText(ApplicationHelpers.username);
        lblUsernameMain.setText("(" + ApplicationHelpers.username + ")");
        lblAccountType.setText("Admin Account");
    }//GEN-LAST:event_formComponentShown

    /*
        This function will be called to initialize the admin screen
        table with data. It will call the ItemsController to fetch
        the data from the DB and then display it in the table
    */
    public void InitTable()
    {
        // Get all items from DB by calling the controller
        items = itemController.getAll();
        
        // Get all sizes
        List<SizeEntity> sizes = sizeController.getAllSizes();
        
        // Get all item-size allocation
        List<ItemSizeEntity> itemSizeList = itemSizeController.getAll();
        
        // create data model for the table
        DefaultTableModel model = (DefaultTableModel)tableItems.getModel();
        
        int rows = model.getRowCount();
        // Clear the table
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for (ItemEntity item : items) {
            
            List<String> itemSizeAlloc = new ArrayList<>();
            
            Long id = item.getId();
            
            for (ItemSizeEntity itemSize : itemSizeList) {
                for (SizeEntity size : sizes) {
                    if(itemSize.getItemId() == id && itemSize.getSizeId() == size.getId())
                        itemSizeAlloc.add(Long.toString(size.getSizeNumber()));
                }
            }
            
            String itemInfo = "<html> Title: " + item.getTitle() + "<br />"
                    + "Color: " + item.getColor() + "</html>";
            
            String itemDetails = "<html> Barcode: " + item.getBarcode() + "<br />"
                    + "Quantity: " + item.getQuantity() + "<br />" ;
            
            if(itemSizeAlloc.size() > 0)
            {
                itemDetails += "Sizes: ";
                int i = 0;
                for (String str : itemSizeAlloc) {
                    if(i++ != itemSizeAlloc.size() - 1)
                        itemDetails += str + ", ";
                    else
                        itemDetails += str + "<br />";
                }
            }
            itemDetails += "Price: $" + item.getPrice();
            itemDetails +=  "</html>";
            
            String itemDesc = "<html> Description: " + item.getDescription() + "<br />"
                    + "<br /> <hr />";
            
            String reason = item.getUnavailableReason();
            itemDesc += "Reason unavailable: ";
            
            if(reason == null || reason.length() == 0)
                itemDesc += "N/A";
            else
            {
                Date d = item.getAvailableDate();
                String month = ApplicationHelpers.months[d.getMonth()];
                int date = d.getDate();
                int year = d.getYear() + 1900;
                
                itemDesc += reason + "<br/>";
                itemDesc += "Available on " + month + " " + date + ", " + year;
            }
                
            
            itemDesc += "</html>";
            
            Object [] row = {item.getId(), itemInfo, itemDetails, itemDesc};
            model.addRow(row);
        }
        tableItems.setRowHeight(100);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnStore;
    private javax.swing.JButton btnUnavailable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel label123;
    public javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblFormHeading;
    public javax.swing.JLabel lblUser;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameMain;
    private javax.swing.JTable tableItems;
    // End of variables declaration//GEN-END:variables
}

package com.storesystem.ui;

import com.storesystem.utils.ApplicationHelpers;
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
    
    @Autowired 
    private SizeController sizeController;
    
    @Autowired
    private ItemSizeController itemSizeController;
    
    @Autowired
    private LoginScreen loginScreen;
    
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
        lblUsernameMain = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        label123 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
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

        lblUsernameMain.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        lblUsernameMain.setForeground(new java.awt.Color(255, 255, 255));
        lblUsernameMain.setText("()");
        jPanel3.add(lblUsernameMain);

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Logged in as: ");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Today's Date: ");

        label123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label123.setForeground(new java.awt.Color(255, 255, 255));
        label123.setText("Account Type: ");

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
        lblAccountType.setText("username");

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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label123)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAccountType)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdminScreen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsername)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(lblUsername))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdminScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label123)
                            .addComponent(lblAccountType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate))
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
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

    
    /*
        This function will be called when a user clicks on the search button.
        If the search text field is empty, all items will be displayed. if a
        barcode or title is entered and found in the items list, the respective item
        will be displayed in table
    */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        // Show all items if no text is entered in the search text box
        if(txtSearch.getText().length() == 0)
        {
            initTable(true);
        }
        else
        {
            String text = txtSearch.getText();
            
            List<ItemEntity> temp = new ArrayList<>();
            
            // find the barcode or title in items
            for (ItemEntity item : items) {
                if(item.getBarcode().equals(text) || item.getTitle().equals(text))
                {
                    temp.add(item);
                    break;
                }
            }
            items = temp;
            
            // Refresh the table
            initTable(false);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    // Function to logout the user and show the login screen
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
        // Close the current screen
        this.dispose();
        
        // Show the login screen
        loginScreen.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        lblAccountType.setText(ApplicationHelpers.isAdmin ? "Admin Account" : "Sales Person Account");
        lblUsername.setText(ApplicationHelpers.username);
        lblUsernameMain.setText("(" + ApplicationHelpers.username + ")");
    }//GEN-LAST:event_formComponentShown

    private void initTable(boolean fetchFormDB)
    {
        if(fetchFormDB)
        {
            // Get all items from DB by calling the controller
            items = itemController.getAll();
        }
        
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
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnAdminScreen;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel label123;
    public javax.swing.JLabel lblAccountType;
    public javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblScreenHeading;
    public javax.swing.JLabel lblUser;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameMain;
    private javax.swing.JTable tableItems;
    private javax.swing.JTextField txtSearch;
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

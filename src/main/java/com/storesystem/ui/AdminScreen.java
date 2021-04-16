package com.storesystem.ui;

import com.storesystem.ApplicationMessages;
import com.storesystem.business.ItemController;
import com.storesystem.persistence.model.ItemEntity;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
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
    
    /**
     * Creates new form AdminScreen
     */
    public AdminScreen() {
        initComponents();
        
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

        jLabel1 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnStore = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableItems = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Store Backend – Admin Personnel Login (admin) ");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setText("Today's Date: April 15, 2021");

        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnStore.setText("Store");
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });

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

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                        .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDate))
                    .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
  
        // Set size of sales screen to full screen
        salesScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Show sales screen
        salesScreen.setVisible(true);
        
        // close admin screen
        this.dispose();
    }//GEN-LAST:event_btnStoreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        itemFormScreen.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

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
            JOptionPane.showMessageDialog(this, "Please select a row from table first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /*
        This function will be called to initialize the admin screen
        table with data. It will call the ItemsController to fetch
        the data from the DB and then display it in the table
    */
    public void InitTable()
    {
        // Get all items from DB by calling the controller
        List<ItemEntity> items = itemController.getAll();
        
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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnStore;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JTable tableItems;
    // End of variables declaration//GEN-END:variables
}

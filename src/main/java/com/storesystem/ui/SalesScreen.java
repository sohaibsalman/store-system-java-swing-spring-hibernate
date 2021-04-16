package com.storesystem.ui;

import com.storesystem.business.ItemController;
import com.storesystem.persistence.model.ItemEntity;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SalesScreen extends javax.swing.JFrame {

    @Autowired
    private AdminScreen adminScreen;
    
    @Autowired
    private ItemController itemController;
    
    /**
     * Creates new form SalesDashboard
     */
    public SalesScreen() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblScreenHeading = new javax.swing.JLabel();
        btnAdminScreen = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableItems = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblScreenHeading.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblScreenHeading.setText("Store Front – Sales Personnel Login");

        btnAdminScreen.setText("Admin");
        btnAdminScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminScreenActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setText("Today's Date: ");

        tableItems.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR #", "Item Info", "Item Details", "Item Extras", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableItems.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblScreenHeading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 548, Short.MAX_VALUE)
                        .addComponent(btnAdminScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScreenHeading)
                    .addComponent(btnAdminScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
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
        
        // Get all items from DB by calling the controller
        List<ItemEntity> items = itemController.getAll();
        
        // create data model for the table
        DefaultTableModel model = (DefaultTableModel)tableItems.getModel();
        
        int i = 0;
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
            
            Object [] row = {++i, itemInfo, itemDetails, itemDesc};
            model.addRow(row);
        }
        
        tableItems.setRowHeight(100);
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminScreen;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblScreenHeading;
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


package com.storesystem.ui;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.business.ItemController;
import com.storesystem.business.ItemSizeController;
import com.storesystem.business.SizeController;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.model.ItemSizeEntity;
import com.storesystem.persistence.model.SizeEntity;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ItemFormScreen extends javax.swing.JFrame {
    
    @Autowired
    private SizeController sizeController;
    
    @Autowired
    private ItemController itemController;
    
    @Autowired
    private AdminScreen adminScreen;
    
    @Autowired
    private ItemSizeController itemSizeController;
    
    public boolean isEditing = false;
    
    private List<SizeEntity> sizes;
    
    private List<SizeEntity> sizeAdded;
    
    /** Creates new form ItemFormScreen */
    public ItemFormScreen() {
        initComponents();
        
        lblId.setVisible(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        cboxSizes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSizes = new javax.swing.JList<>();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        chckSize = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("*");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Barcode #");

        txtBarcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Title");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Color");

        txtColor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Description");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        cboxSizes.setEnabled(false);
        cboxSizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSizesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Size");
        jLabel8.setEnabled(false);

        lstSizes.setEnabled(false);
        jScrollPane2.setViewportView(lstSizes);

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(51, 153, 0));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblId.setText("id");

        chckSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chckSize.setText("Add item size?");
        chckSize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chckSizeItemStateChanged(evt);
            }
        });
        chckSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chckSizeStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Items Form");
        jPanel2.add(jLabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Size added");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("*");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("*");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("*");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(171, 171, 171)
                                        .addComponent(lblId)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16))
                                .addComponent(jLabel9)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(chckSize)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboxSizes, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))
                        .addGap(0, 47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblId)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtBarcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chckSize)
                    .addComponent(jLabel8)
                    .addComponent(cboxSizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // Clear the form fields
        clearForm();
        
        // Close the Item Form Screen without saving anything
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        // Check if all required fields are entered or not
        if(txtBarcode.getText().length() == 0 
                || txtColor.getText().length() == 0
                || txtPrice.getText().length() == 0
                || txtQuantity.getText().length() == 0
                || txtTitle.getText().length() == 0
                || txtDescription.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Please fill all the required fields", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            // Create an item object to save it in db
            ItemEntity item = new ItemEntity();

            // Init the item object with the values from UI
            item.setBarcode(txtBarcode.getText());
            item.setTitle(txtTitle.getText());
            item.setColor(txtColor.getText());
            
            // Check if numeric value was entered for quantity
            try {
                item.setQuantity(Integer.parseInt(txtQuantity.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter a numeric value for quantity", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Check if numeric value was entered for price
            try {
                item.setPrice(Double.parseDouble(txtPrice.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter a numeric value for price", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            item.setDescription(txtDescription.getText());
                
            // Check if the form is open in editing mode, then we have to update the item
            if(isEditing)
            {
                // Get id of the item from hidden label
                item.setId(Long.parseLong(lblId.getText()));
                
                ApplicationMessages result = itemController.update(item);
                
                if(result == ApplicationMessages.DATA_UPDATED)
                {
                    // Check if the user has new added sizes for the item, then add it to db
                    if(chckSize.isSelected() && sizeAdded.size() > 0)
                    {
                        List<ItemSizeEntity> list = new ArrayList<>();
                        // Iterate the size added array and make a list to save it in db
                        for (SizeEntity size : sizeAdded) {
                            // Create an object
                            ItemSizeEntity temp = new ItemSizeEntity();

                            // initialize the object
                            temp.setItemId(item.getId());
                            temp.setSizeId(size.getId());

                            // add it to list
                            list.add(temp);
                        }

                        ApplicationMessages res = itemSizeController.add(list);

                        if(res == ApplicationMessages.DATA_ADDED)
                        {
                            // Data updated message
                            JOptionPane.showMessageDialog(this, "Item Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                            adminScreen.InitTable();
                        }
                    }
                    else 
                    {
                        // Data updated message
                        JOptionPane.showMessageDialog(this, "Item Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                        adminScreen.InitTable();
                    }
                    
                }
                else
                {
                    // Error message
                    JOptionPane.showMessageDialog(this, "Error updating the item!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                // Send data to controller to save it in db
                ItemEntity addedItem = itemController.add(item);

                // Check if data was added or not
                if(addedItem != null)
                {              
                    if(chckSize.isSelected() && sizeAdded.size() > 0)
                    {
                        List<ItemSizeEntity> list = new ArrayList<>();
                        // Iterate the size added array and make a list to save it in db
                        for (SizeEntity size : sizeAdded) {
                            // Create an object
                            ItemSizeEntity temp = new ItemSizeEntity();

                            // initialize the object
                            temp.setItemId(addedItem.getId());
                            temp.setSizeId(size.getId());

                            // add it to list
                            list.add(temp);
                        }

                        ApplicationMessages result = itemSizeController.add(list);

                        if(result == ApplicationMessages.DATA_ADDED)
                        {
                            // Data added message
                            JOptionPane.showMessageDialog(this, "Item Added", "Success", JOptionPane.INFORMATION_MESSAGE);
                            adminScreen.InitTable();
                        }
                    }
                    else
                    {
                        // Data added message
                        JOptionPane.showMessageDialog(this, "Item Added", "Success", JOptionPane.INFORMATION_MESSAGE);
                        adminScreen.InitTable();
                    }
                }
                else 
                {
                    // Error message
                    JOptionPane.showMessageDialog(this, "Error adding the item!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            //Clear the form fields
            clearForm();
            
            // Close the Form
            this.dispose();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void chckSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chckSizeStateChanged

    }//GEN-LAST:event_chckSizeStateChanged

    private void chckSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chckSizeItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            cboxSizes.setEnabled(true);
            lstSizes.setEnabled(true);
        }
        else
        {
            cboxSizes.setEnabled(false);
            lstSizes.setEnabled(false);
        }
    }//GEN-LAST:event_chckSizeItemStateChanged

    private void cboxSizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSizesActionPerformed
        
        if(chckSize.isSelected())
        {
            // Get the selected value
            String item = cboxSizes.getSelectedItem().toString();
            
            // Add the selected item to sizeAdded list, which will be used to add sizes in DB
            int index = cboxSizes.getSelectedIndex();
            sizeAdded.add(sizes.get(index));

            // Create data model for list
            DefaultListModel model = new DefaultListModel();

            ListModel lstmodel = lstSizes.getModel();

            // Add already added itms to models
            for (int i = 0; i < lstmodel.getSize(); i++) {
                model.addElement(lstmodel.getElementAt(i));
            }

            // add item to model
            model.addElement(item);

            // set model of the list
            lstSizes.setModel(model);
        }
    }//GEN-LAST:event_cboxSizesActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Create list of new added sizes
        this.sizeAdded = new ArrayList<>();

        // Get list of all sizes from DB
        sizes = sizeController.getAllSizes();
        
        // Init the dropdown for item sizes
        for (SizeEntity size : sizes) {
            cboxSizes.addItem(Integer.toString(size.getSizeNumber()));
        }
        
        // Check if form was opened in editing mode
        if(!isEditing)
        {
            chckSize.setSelected(false);
            
            // Clear jlist for sizes
            lstSizes.setModel(new DefaultListModel<>());
        }
        else
        {
            List<ItemSizeEntity> itemSizeList = itemSizeController.getAll();
            
            List<String> temp = new ArrayList<>();
            
            Long id = Long.parseLong(lblId.getText());
            
            for (ItemSizeEntity itemSize : itemSizeList) {
                for (SizeEntity size : sizes) {
                    if(itemSize.getItemId() == id && itemSize.getSizeId() == size.getId())
                        temp.add(Long.toString(size.getSizeNumber()));
                }
            }
            
            // Set up data model
            DefaultListModel model = new DefaultListModel();
            
            for (String str : temp) {
                model.addElement(str);
            }
            
            lstSizes.setModel(model);
        }
    }//GEN-LAST:event_formComponentShown

    public void clearForm()
    {
        txtBarcode.setText("");
        txtColor.setText("");
        txtDescription.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        txtTitle.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboxSizes;
    private javax.swing.JCheckBox chckSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblId;
    private javax.swing.JList<String> lstSizes;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    public JList<String> getLstSizes() {
        return lstSizes;
    }

    public void setLstSizes(JList<String> lstSizes) {
        this.lstSizes = lstSizes;
    }

    public JTextField getTxtBarcode() {
        return txtBarcode;
    }

    public void setTxtBarcode(JTextField txtBarcode) {
        this.txtBarcode = txtBarcode;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(JTextField txtColor) {
        this.txtColor = txtColor;
    }

    public JTextArea getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(JTextArea txtDescription) {
        this.txtDescription = txtDescription;
    }

    public JTextField getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(JTextField txtPrice) {
        this.txtPrice = txtPrice;
    }

    public JTextField getTxtQuantity() {
        return txtQuantity;
    }

    public void setTxtQuantity(JTextField txtQuantity) {
        this.txtQuantity = txtQuantity;
    }

    public JTextField getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(JTextField txtTitle) {
        this.txtTitle = txtTitle;
    }
}

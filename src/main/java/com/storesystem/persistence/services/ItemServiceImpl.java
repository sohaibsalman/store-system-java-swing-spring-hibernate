/*
    This class implements the interface of Item service.
    It overrides all the methods and give the implementation
    for each method.
*/
package com.storesystem.persistence.services;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{
    
    // Inject the Items repository
    @Autowired
    private ItemRepository repo;

    /*
        Function to add the Item in databse. This function
        will call the save method of Items repository to 
        save the data in DB
    */
    @Override
    public ItemEntity add(ItemEntity item) {
        ItemEntity model;
        
        // Add data to db
        try {
            model = repo.save(item);
        } catch (Exception e) {
            // error occured while adding, return null
            return null;
        }
        
        // data saved successfully, return the Item added in DB
        return model; 
    }

    /*
        Function to get all the Item from databse. This function
        will call the findAll method of Items repository to 
        get the data from DB
    */
    @Override
    public List<ItemEntity> getAll() {
        // Find all the items and return it to the controller
        return repo.findAll();
    }

    /*
        Function to get a single Item from databse. This function
        will call the findById method of Items repository to 
        get single item from DB
    */
    @Override
    public ItemEntity get(Long id) {
        
        // Find the item by id from db, and then return it
        return repo.findById(id).get();
    }

    
    /*
        Function to update an Item in DB. An item object is passed 
        to this function. This function will fetch the item passed 
        from the db, and then update it in the DB
    */
    @Override
    public ApplicationMessages update(ItemEntity item) {
        
        // Get the original item in DB
        ItemEntity itemInDb = repo.findById(item.getId()).get();
        
        // Update the properties of the items in db
        itemInDb.setTitle(item.getTitle());
        itemInDb.setPrice(item.getPrice());
        itemInDb.setQuantity(item.getQuantity());
        itemInDb.setDescription(item.getDescription());
        itemInDb.setColor(item.getColor());
        itemInDb.setAvailableDate(item.getAvailableDate());
        itemInDb.setUnavailableReason(item.getUnavailableReason());
        
        // Save the changes in db
        try {
            repo.save(itemInDb);
        } catch (Exception e) {
            // error saving the changes, return UPDATE_ERROR message 
            return ApplicationMessages.UPDATE_ERROR;
        }
        
        // Changes saved successfully, return DATA_UPDATED message
        return ApplicationMessages.DATA_UPDATED;
    }

    @Override
    public ApplicationMessages delete(Long id) {
        ItemEntity itemInDb = repo.findById(id).get();
        
        
        try {
            repo.delete(itemInDb);

        } catch (Exception e) {
            return ApplicationMessages.DELETE_ERROR;
        }
        return ApplicationMessages.DATA_DELETED;
    }

}
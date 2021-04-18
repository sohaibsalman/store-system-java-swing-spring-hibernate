/*
    This class is an entity for size. It will create the table
    of sizes in the db and create all the columns according to the
    data members mentioned in the class
*/

package com.storesystem.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sizes")
public class SizeEntity {

    public SizeEntity() { }
    
     public SizeEntity(int sizeNumber) {
         this.sizeNumber = sizeNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "size_number")
    private int sizeNumber;
    
    // Getter setters for the entity data members
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSizeNumber() {
        return sizeNumber;
    }

    public void setSizeNumber(int sizeNumber) {
        this.sizeNumber = sizeNumber;
    }
}
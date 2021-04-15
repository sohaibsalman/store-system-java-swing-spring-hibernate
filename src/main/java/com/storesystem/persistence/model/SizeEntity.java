package com.storesystem.persistence.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "size")
public class SizeEntity {

    public SizeEntity() {
    }
    
     public SizeEntity(int sizeNumber) {
         this.sizeNumber = sizeNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "size_number")
    private int sizeNumber;
    
    @ManyToMany(mappedBy = "sizes")
    private Set<ItemEntity> items = new HashSet<>();

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

    public Set<ItemEntity> getItems() {
        return items;
    }

    public void setItems(Set<ItemEntity> items) {
        this.items = items;
    }
}
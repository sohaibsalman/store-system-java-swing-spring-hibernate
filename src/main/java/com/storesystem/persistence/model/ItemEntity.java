package com.storesystem.persistence.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ItemEntity  {

    public ItemEntity() {
    }
    
    public ItemEntity(ItemEntity ref) {
        this.availableDate = ref.getAvailableDate();
        this.barcode = ref.getBarcode();
        this.color = ref.getColor();
        this.description = ref.getDescription();
//        this.orders = ref.getOrders();
        this.price = ref.getPrice();
        this.quantity = ref.getQuantity();
        this.title = ref.getTitle();
        this.unavailableReason = ref.getUnavailableReason();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "barcode")
    private String barcode;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "quantity")
    private int quantity;
    
    @Column(name = "price")
    private double price;
    
    @Column(name = "description")
    private String description;
    
    @Column (name = "unavailable_reason")
    private String unavailableReason;
    
    @Column (name = "available_date")
    private Date availableDate;

//    @ManyToMany(cascade = {
//        CascadeType.ALL
//    }, fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "item_sizes", 
//            joinColumns = {@JoinColumn(name = "item_id")},
//            inverseJoinColumns = {@JoinColumn(name = "size_id")})
//    private Set<SizeEntity> sizes = new HashSet<>();
    
    
//    // Many to many relation for order and items
//    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "items", cascade = { CascadeType.ALL })
//    private Set<OrderEntity> orders = new HashSet<OrderEntity>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnavailableReason() {
        return unavailableReason;
    }

    public void setUnavailableReason(String unavailableReason) {
        this.unavailableReason = unavailableReason;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

//    public Set<SizeEntity> getSizes() {
//        return sizes;
//    }
//
//    public void setSizes(Set<SizeEntity> sizes) {
//        this.sizes = sizes;
//    }

//    public Set<OrderEntity> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(Set<OrderEntity> orders) {
//        this.orders = orders;
//    }
}
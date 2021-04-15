package com.storesystem.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "order_items")
public class OrderItemsEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToMany
    @JoinColumn(name = "order_id")
    private OrdersEntity orders;
    
    @ManyToMany
    @JoinColumn(name = "item_id")
    private ItemEntity items;
}
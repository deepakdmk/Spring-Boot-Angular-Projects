package com.deeps.ecommerce.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    
    @Column(name = "sku")
    private String sku;

    
    @Column(name = "description")
    private String description;

    
    @Column(name = "unit_price")
    private double unitPrice;

    
    @Column(name = "image_url")
    private String imageUrl;
    
    @Column(name = "active")
    private boolean active;
    
    @Column(name = "units_in_stock")
    private int unitsInStock;

    
    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    
    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

}

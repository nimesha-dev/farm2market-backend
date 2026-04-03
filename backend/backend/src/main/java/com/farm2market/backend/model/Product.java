package com.farm2market.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    private String id;        // MongoDB auto-generates this

    private String name;      // Product name
    private double price;     // Product price
    private int quantity;     // Available quantity
    private String farmerId;  // Who added the product

    // Constructors
    public Product() {}

    public Product(String name, double price, int quantity, String farmerId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.farmerId = farmerId;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }
}
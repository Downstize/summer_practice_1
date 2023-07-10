package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "fuel_type", length = 255)
    private String fuel_type;
    @Column(name = "model", length = 255)
    private String model;
    @Column(name = "price", precision = 19, scale = 2)
    private BigDecimal price;
    @Column(name = "type", length = 255)
    private String type;

    protected Vehicle() {}
    protected Vehicle(Long id, String fuel_type,  String model, BigDecimal price, String type) {
        this.id = id;
        this.fuel_type = fuel_type;
        this.model = model;
        this.price = price;
        this.type = type;
    }


    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public String getFuelType() {
        return fuel_type;
    }

    public void setFuelType(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
package org.example.models;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "trucks")
public class Truck extends Vehicle {
    private final static String type = "TRUCK";
    @Column(name = "load_capacity")
    private Double loadCapacity;

    public Truck() {}
    public Truck(Long id,String fuel_type, String model, BigDecimal price){
        super(id,fuel_type,model,price,type);
        setId(id);
        setFuelType(fuel_type);
        setModel(model);
        setPrice(price);
        setLoadCapacityTruck(loadCapacity);
    }

    public String getFuelTypeTruck(){
        return this.getFuelType();
    }

    public String getModelTypeTruck(){
        return this.getModel();
    }

    public Long getIdTruck(){
        return this.getId();
    }

    public BigDecimal getPriceTruck(){
        return this.getPrice();
    }

    public Integer getLoadCapacityTruck () {
        return this.getLoadCapacityTruck();
    }

    public void setLoadCapacityTruck(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setFuelTypeTruck(String FuelType){
        this.setFuelType(FuelType);
    }

    public void setModelTypeTruck(String Model){
        this.setModel(Model);
    }
    public void  setPriceTruck(BigDecimal Price){
        this.setPrice(Price);
    }
}

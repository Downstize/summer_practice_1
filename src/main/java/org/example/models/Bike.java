package org.example.models;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "bikes")
public class Bike extends Vehicle {
    private final static String type = "BIKE";

    public Bike() {}
    public Bike( Long id,String fuel_type, String model, BigDecimal price){
        super(id,fuel_type,model,price,type);
        setId(id);
        setFuelType(fuel_type);
        setModel(model);
        setPrice(price);
    }

    public String getFuelTypeBike(){
        return this.getFuelType();
    }

    public String getModelTypeBike(){
        return this.getModel();
    }

    public Long getIdBike(){
        return this.getId();
    }

    public BigDecimal getPriceBike(){
        return this.getPrice();
    }
}

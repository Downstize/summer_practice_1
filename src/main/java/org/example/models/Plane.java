package org.example.models;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "planes")
public class Plane extends Vehicle {
    private final static String type = "PLANE";

    @Basic
    @Column(name = "airline", length = 255)
    private String airline;
    @Column(name = "passenger_capacity", length = 11)
    private Integer passengerCapacity;

    public Plane() {}
    public Plane(Long id, String fuel_type, String model, BigDecimal price){
        super(id,fuel_type,model,price,type);
        setId(id);
        setFuelType(fuel_type);
        setModel(model);
        setPrice(price);
        setAirlinePlane(airline);
        setPassengerCapacityPlane(passengerCapacity);
    }

    public String getFuelTypePlane(){
        return this.getFuelType();
    }

    public String getModelTypePlane(){
        return this.getModel();
    }

    public Long getIdPlane(){
        return this.getId();
    }

    public BigDecimal getPricePlane(){
        return this.getPrice();
    }

    public String getAirlinePlane() {
        return this.airline;
    }

    public void setAirlinePlane(String airline) {
        this.airline = airline;
    }


    public Integer getPassengerCapacityPlane() {
        return this.passengerCapacity;
    }

    public void setPassengerCapacityPlane(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setFuelTypePlane(String FuelType){
        this.setFuelType(FuelType);
    }

    public void setModelTypePlane(String Model){
        this.setModel(Model);
    }
    public void  setPricePlane(BigDecimal Price){
        this.setPrice(Price);
    }
}

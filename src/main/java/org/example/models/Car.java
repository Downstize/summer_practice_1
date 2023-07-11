package org.example.models;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity @Table(name = "cars")
public class Car extends Vehicle {
    private final static String type = "CAR";

    @Column(name = "seats", length = 11)
    private Integer seats;

    public Car() {}
    public Car(Long id, String fuel_type, String model, BigDecimal price){
        super(id,fuel_type,model,price,type);
        setId(id);
        setFuelType(fuel_type);
        setModel(model);
        setPrice(price);
        setSeatsCar(seats);
    }

    public String getFuelTypeCar(){
        return this.getFuelType();
    }

    public String getModelTypeCar(){
        return this.getModel();
    }

    public Long getIdCar(){
        return this.getId();
    }

    public BigDecimal getPriceCar(){
        return this.getPrice();
    }

    public Integer getSeatsCar() {
        return seats;
    }

    public void setSeatsCar(Integer seats) {
        this.seats = seats;
    }

    public void setFuelTypeCar(String FuelType){
        this.setFuelType(FuelType);
    }

    public void setModelTypeCar(String Model){
        this.setModel(Model);
    }
    public void  setPriceCar(BigDecimal Price){
        this.setPrice(Price);
    }

}
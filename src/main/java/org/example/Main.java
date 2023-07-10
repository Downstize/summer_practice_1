package org.example;

import org.example.models.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_jpa_demo");
             EntityManager em = emf.createEntityManager()) {

            Car car = new Car(1L,"Petrol", "Car Model", BigDecimal.valueOf(35000));
            car.setSeatsCar(7);

            Bike bike = new Bike(2L,"Gasoline", "Bike Model", BigDecimal.valueOf(7200));

            Plane plane = new Plane(3L, "Jet Fuel", "Plane Model", BigDecimal.valueOf(27912000));
            plane.setAirlinePlane("Pobeda");
            plane.setPassengerCapacityPlane(134);

            Truck truck = new Truck(4L,"Diesel", "Truck Model", BigDecimal.valueOf(50000));
            truck.setLoadCapacityTruck(3500.0);

            try {
                em.getTransaction().begin();
                em.merge(car);
                em.merge(bike);
                em.merge(plane);
                em.merge(truck);
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }

            try {
                em.getTransaction().begin();
                List<Car> cars = em.createQuery("FROM Car", Car.class).getResultList();
                for (Car c : cars) {
                    System.out.println(c);
                }
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }

            try {
                em.getTransaction().begin();
                List<Vehicle> vehicles =
                        em.createQuery("FROM Vehicle", Vehicle.class).getResultList();
                for (Vehicle v : vehicles) {
                    System.out.println(v);
                }
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }

        }
    }
}

package com.tryonyourown.builder;

public class Director {
    Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void buildSportsCar() {
        SportsEngine se = new SportsEngine();
        se.setEngineType("Sports");
        car.setEngine(se).setSeats(2).setGPS(true).setTripComputer(true);
    }
    public void buildSUVCar() {
        SUVEngine sue = new SUVEngine();
        sue.setEngineType("SUV");
        car.setEngine(sue);
        car.setSeats(7).setGPS(true).setTripComputer(true);
    }
}

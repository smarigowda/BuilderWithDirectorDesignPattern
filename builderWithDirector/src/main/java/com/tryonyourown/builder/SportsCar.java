package com.tryonyourown.builder;

public class SportsCar implements Car{
    int seats;
    boolean isGPSInstalled;
    boolean isTripComputerInstalled;
    Engine engineType;
    public Car setSeats(int seats) {
        this.seats = seats;
        return this;
    }
    public Car setGPS(boolean isGPSIncluded) {
        this.isGPSInstalled = isGPSIncluded;
        return this;
    }
    public Car setTripComputer(boolean isTripComputerIncluded) {
        this.isTripComputerInstalled = isTripComputerIncluded;
        return this;
    }
    public Car setEngine(Engine engineType) {
        this.engineType = engineType;
        return this;
    }
    public String start() {
        return "Sports Car started...";
    }
    public Car getProduct() {
        return this;
    }
}

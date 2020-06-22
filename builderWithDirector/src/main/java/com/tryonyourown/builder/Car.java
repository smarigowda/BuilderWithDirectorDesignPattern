package com.tryonyourown.builder;

public interface Car {
    public Car setSeats(int seats);
    public Car setGPS(boolean isGPSIncluded);
    public Car setTripComputer(boolean isTripComputerIncluded);
    public Car setEngine(Engine engineType);
    public Car getProduct();
    public String start();
}

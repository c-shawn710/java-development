package com.pluralsight;

public class Hovercraft extends Vehicles {
    boolean wheels = false;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean wheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.wheels = wheels;
    }
}

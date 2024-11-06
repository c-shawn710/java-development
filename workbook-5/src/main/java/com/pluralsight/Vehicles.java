package com.pluralsight;

public class Vehicles {
    String color;
    int numberOfPassengers;
    int cargoCapacity;
    int fuelCapacity;

    public Vehicles(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return this.color + "\n" + this.numberOfPassengers + "\n" + this.cargoCapacity + "\n" + this.fuelCapacity;
    }

    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 2, 1, 50);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide);
        System.out.println(slowRide.color + slowRide.fuelCapacity);
    }
}

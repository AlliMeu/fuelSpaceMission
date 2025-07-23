package com.alli.bookmanager;

public class Spacecraft {
    private String spacecraftName;
    private double fuelLevel;
    private boolean isSpacecraftOperational;
    private double distance;


    public Spacecraft(String spacecraftName) {
        this.spacecraftName = spacecraftName;
        this.fuelLevel = 1000.0;
        this.isSpacecraftOperational = true;
        this.distance = 0.0;
    }

    public Spacecraft() {
        this("Les Toucs");
    }


    public double calculateFuelConsumption(double distance) {

        return distance * 100;

    }

    public void updateSpacecraftStatus(double fuelUsed) {
        this.fuelLevel -= fuelUsed;
        this.isSpacecraftOperational = this.fuelLevel > 0;

    }

    public void travel(double distance) {
        if (distance <= 0) {
            System.out.println("Distance must be positive.");
            return;
        }

        double fuelNeeded = calculateFuelConsumption(distance);

        if (fuelNeeded <= fuelLevel) {
            fuelLevel -= fuelNeeded;
            this.distance += distance;
            isSpacecraftOperational = fuelLevel > 0;
        } else {
            System.out.println("Not enough fuel to travel this distance.");
            isSpacecraftOperational = false;
        }

    }



        public boolean isSpacecraftOperational() {
        return isSpacecraftOperational;
    }


    public String getSpacecraftName() {
        return spacecraftName;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }


    public double getDistance() {
        return distance;
    }



}
package com.alli.bookmanager;

public class Planets {

    private String planetName;
    private double distanceFromEarth;

    public Planets(String planetName, double distanceFromEarth) {
        this.planetName = planetName;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getPlanetName() {
        return planetName;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }



}

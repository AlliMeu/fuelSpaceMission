package com.alli.bookmanager;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MissionControl {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft("Les Pépitosss");
//        spacecraft.travel(10000);
        List<Planets> planets = new ArrayList<>();
        planets.add(new Planets("Mercury", 57.91));
        planets.add(new Planets("Venus", 108.2));
        planets.add(new Planets("Earth", 149.6));
        planets.add(new Planets("Mars", 227.9));
        planets.add(new Planets("Jupiter", 7783.3));
        planets.add(new Planets("Saturn", 14266.2));
        planets.add(new Planets("Uranus", 28746.4));
        planets.add(new Planets("Neptune", 45036.5));

        for (Planets planet : planets) {
            System.out.println("Planet: " + planet.getPlanetName() + " - Distance: " + planet.getDistanceFromEarth());
        }




    }
}
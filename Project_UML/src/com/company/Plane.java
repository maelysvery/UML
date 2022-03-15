package com.company;

import java.util.Random;

public class Plane {

    public String plane_name;
    public int fuel_left;
    public int runway_time;
    public int passengers;

    public Plane(){


    }

    public String getPlane_name() {
        return plane_name;
    }

    public void setPlane_name(String plane_name) {
        this.plane_name = plane_name;
    }

    public int getFuel_left() {
        return fuel_left;
    }

    public void setFuel_left(int fuel_left) {
        this.fuel_left = fuel_left;
    }

    public int getRunway_time() {
        return runway_time;
    }

    public void setRunway_time(int runway_time) {
        this.runway_time = runway_time;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int random(int min, int max){

        Random random = new Random();

        return random.nextInt(max - min + 1) + min;
    }

    public void setPlaneLanding(){

        this.fuel_left = random(3, 5);
        this.runway_time = random(1, 4);
        this.passengers = random(100, 500);

    }

    public void setEmergencyLanding(){

        this.fuel_left = random(1, 3);
        this.runway_time = random(3, 5);
        this.passengers = random(100, 500);

    }

    public void setJumboJet(){

        this.fuel_left = random(4, 6);
        // this.runway_time = random(3, 5);
        this.passengers = random(300, 600);

    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class AdvanceHourScreen {

    public int time = 0;
    public static int nb_requests = 0;
    public static int nb_passengers;

    public AdvanceHourScreen(){

    }

    public AdvanceHourScreen(int time, int nbRequests, int nbPassengers){

        this.time = time;
        nb_requests = nbRequests;
        nb_passengers = nbPassengers;
    }

    public AdvanceHourScreen(int time, int nb_passengers){

        this.time = time;
        nb_passengers = nb_passengers;

        Random number = new Random();
        int min = 1;
        int max = 3;
        this.nb_requests = number.nextInt(max - min + 1) + min;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int hour) {
        this.time = hour;
    }

    public int getNb_requests() {
        return nb_requests;
    }

    public void setNb_requests(int nb_requests) {
        this.nb_requests = nb_requests;
    }

    public int getNb_passengers() {
        return nb_passengers;
    }

    public void setNb_passengers(int nb_passengers) {this.nb_passengers = nb_passengers;}

    public void main(){

        // Advancing hour for waiting planes

        WaitingPlanes waitingPlanes = new WaitingPlanes();
        waitingPlanes.removeFuel(1);

        Plane[] wPlanes = waitingPlanes.getPlane();
        if (wPlanes != null)
        {
            for (Plane plane : wPlanes)
            {
                if (plane.getFuel_left() <= 0)
                {
                    nb_passengers += plane.getPassengers();
                    waitingPlanes.deleteWaitingPlane(plane);
                }
            }
        }

        // Advancing hour for planes on the runway

        RunwayMenu runwayMenu = new RunwayMenu();
        RunwayMenu.removeWaitingTime(1);

        Plane[] rPlanes = runwayMenu.getRunway();
        for (Plane plane : rPlanes)
        {
            if (plane != null)
            {
                if (plane.getRunway_time() <= 0)
                {
                    RunwayMenu.removePlane(plane);
                }
            }
        }


        System.out.println("\nNext hour\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Current time : " + (time));

        RequestMenu requestMenu = new RequestMenu();

        Random number = new Random();
        int min = 1;
        int max = 3;
        nb_requests = number.nextInt(max - min + 1) + min;

        System.out.println("Number of new requests coming in : " + nb_requests);

        System.out.println("Number of passengers dead from waiting planes crashing : " + nb_passengers);

        if(nb_passengers >= 350){

            System.out.println("\nGame over");
            System.exit(0);

        }

        else if(time > 24){

            System.out.println("\nVictory message");
            System.exit(0);

        }

    }
}

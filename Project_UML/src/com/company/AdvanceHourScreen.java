package com.company;

import java.util.Scanner;

public class AdvanceHourScreen {

    public int time = 0;
    public int nb_requests = 0;
    public int nb_passengers = 0;

    public AdvanceHourScreen(int time, int nb_requests, int nb_passengers){

        this.time = time;
        this.nb_requests = nb_requests;
        this.nb_passengers = nb_passengers;
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

    public void setNb_passengers(int nb_passengers) {
        this.nb_passengers = nb_passengers;
    }

    public void main(){

        System.out.println("\nNext hour\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Current time : " + (time));

        RequestMenu requestMenu = new RequestMenu();
        nb_requests = requestMenu.getRandom_number();
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

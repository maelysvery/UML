package com.company;

import java.util.Scanner;

public class AdvanceHourScreen {

    private int time;
    private int nb_requests;
    private int nb_passengers;

    public AdvanceHourScreen(int time, int nb_requests, int nb_passengers){

        this.time = time;
        this.nb_requests = nb_requests;
        this.nb_passengers = nb_passengers;
    }

    public void main(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Current time : " + time);
        System.out.println("Number of new requests coming in : " + nb_requests);
        System.out.println("Number of passengers dead from waiting planes crashing : " + nb_passengers);

        if(nb_passengers >= 350){

            System.out.println("\nGame over");
            System.exit(0);

        }

        else if(nb_passengers < 350){

            String[] args = new String[0];

            Main.main(args);

        }

        else if(time > 24){

            System.out.println("\nVictory message");
            System.exit(0);

        }



    }
}

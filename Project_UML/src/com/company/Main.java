package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hour = 0;
        int nb_passengers = 0;
        int nb_requests = 0;
        int choice1 = 0;
        int again = 1;
        int random_number = 0;

        while (again == 1){

            Random number = new Random();
            int min = 1;
            int max = 3;
            random_number = number.nextInt(max - min + 1) + min;

            System.out.println("\n------------------------------------------------");
            System.out.print("\nNumber of requests received : " + random_number + "\n");

            Scanner scanner = new Scanner(System.in);
            AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen(hour, nb_requests, nb_passengers);

            while(random_number != 0){
                hour = advanceHourScreen.getTime();
                nb_passengers = advanceHourScreen.getNb_passengers();
                System.out.println("\n\t\t\t\t\t\t" + "Hour : " + hour + ", Passengers killed : " + nb_passengers);

                System.out.println("1) Go to Request Menu");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Quit");
                System.out.print("\nEnter your choice : ");

                choice1 = scanner.nextInt();

                switch (choice1){
                    case 1:

                        RequestMenu requestMenu = new RequestMenu();
                        requestMenu.requests();
                        random_number--;

                        break;

                    case 2:

                        WaitingPlanes waitingPlanes = new WaitingPlanes();
                        waitingPlanes.main();

                        break;

                    case 3:

                        RunwayMenu runwayMenu = new RunwayMenu();
                        runwayMenu.main();

                        break;

                    case 4:

                        again = 0;

                        break;

                    default:
                        System.out.println("\nIncorrect choice. Select again please.");
                }

            }

            if(random_number == 0){
                System.out.println("\n------------------------------------------------\n");
                System.out.println("1) Advance to next hour");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Quit");
                System.out.print("\nEnter your choice : ");
                choice1 = scanner.nextInt();

                switch (choice1){
                    case 1:

                        hour++;

                        advanceHourScreen.setTime(hour);
                        advanceHourScreen.setNb_passengers(nb_passengers);

                        advanceHourScreen.main();

                        break;


                    case 2:

                        WaitingPlanes waitingPlanes = new WaitingPlanes();
                        waitingPlanes.main();

                        break;

                    case 3:

                        RunwayMenu runwayMenu = new RunwayMenu();
                        runwayMenu.main();

                        break;

                    case 4:
                        again = 0;
                        break;

                    default:
                        System.out.println("\nIncorrect choice. Select again please.");
                }
            }
        }
    }
}

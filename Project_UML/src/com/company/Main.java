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

        // Declaring ANSI_RESET so that we can reset the color
        String ANSI_RESET = "\u001B[0m";
  
        // Declaring the color
        // Custom declaration
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m	";

        AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen(hour, nb_passengers);

        while (again == 1){

            random_number = advanceHourScreen.getNb_requests();

            System.out.println(ANSI_RESET+"\n------------------------------------------------");
            System.out.print("\nNumber of requests received : " + random_number + "\n");

            Scanner scanner = new Scanner(System.in);


            while(random_number != 0){
                hour = advanceHourScreen.getTime();
                nb_passengers = advanceHourScreen.getNb_passengers();
                System.out.println("\n\t\t\t\t\t\t" + "Hour : " + hour + ", Passengers killed : " + nb_passengers);

                System.out.println(ANSI_RESET+"1) Go to Request Menu");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Quit");
                System.out.print("\nEnter your choice : ");

                choice1 = scanner.nextInt();

                while (choice1 !=1 && choice1 !=2 && choice1 != 3 && choice1 != 4){
                    System.out.println(ANSI_RED+"----------------");
                    System.out.println(ANSI_RED+"ERROR !");
                    System.out.println(ANSI_RED+"----------------");
                    System.out.println(ANSI_RESET+"\n------------------------------------------------\n");
                    System.out.println(ANSI_RESET+"1) Go to Request Menu");
                    System.out.println("2) Go to Waiting Planes Menu");
                    System.out.println("3) Go to Runway Menu");
                    System.out.println("4) Quit");
                    System.out.print("\nEnter your choice : ");
                    choice1 = scanner.nextInt();
                }

                switch (choice1){
                    case 1:
                        System.out.println(ANSI_YELLOW+"\nRequest Menu\n");

                        RequestMenu requestMenu = new RequestMenu();
                        requestMenu.requests();
                        random_number--;

                        break;

                    case 2:
                        System.out.println(ANSI_CYAN+"\nWaitings Planes\n");

                        WaitingPlanes waitingPlanes = new WaitingPlanes();
                        waitingPlanes.main();

                        break;

                    case 3:
                        System.out.println(ANSI_RED+"\nRunway Menu\n");

                        RunwayMenu runwayMenu = new RunwayMenu();
                        runwayMenu.main();

                        break;

                    case 4:
                        System.exit(0);

                        again = 0;

                        break;

                    default:
                        System.out.println("\nIncorrect choice. Select again please.");
                }

            }

            if(random_number == 0){
                System.out.println(ANSI_RESET+"\n------------------------------------------------\n");
                System.out.println("1) Advance to next hour");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Quit");
                System.out.print("\nEnter your choice : ");
                choice1 = scanner.nextInt();

                switch (choice1){
                    case 1:
                        System.out.println(ANSI_YELLOW+"\nAdvance to next hour\n");

                        hour++;

                        advanceHourScreen.setTime(hour);
                        advanceHourScreen.setNb_passengers(nb_passengers);

                        advanceHourScreen.main();

                        break;


                    case 2:
                        System.out.println(ANSI_CYAN+"\nWaiting Planes Menu\n");

                        WaitingPlanes waitingPlanes = new WaitingPlanes();
                        waitingPlanes.main();

                        break;

                    case 3:
                        System.out.println(ANSI_CYAN+"\nRunway Menu\n");

                        RunwayMenu runwayMenu = new RunwayMenu();
                        runwayMenu.main();

                        break;

                    case 4:
                        System.exit(0);
                        again = 0;
                        break;

                    default:
                        System.out.println(ANSI_RESET+"\nIncorrect choice. Select again please.");
                }
            }
        }
    }
}

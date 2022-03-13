package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hour = 0;
        int nb_passengers = 0;
        int nb_requests = 0;
        int choice1 = 0;
        int again = 1; 

        // Declaring ANSI_RESET so that we can reset the color
        String ANSI_RESET = "\u001B[0m";
  
        // Declaring the color
        // Custom declaration
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m	";



        while (again == 1){

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\t\t\t\t\t\t" + hour + "," + nb_passengers);

            System.out.println(ANSI_RESET+"1) Go to Request Menu");
            System.out.println("2) Go to Waiting Planes Menu");
            System.out.println("3) Go to Runway Menu");
            System.out.println("4) Advance to next hour");
            System.out.println("5) Quit");
            System.out.print("\nEnter your choice : ");
            choice1 = scanner.nextInt();

            while (choice1 !=1 && choice1 !=2 && choice1 != 3 && choice1 != 4 && choice1 != 5){
                System.out.println(ANSI_RED+"----------------");
                System.out.println(ANSI_RED+"ERROR !");
                System.out.println(ANSI_RED+"----------------");
                System.out.println(ANSI_RESET+"1) Go to Request Menu");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Advance to next hour");
                System.out.println("5) Quit");
                System.out.print("\nEnter your choice (1 to 5): ");
                choice1 = scanner.nextInt();
            }

            switch (choice1){
                case 1:

                    System.out.println(ANSI_YELLOW+"\nRequest Menu\n");

                    int random_number = 0;
                    RequestMenu requestMenu = new RequestMenu(random_number);
                    requestMenu.main();
                    break;

                case 2:

                    System.out.println(ANSI_CYAN+"\nWaitings Planes\n");

                    WaitingPlanes.main();

                    break;

                case 3:

                    System.out.println(ANSI_RED+"\nRunway Menu\n");

                    RunwayMenu.main();

                    break;

                case 4:

                    System.out.println(ANSI_GREEN+"\nNext hour\n");

                    AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen(hour, nb_requests, nb_passengers);
                    advanceHourScreen.main();

                    break;

                case 5:
                    again = 0;
                    break;

                default:
                    System.out.println("\nIncorrect choice. Please select again.");
            }

        }

    }

}

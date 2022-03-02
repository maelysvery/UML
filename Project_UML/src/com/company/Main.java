package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hour = 0;
        int nb_passengers = 0;
        int nb_requests = 0;
        int choice1 = 0;
        int again = 1;

        while (again == 1){

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\t\t\t\t\t\t" + hour + "," + nb_passengers);

            System.out.println("1) Go to Request Menu");
            System.out.println("2) Go to Waiting Planes Menu");
            System.out.println("3) Go to Runway Menu");
            System.out.println("4) Advance to next hour");
            System.out.println("5) Quit");
            System.out.print("\nEnter your choice : ");
            choice1 = scanner.nextInt();

            switch (choice1){
                case 1:

                    System.out.println("\nRequest Menu\n");

                    int random_number = 0;
                    RequestMenu requestMenu = new RequestMenu(random_number);
                    requestMenu.main();
                    break;

                case 2:

                    System.out.println("\nWaitings Planes\n");

                    WaitingPlanes.main();

                    break;

                case 3:

                    System.out.println("\nRunway Menu\n");

                    RunwayMenu.main();

                    break;

                case 4:

                    System.out.println("\nNext hour\n");

                    AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen(hour, nb_requests, nb_passengers);
                    advanceHourScreen.main();

                    break;

                case 5:
                    again = 0;
                    break;

                default:
                    System.out.println("\nIncorrect choice. Select again please.");
            }

        }

    }

}

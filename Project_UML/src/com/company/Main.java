package com.company;

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
            RequestMenu request = new RequestMenu();
            request.main();
            random_number = request.getRandom_number();

            System.out.println("\n------------------------------------------------");
            System.out.print("\nRandom number received : " + random_number + "\n");

            if (random_number == 1){
                System.out.println("1 request");
            }

            else if(random_number == 2){
                System.out.println("2 requests");
            }

            else if(random_number == 3){
                System.out.println("3 requests");
            }

            Scanner scanner = new Scanner(System.in);
            AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen(hour, nb_requests, nb_passengers);
            hour = advanceHourScreen.getTime();
            nb_passengers = advanceHourScreen.getNb_passengers();
            System.out.println("\n\t\t\t\t\t\t" + hour + "," + nb_passengers);

            if(random_number != 0){

                System.out.println("1) Go to Request Menu");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Quit");
                System.out.print("\nEnter your choice : ");
                choice1 = scanner.nextInt();

                switch (choice1){
                    case 1:

                        System.out.println("\nRequest Menu\n");

                        RequestMenu requestMenu = new RequestMenu();
                        requestMenu.requests(random_number  );
                        break;

                    case 2:

                        System.out.println("\nWaitings Planes\n");

                        WaitingPlanes waitingPlanes = new WaitingPlanes();
                        waitingPlanes.main();

                        break;

                    case 3:

                        System.out.println("\nRunway Menu\n");

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

            else if(random_number == 0){
                System.out.println("1) Advance to next hour");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Quit");
                System.out.print("\nEnter your choice : ");
                choice1 = scanner.nextInt();

                switch (choice1){
                    case 1:

                        System.out.println("\nNext hour\n");

                        advanceHourScreen.main();

                        advanceHourScreen.setTime(hour + 1);

                        break;


                    case 2:

                        System.out.println("\nWaitings Planes\n");

                        WaitingPlanes waitingPlanes = new WaitingPlanes();
                        waitingPlanes.main();

                        break;

                    case 3:

                        System.out.println("\nRunway Menu\n");

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

/* 

This simulated training software is an air traffic controller
Students: Gwendal, Erman, Lindsay and Maëlys
Group A

*/


package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hour = 0;
        int nb_passengers = 0;
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

        AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen(hour, nb_passengers);

        while (again == 1){

            random_number = advanceHourScreen.getNb_requests();

            Scanner scanner = new Scanner(System.in);


            while(random_number != 0){

                System.out.println(ANSI_RESET+"\n\n          ✈︎               ✈︎               ✈︎               ✈︎             ✈︎");
                System.out.println(ANSI_RESET+" ————————————————————————————————————————————————————————————————————————————————");
                System.out.println(ANSI_RESET+"|\t\t\t\t\t\t\t\t\t\t |");
                System.out.print("| Number of requests received : " + random_number +"\t\t\t\t\t\t |");
                
                hour = advanceHourScreen.getTime();
                nb_passengers = advanceHourScreen.getNb_passengers();
                System.out.println("\n"+"|"+"\t\t\t\t\t\t" + "Hour : " + hour + ", Passengers killed : " + nb_passengers + "\t |");

                System.out.println(ANSI_RESET+"| 1) Go to Request Menu\t\t\t\t\t\t\t\t |");
                System.out.println("| 2) Go to Waiting Planes Menu\t\t\t\t\t\t\t |");
                System.out.println("| 3) Go to Runway Menu\t\t\t\t\t\t\t\t |");
                System.out.println("| 4) Quit\t\t\t\t\t\t\t\t\t |");
                System.out.println(ANSI_RESET+"|\t\t\t\t\t\t\t\t\t\t |");
                System.out.print("| Enter your choice:\t\t\t\t\t\t\t         |");
                
                System.out.println(ANSI_RESET+"\n ————————————————————————————————————————————————————————————————————————————————");

                choice1 = scanner.nextInt();

                
                while (choice1 !=1 && choice1 !=2 && choice1 != 3 && choice1 != 4){
                    System.out.println(ANSI_RESET+"\n\n          ✈︎               ✈︎               ✈︎               ✈︎             ✈︎");
                    System.out.println(ANSI_RESET+" ————————————————————————————————————————————————————————————————————————————————");
                    System.out.println(ANSI_RESET+"|\t\t\t\t\t\t\t\t\t\t |");
                    System.out.print("| Number of requests received : " + random_number +"\t\t\t\t\t\t |");
                    
                    hour = advanceHourScreen.getTime();
                    nb_passengers = advanceHourScreen.getNb_passengers();
                    System.out.println("\n"+"|"+"\t\t\t\t\t\t" + "Hour : " + hour + ", Passengers killed : " + nb_passengers + "\t |");
    
                    System.out.println(ANSI_RESET+"| 1) Go to Request Menu\t\t\t\t\t\t\t\t |");
                    System.out.println("| 2) Go to Waiting Planes Menu\t\t\t\t\t\t\t |");
                    System.out.println("| 3) Go to Runway Menu\t\t\t\t\t\t\t\t |");
                    System.out.println("| 4) Quit\t\t\t\t\t\t\t\t\t |");
                    System.out.println(ANSI_RESET+"|\t\t\t\t\t\t\t\t\t\t |");
                    System.out.print("| Enter your choice:\t\t\t\t\t\t\t         |");
                    
                    System.out.println(ANSI_RESET+"\n ————————————————————————————————————————————————————————————————————————————————");
    
                    choice1 = scanner.nextInt();
                }

                switch (choice1){
                    case 1:
                        System.out.println(ANSI_YELLOW+"\n\n\n\n\n\n\n\n\n\n");
                        System.out.println(ANSI_YELLOW+"\n=============================================================================\n");
                        RequestMenu requestMenu = new RequestMenu();
                        requestMenu.requests();
                        random_number--;

                        break;

                    case 2:
                        System.out.println(ANSI_CYAN+"\n\n\n\n\n\n\n\n\n\n");
                        System.out.println(ANSI_CYAN+"\n=============================================================================\n");

                        WaitingPlanes waitingPlanes = new WaitingPlanes();
                        waitingPlanes.main();

                        break;

                    case 3:
                        System.out.println(ANSI_RED+"\n\n\n\n\n\n\n\n\n\n");
                        System.out.println(ANSI_RED+"\n=============================================================================\n");

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
                System.out.println(ANSI_RESET+"\n\n\n\n\n\n\n\n\n\n");
                System.out.println(ANSI_RESET+"————————————————————————————————————————————————————————————————————————————————");
                System.out.println("1) Advance to next hour");
                System.out.println("2) Go to Waiting Planes Menu");
                System.out.println("3) Go to Runway Menu");
                System.out.println("4) Quit");
                System.out.print("\nEnter your choice : ");
                System.out.println(ANSI_RESET+"\n————————————————————————————————————————————————————————————————————————————————");
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

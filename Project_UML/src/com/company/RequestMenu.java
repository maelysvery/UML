package com.company;

import java.util.Random;
import java.util.Scanner;

public class RequestMenu {



    public void requests(){

        Random random1 = new Random();
        int game1 = random1.nextInt(99) + 1;

        if(game1 < 40){
            request1();
        }

        else if(game1 < 45){
            request2();
        }

        else if (game1 < 55) {
            request3();

        }
        else if (game1 < 70){
            request4();
        }

        else if (game1 < 80){
            request5();
        }

        else if (game1 < 90){
            request6();
        }

        else if (game1 < 95){
            request7();
        }

        else{
            request8();
        }
    }

    public void request1(){

        Scanner scanner =  new Scanner(System.in);

        Plane plane = new Plane();
        plane.setPlaneLanding();

        System.out.println("Request 1 : Plane Landing");
        System.out.println("Description : Plane requests to land. It has " + plane.getFuel_left() +
                " hours of fuel left to wait. It needs " + plane.getRunway_time() + " hours of runway time. It has " +
                plane.getPassengers() + " passengers");
        System.out.println("Option A : Allow landing");
        System.out.println("Option B : Place on standby\n");

        RunwayMenu runwayMenu = new RunwayMenu();
        WaitingPlanes waitingPlanes = new WaitingPlanes();

        boolean test = false;

        while(!test){

            System.out.print("Enter your choice (A or B) : ");
            String choice = scanner.nextLine();

            if (choice.equals("A")) {
                int freeRunways = runwayMenu.runway_availability();
                if(freeRunways == -1){
                    System.out.println("There is no empty runway");
                }
                else{
                    System.out.println("Landing on the runway number " + (freeRunways + 1));
                    runwayMenu.addPlane(freeRunways, plane);
                    test = true;
                }
            }
            else if (choice.equals("B")){
                System.out.println("Adding to waiting planes");
                waitingPlanes.addWaitingPlane(plane);
                test = true;
            }
        }
        System.out.println("\n");
    }

    public void request2(){

        Scanner scanner =  new Scanner(System.in);

        Plane plane = new Plane();
        plane.setEmergencyLanding();

        System.out.println("Request 2 : Emergency landing");
        System.out.println("Description : Plane requests to land. It has " + plane.getFuel_left() + "hours of fuel left to wait. It requires " +
                plane.getRunway_time() + " hours of runway time. It has " + plane.getPassengers() + " passengers");
        System.out.println("Option A : Allow landing");
        System.out.println("Option B : Place on standby\n");

        RunwayMenu runwayMenu = new RunwayMenu();
        WaitingPlanes waitingPlanes = new WaitingPlanes();

        boolean test = false;

        while(!test){

            System.out.print("Enter your choice (A or B) : ");
            String choice = scanner.nextLine();

            if (choice.equals("A")) {
                int freeRunways = runwayMenu.runway_availability();
                if(freeRunways == -1){
                    System.out.println("There is no empty runway");
                }
                else{
                    System.out.println("Landing on the runway number " + (freeRunways + 1));
                    runwayMenu.addPlane(freeRunways, plane);
                    test = true;
                }
            }
            else if (choice.equals("B")){
                System.out.println("Adding to waiting planes");
                waitingPlanes.addWaitingPlane(plane);
                test = true;
            }
        }

        System.out.println("\n");

    }

    public void request3(){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Request 3 : Funding Event");
        System.out.println("Description : Increase in funding allows for one of the following bonuses");
        System.out.println("Option A : Empty random runway");
        System.out.println("Option B : Rescue team");
        System.out.println("Option C : Air refueling\n");

        System.out.println("\n");

        RunwayMenu runwayMenu = new RunwayMenu();

        boolean test = false;

        while(!test){

            System.out.print("Enter your choice (A, B or C) : ");
            String choice = scanner.nextLine();

            if (choice.equals("A")) {
                int randomRunway = runwayMenu.empty_runway();
                if(randomRunway == -1){
                    System.out.println("There is no full runway");
                }
                else{
                    System.out.println("Empties the runway number " + (randomRunway + 1));
                    test = true;
                }
            }

            else if (choice.equals("B")){
                AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen();
                int passengers = advanceHourScreen.getNb_passengers();
                passengers = passengers - 100;
                advanceHourScreen.setNb_passengers(passengers);
                test = true;
            }

            else if (choice.equals("C")){
                System.out.println();

            }
        }

        System.out.println("\n");

    }

    public void request4(){

        Scanner scanner =  new Scanner(System.in);

        Plane plane = new Plane();
        plane.setEmergencyLanding();

        System.out.println("Request 4 : Jumbo jet");
        System.out.println("Description : A large aircraft carrying " + plane.getPassengers() + " passengers with " + plane.getFuel_left() +
                " hours of fuel wishes to land. It requires " + plane.getRunway_time() + " hours of runway time.");
        System.out.println("Option A : Allow landing");
        System.out.println("Option B : Place on standby\n");

        RunwayMenu runwayMenu = new RunwayMenu();
        WaitingPlanes waitingPlanes = new WaitingPlanes();

        boolean test = false;

        while(!test){

            System.out.print("Enter your choice (A or B) : ");
            String choice = scanner.nextLine();

            if (choice.equals("A")) {
                int freeRunways = runwayMenu.runway_availability();
                if(freeRunways == -1){
                    System.out.println("There is no empty runway");
                }
                else{
                    System.out.println("Landing on the runway number " + (freeRunways + 1));
                    runwayMenu.addPlane(freeRunways, plane);
                    test = true;
                }
            }
            else if (choice.equals("B")){
                System.out.println("Adding to waiting planes");
                waitingPlanes.addWaitingPlane(plane);
                test = true;
            }
        }

        System.out.println("\n");

    }

    public void request5(){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Request 5 : Bad Weather");
        System.out.println("Description : Select a bad weather event");
        System.out.println("Option A : Cross winds");
        System.out.println("Option B : Icy run ways");
        System.out.println("Option C : Ice storm\n");

        RunwayMenu runwayMenu = new RunwayMenu();

        boolean test = false;

        while(!test){

            System.out.print("Enter your choice (A, B or C) : ");
            String choice = scanner.nextLine();

            if (choice.equals("A")) {
                WaitingPlanes waitingPlanes = new WaitingPlanes();
                if (waitingPlanes.getPlane() == null)
                {
                    System.out.println("There is no waiting planes.");
                }
                else
                {
                    waitingPlanes.removeFuel(1);
                    test = true;
                }

            }
            else if (choice.equals("B")){
                WaitingPlanes waitingPlanes = new WaitingPlanes();
                if (waitingPlanes.getPlane() == null)
                {
                    System.out.println("There is no waiting planes.");
                }
                else
                {
                    RunwayMenu.removeWaitingTime(-2);
                    test = true;
                }
            }
            else if (choice.equals("C")){
                int freeRunways = runwayMenu.runway_availability();
                if(freeRunways == -1){
                    System.out.println("There is no empty runway");
                }
                else{
                    RunwayMenu.removeRunway();
                    test = true;
                }
            }
        }

        System.out.println("\n");

    }

    public void request6(){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Request 6 : Snakes on the plane");
        System.out.println("Description : A pilot is reporting that their plane is being overrun by snakes. They want to land at your airport.");
        System.out.println("Option A : Let them land");
        System.out.println("Option B : Refuse them\n");

        System.out.print("Enter your choice (A or B) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request7(){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Request 7 : Protests");
        System.out.println("Description : A group of protestors are blocking the runway claiming that your airplanes are dropping " +
                "chemtrails which has caused the following health issues: “makes their toothpaste taste like mint.”");
        System.out.println("Option A : Allow them the space to protest");
        System.out.println("Option B : Get police involved");
        System.out.println("Option C : Let the planes land anyways\n");

        System.out.print("Enter your choice (A, B or C) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request8(){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Request 8 : john mcclain");
        System.out.println("Description : Security reports of a man hijacking a plane on the runway.He claims he needs to stop the " +
                "terrorists from stealing christmas. Do you lock down the runway or let them go ?");
        System.out.println("Option A : Lockdown the runway");
        System.out.println("Option B : Let the man go\n");

        System.out.print("Enter your choice (A or B) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }
}



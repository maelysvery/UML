package com.company;

import java.util.Random;
import java.util.Scanner;

public class WaitingPlanes {

    public static Plane[] waitingPlanes;

    public Plane[] getPlane() {
        return waitingPlanes;
    }

    public void main(){

        System.out.println("\nWaitings Planes\n");

        System.out.println("Row | Plane name | Fuel left\n");

        for (int i = 0; i < waitingPlanes.length; i++){

            System.out.print((i+1));

            System.out.print("\t\t" + waitingPlanes[i].getName() + " " + waitingPlanes[i].getFuel_left());

            System.out.println();

        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDo you want to select a plane to land (1) or return to the Main Menu (2) ? ");
        int option = scanner.nextInt();

        if(option == 1){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the plane name : ");
            String selected_plane = sc.nextLine();

            int freeRunway = runway_availability();
            if(freeRunway == -1){
                System.out.println("No runaway available.");
            }
            else{
                System.out.println("Landing " + selected_plane + " on the runway n° " + (freeRunway + 1));
                RunwayMenu runway = new RunwayMenu();
                runway.addPlane(freeRunway, findPlane(selected_plane));
            }
        }
    }

    public Plane findPlane(String planeName)
    {
        for (Plane waitingPlane : waitingPlanes) {
            if (waitingPlane.getName().equals(planeName)) {
                return waitingPlane;
            }
        }
        return null;
    }

    public int runway_availability() {
        // Open or close runway ?
        RunwayMenu runwayMenu = new RunwayMenu();
        Plane [] runway = runwayMenu.getRunway();

        for (int i = 0; i < runway.length; i++) {

            if(runway[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void addWaitingPlane(Plane plane)
    {

    }
}

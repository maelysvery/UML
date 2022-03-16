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

            System.out.print("\t\t" + waitingPlanes[i].getName() + "\t\t" + waitingPlanes[i].getFuel_left());

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

            RunwayMenu runway = new RunwayMenu();

            int freeRunway = runway.runway_availability();
            if(freeRunway == -1){
                System.out.println("No runaway available.");
            }
            else{
                System.out.println("Landing " + selected_plane + " on the runway n° " + (freeRunway + 1));
                Plane planeToLand = findPlane(selected_plane);
                runway.addPlane(freeRunway, planeToLand);
                deleteWaitingPlane(planeToLand);
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

    public void addWaitingPlane(Plane plane)
    {
        if (waitingPlanes == null)
        {
            waitingPlanes = new Plane[1];
            waitingPlanes[0] = plane;
        }
        else
        {
            int length = waitingPlanes.length;
            Plane[] tempWaitingPlanes = new Plane[length + 1];
            for (int i = 0 ; i < length ; i++)
            {
                tempWaitingPlanes[i] = waitingPlanes[i];
            }
            tempWaitingPlanes[length] = plane;

            waitingPlanes = tempWaitingPlanes;
        }
    }

    public void deleteWaitingPlane(Plane planeToLand)
    {
        int length = waitingPlanes.length;
        int position = 0;
        for (int i = 0 ; i < length ; i++)
        {
            if (planeToLand.equals(waitingPlanes[i]))
            {
                position = i;
            }
        }
        Plane[] tempWaitingPlanes = new Plane[length - 1];
        for (int i = 0 ; i < position ; i++)
        {
            tempWaitingPlanes[i] = waitingPlanes[i];
        }
        for (int i = position + 1 ; i < length ; i++)
        {
            tempWaitingPlanes[i - 1] = waitingPlanes[i];
        }
        waitingPlanes = tempWaitingPlanes;
    }

    public void removeFuel(int hour){
        for (Plane waitingPlane : waitingPlanes)
        {
            waitingPlane.setFuel_left(waitingPlane.getFuel_left() - hour);
        }
    }
}

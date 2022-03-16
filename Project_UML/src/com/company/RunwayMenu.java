package com.company;


import java.util.Arrays;
import java.util.Scanner;


public class RunwayMenu {

    public static Plane [] runway = new Plane[8];
    public String choice;
    public int number_runways = 8;

    public Plane [] getRunway() {
        return runway;
    }

    public void addPlane(int i, Plane plane)
    {
        runway[i] = plane;
    }

    public void setNumber_runways(int number_runways) {
        this.number_runways = number_runways;
    }

    public int getNumber_runways() {
        return number_runways;
    }

    public void main(){

        System.out.println(number_runways + " runways\n");

        System.out.println("|      Row        |      Name of occupant   |   Occupied time remaining | \n");

        for (int i = 0; i < runway.length; i++){

            System.out.print("        " +(i+1));

            System.out.print("\t\t\t\t\t" + runway[i]);

            System.out.println();
        }

        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDo you want to return to the Main Menu ? (yes or no) ");
        choice = scanner.nextLine();

        while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){

            System.out.print("\nError ! Write yes or no : ");
            choice = scanner.nextLine();

        }

        if (choice.equalsIgnoreCase("yes")){
            AdvanceHourScreen advanceHourScreen = new AdvanceHourScreen();
            advanceHourScreen.setNb_requests(advanceHourScreen.getNb_requests() + 1);
        }

        else if(choice.equalsIgnoreCase("no")){

            System.exit(0);
        }
        

    }

    public int runway_availability() {
        // Open or close runway ?

        for (int i = 0; i < runway.length; i++) {

            if(runway[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int[] runways_availability(){
        int[] table = new int[2];
        table[0] = -1;
        table[1] = -1;
        for (int i = 0; i < runway.length; i++){
            if (runway[i] == null){
                if (table[0] == -1){
                    table[0] = i;
                }
                else if (table[1] == -1){
                    table[1] = i;
                    return table;
                }
            }
        }
        return table;
    }

    public int empty_runway() {
        // Empties a runway

        for (int i = 0; i < runway.length; i++) {

            if(runway[i] != null) {
                runway[i] = null;
                return i;
            }
        }
        return -1;
    }
    
    public static void removeWaitingTime(int hour){
        for (Plane runwayPlane : runway)
        {
            if (runwayPlane != null)
            {
                runwayPlane.setRunway_time(runwayPlane.getRunway_time() - hour);
            }
        }
    }

    public void removeRunway(){
        runway = Arrays.copyOfRange(runway, 0, runway.length-1);
        setNumber_runways(getNumber_runways()-1);
    }

    public static void removePlane(Plane plane)
    {
        for (int i = 0 ; i < runway.length ; i ++)
        {
            if (plane.equals(runway[i]))
            {
                runway[i] = null;
            }
        }
    }
}


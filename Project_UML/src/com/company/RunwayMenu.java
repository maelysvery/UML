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

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
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
            
            String[] args = new String[0];
            
            Main.main(args);
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

    public void removeWaitingTime(int hour){
        for (Plane runwayPlane : runway)
        {
            runwayPlane.setRunway_time(runwayPlane.getRunway_time() - hour);
        }
    }

    public void removeRunway()
    {
        runway = Arrays.copyOfRange(runway, 0, runway.length-2);
    }

}


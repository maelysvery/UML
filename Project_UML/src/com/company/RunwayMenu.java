package com.company;

import java.util.Scanner;


public class RunwayMenu {

    public static void main(){

        String [] name = new String[8];
        int [] time = new int[8];
        String choice;

        System.out.println("8 runways\n");

        System.out.println("Row | Name of occupant | Occupied time remaining\n");

        for (int i = 0; i < 8; i++){

            System.out.print(i + "\n" + "\t\t\t" + name[i] + "                 " + time[i] + "\n");

        }
        
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

}

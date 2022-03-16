package com.company;

import java.util.Random;
import java.util.Scanner;

public class WaitingPlanes {

    public static void main(){

        String [] plane_name = new String[8];
        double [] fuel_left = new double[8];
        String choice;

        System.out.println("Row | Plane name | Fuel left\n");

        for (int i = 0; i < 8; i++){

            System.out.print((i+1) + "\n" + "\t\t" + plane_name[i] + "     " + fuel_left[i] + "\n");

        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDo you want to return to select a plane to land (1) or return to the Main Menu (2) ? ");
        int option = scanner.nextInt();

        if(option == 1){

            Random plane_land = new Random();

            int min = 0;
            int max = 7;
            int runway = plane_land.nextInt(max + min);

        }

        else if(option == 2){

            String[] args = new String[0];

            Main.main(args);


        }
    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class WaitingPlanes {

    public String [][] plane = new String[10][2];

    public void main(){

        for (int i = 0; i < plane.length; i++){

            plane[i][0] = "Air " + (i+1);

        }

        System.out.println("Row | Plane name | Fuel left\n");

        for (int i = 0; i < plane.length; i++){

            System.out.print((i+1));

            for(int j = 0; j < plane[i].length; j ++){

                System.out.print("\t\t" + plane[i][j] + " ");

            }

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

            int runway = runway_availability();
            if(runway == 1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes : runway " + (runway + 1));
            }

        }

        else if(option == 2){

            String[] args = new String[0];

            Main.main(args);


        }
    }

    public int runway_availability() {

        // Open or close runway ?
        RunwayMenu runwayMenu = new RunwayMenu();
        String[][] runway = runwayMenu.getRunway();

        for (int i = 0; i < runway.length; i++) {

            if(runway[i][0] == null) {

                return i;
            }


        }

        return 1;
    }
}

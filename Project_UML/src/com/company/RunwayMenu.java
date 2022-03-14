package com.company;


import java.util.Scanner;


public class RunwayMenu {

    public String [][] runway = new String[8][2];
    public String choice;

    public String[][] getRunway() {
        return runway;
    }

    public void setRunway(String[][] runway) {
        this.runway = runway;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void main(){

        System.out.println("8 runways\n");

        for (int i = 0; i < runway.length; i++){

            if(i != 0){
                runway[i][0] = "Occupant " + (i+1);
            }
        }

        System.out.println("Row | Name of occupant | Occupied time remaining | \n");

        for (int i = 0; i < runway.length; i++){

            System.out.print((i+1));

            for(int j = 0; j < runway[i].length; j ++){

                System.out.print("\t\t\t" + runway[i][j] + "        ");

            }

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

}

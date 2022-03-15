package com.company;

import java.util.Random;
import java.util.Scanner;

public class RequestMenu {

    private int random_number;
    private int rarity;
    private String title;
    private String description;
    private String option_A;
    private String option_B;
    private String option_C;


    public void main(){

        Random number = new Random();

        int min = 1;
        int max = 3;

        random_number = number.nextInt(max - min + 1) + min;

    }

    public int getRandom_number() {
        return random_number;
    }

    public void requests(int nb_requests){

        Random random1 = new Random();
        int game1 = random1.nextInt(100);

        Random random2 = new Random();
        int game2 = random2.nextInt(100);

        Random random3 = new Random();
        int game3 = random3.nextInt(100);

        for(int i = 0; i < nb_requests; i++){

            if(i == 0){

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

            if (i == 1){

                if(game2 < 40){
                    request1();
                }

                else if(game2 < 45){
                    request2();
                }

                else if (game2 < 55) {
                    request3();

                }
                else if (game2 < 70){
                    request4();
                }

                else if (game2 < 80){
                    request5();
                }

                else if (game2 < 90){
                    request6();
                }

                else if (game2 < 95){
                    request7();
                }

                else{
                    request8();
                }

            }

            if (i == 2){

                if(game3 < 40){
                    request1();
                }

                else if(game3 < 45){
                    request2();
                }

                else if (game3 < 55) {
                    request3();

                }
                else if (game3 < 70){
                    request4();
                }

                else if (game3 < 80){
                    request5();
                }

                else if (game3 < 90){
                    request6();
                }

                else if (game3 < 95){
                    request7();
                }

                else{
                    request8();
                }

            }
        }
    }

    public void request1(){

        Scanner scanner =  new Scanner(System.in);

        Plane plane = new Plane();
        plane.setPlaneLanding();

        rarity = 40;
        title = "Plane Landing";
        description = "Plane requests to land. It has " + plane.getFuel_left() + " hours of fuel left to wait. It needs " +
        plane.getRunway_time() + " hours of runway time. It has " + plane.getPassengers() + " passengers";
        option_A = "Allow landing";
        option_B = "Place on standby";

        System.out.println("Request 1 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B + "\n");

        WaitingPlanes waitingPlanes = new WaitingPlanes();
        boolean test = false;

        while(!test){

            System.out.print("Enter your choice (A or B) : ");
            String choice = scanner.nextLine();

            if (choice == "A") {
                int runway = waitingPlanes.runway_availability();
                if(runway == 1){
                    System.out.println("There is no empty runway");
                }
                else{
                    System.out.println("The runway " + (runway + 1) + "is empty");
                    test = true;

                }


            }

            else if (choice == "B"){

            }

        }

        System.out.println("\n");

    }

    public void request2(){

        Scanner scanner =  new Scanner(System.in);

        rarity = 5;
        title = "Emergency landing";
        description = "Plane requests to land. It has [1-3] hours of fuel left to wait. It requires [3-5] hours of "
        + "runway time. It has [100-500] passengers";
        option_A = "Allow landing";
        option_B = "Place on standby";

        System.out.println("Request 2 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B + "\n");

        System.out.print("Enter your choice (A or B) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request3(){

        Scanner scanner =  new Scanner(System.in);

        rarity = 10;
        title = "Funding Event";
        description = "Increase in funding allows for one of the following bonuses";
        option_A = "Empty random runway";
        option_B = "Rescue team";
        option_C = "Air refueling";

        System.out.println("Request 3 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B);
        System.out.println("Option C : " + option_C + "\n");

        System.out.print("Enter your choice (A, B or C) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request4(){

        Scanner scanner =  new Scanner(System.in);

        rarity = 15;
        title = "Jumbo jet";
        description = "A large aircraft carrying [300-600] passengers with [4-6] hours of fuel wishes to land.";
        option_A = "Allow landing";
        option_B = "Place on standby";

        System.out.println("Request 4 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B + "\n");

        System.out.print("Enter your choice (A or B) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request5(){

        Scanner scanner =  new Scanner(System.in);

        rarity = 10;
        title = "Bad Weather";
        description = "Select a bad weather event";
        option_A = "Cross winds";
        option_B = "Icy run ways";
        option_C = "Ice storm";

        System.out.println("Request 5 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B);
        System.out.println("Option C : " + option_C + "\n");

        System.out.print("Enter your choice (A,B or C) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request6(){

        Scanner scanner =  new Scanner(System.in);

        rarity = 10;
        title = "Snakes on the plane";
        description = "A pilot is reporting that their plane is being overrun by snakes. They want to land at your airport.";
        option_A = "Let them land";
        option_B = "Refuse them";

        System.out.println("Request 6 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B + "\n");

        System.out.print("Enter your choice (A or B) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request7(){

        Scanner scanner =  new Scanner(System.in);

        rarity = 5;
        title = "Protests";
        description = "A group of protestors are blocking the runway claiming that your airplanes are dropping " +
                "chemtrails which has caused the following health issues: “makes their toothpaste taste like mint.”";
        option_A = "Allow them the space to protest";
        option_B = "Get police involved";
        option_C = "Let the planes land anyways";

        System.out.println("Request 7 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B);
        System.out.println("Option C : " + option_C + "\n");

        System.out.print("Enter your choice (A, B or C) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }

    public void request8(){

        Scanner scanner =  new Scanner(System.in);

        rarity = 5;
        title = "john mcclain";
        description = "Security reports of a man hijacking a plane on the runway.He claims he needs to stop the "
        + "terrorists from stealing christmas. Do you lock down the runway or let them go ?";
        option_A = "Lockdown the runway";
        option_B = "Let the man go";

        System.out.println("Request 8 : " + title);
        System.out.println("Description : " + description);
        System.out.println("Option A : " + option_A);
        System.out.println("Option B : " + option_B + "\n");

        System.out.print("Enter your choice (A or B) : ");
        String choice = scanner.nextLine();

        System.out.println("\n");

    }
}

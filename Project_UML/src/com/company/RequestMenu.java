package com.company;

import java.util.Random;

public class RequestMenu {

    private int random_number;

    public RequestMenu(int random_number){

        this.random_number = random_number;

    }

    public void main(){

        Random number = new Random();

        random_number = number.nextInt(4);

        System.out.print("Random number received : " + random_number + "\n");


    }
}

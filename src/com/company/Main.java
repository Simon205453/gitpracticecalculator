package com.company;

import java.util.Scanner;

public class Main {

    public static double plusThis(double a, double b){
        double sumPlusThis = a + b;
        System.out.println("Dette er plus funktionen." + "\n Plusser nu: " + a + " + " + b);

        return sumPlusThis;
    }
    public static void main(String[] args) {
	//Test for first commit in a working repository
        //okay vi skal lave en calculator, som gruppe hvor alle skal committe en metode.
        System.out.println("Hej med dig");
        double a;
        double b;
        System.out.println("Kom med et tal");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.println("Vælg regneudtryk: \n *  +  -  /");
        String c = scanner.nextLine();

        b = scanner.nextDouble();
        double sum = plusThis(a,b);







        System.out.println("Giver = " + sum);

    }
}

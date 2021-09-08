package com.company;

import java.util.Scanner;

public class Main {

    //En metode for plusse 2 variabler
    public static double plusThis(double a, double b) {
        double sumPlusThis = a + b;
        System.out.println("Dette er plus funktionen." + "\n Plusser nu: " + a + " + " + b);
        return sumPlusThis;
    }

    //En anden metode for at minusse 2 variabler
    public static double minusThis(double a, double b) {
        double sumMinusThis = a - b;
        System.out.println("Dette er minus funktionen." + "\n Minusser nu: " + a + " - " + b);
        return sumMinusThis;
    }
    //En tredje metode for at gange 2 variabler

    //En fjerde metode for at dividere 2 variabler


    public static void main(String[] args) {
        //Test for first commit in a working repository
        //okay vi skal lave en calculator, som gruppe hvor alle skal committe en metode.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej med dig.\n Dette er vores lommeregner.");
//Definerer første variable til næste sys.input
        double a;
        System.out.println("\n Kom med et tal");
        a = scanner.nextDouble();
//Laver en boolean for at kunne køre et whileloop optimalt
        boolean notDone = true;
        //laver et default resultat fordi den brokkede sig
        double resultat = 0;

        while (notDone) {
//Laver et regneudtryk
            char regneudtryk;
            System.out.println("Vælg et regneudtryk: +, -, *, /");
            regneudtryk = scanner.next().charAt(0);


            double b;

            switch (regneudtryk) {
                case '+':
                    System.out.println("Du har valgt plus metoden. \n Hvad er dit andet tal?");
                    b = scanner.nextDouble();
                    resultat = plusThis(a, b);
                    break;
                case '-':
                    System.out.println("Du har valgt minus metoden. \n Hvad er dit andet tal?");
                    b = scanner.nextDouble();
                    resultat = minusThis(a, b);
                    break;
            /*case '*':
                System.out.println("Du har valgt gange minus. \n Hvad er dit andet tal?");
                b = scanner.nextDouble();
                resultat = gangeThis(a,b);
                break;
            case '/':
                System.out.println("Du har valgt divider metoden. \n Hvad er dit andet tal?");
                b = scanner.nextDouble();
                resultat = dividerThis(a,b);
                break;*/
                default:
                    System.out.println("invalidt input, lommeregner lukkes");
                    notDone = false;
                    System.out.println("Dit endelige resultat var = " + resultat);
                    System.exit(0);
                    break;
            }


            System.out.println("Giver = " + resultat);
            System.out.println("Når du er færdig, indsæt invalidt input på regneudtryk");
            //Sætter variable a = resultat så vi kan regne videre
            a = resultat;
        }
    }
}

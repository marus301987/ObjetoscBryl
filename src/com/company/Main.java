//  Zadanie:
//  Napisać program, który będzie umożliwiał użytkownikowi obliczanie objętości różnych brył.
//  Jeżeli użytkownik wybierze 1, to powinien mieć możliwość obliczenia objętości kuli,
//  dla 2 – objętości stożka, dla 3 – objętości walca, dla 4 – objętości prostopadłościanu,
//  a dla 5 – objętości sześcianu. Program powinien pytać użytkownika, którą objętość chce
//  obliczyć aż do momentu, kiedy użytkownik wpisze 0 (zero). Użyj pętli do-while.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double i;

        do {
            System.out.println("Obliczanie objętości brył. Wybierz bryłę:");
            System.out.println("0. Zakończ program");
            System.out.println("1. Obliczanie objętości kuli");
            System.out.println("2. Obliczanie objętości stożka");
            System.out.println("3. Obliczanie objętości walca");
            System.out.println("4. Obliczanie objętości prostopadłościanu");
            System.out.println("5. Obliczanie objętości sześcianu");
            System.out.println("__________________________________________");

            i = scanner.nextInt();

            switch ((int) i) {
                case 0 -> {
                    System.out.println("Zakończ program");
                    break;
                }
                case 1 -> {
                    System.out.println("Podaj długość promienia kuli (r):");
                    double r = scanner.nextDouble();
                    System.out.println("Objętość kuli wynosi (V) = :" + (4*Math.PI*r*r*r)/3);
                    System.out.println("_________________________________________");
                    break;
                }
                case 2 -> {
                    System.out.println("Podaj promień podstawy stożka (r): ");
                    double r = scanner.nextDouble();
                    System.out.println("Podaj wysokość stożka (h): ");
                    double h = scanner.nextDouble();
                    System.out.println("Objętość stożka wynosi (V) = : " + ((Math.PI*r*r*h)/3));
                    System.out.println("_________________________________________");
                    break;
                }
                case 3 -> {
                    System.out.println("Podaj promień podstawy walca (r): ");
                    double r = scanner.nextDouble();
                    System.out.println("Podaj wysokość walca (h): ");
                    double h = scanner.nextDouble();
                    System.out.println("Objętość walca wynosi (V) = : " + Math.PI*r*r*h);
                    System.out.println("_________________________________________");
                    break;
                }
                case 4 -> {
                    System.out.println("Podaj długość prostopadłościanu (a): ");
                    double a = scanner.nextDouble();
                    System.out.println("Podaj szerokość prostopadłościanu (b): ");
                    double b = scanner.nextDouble();
                    System.out.println("Podaj wysokość prostopadłościanu (c): ");
                    double c = scanner.nextDouble();
                    System.out.println("Objętość prostopadłościanu wynosi (V) = : " + a*b*c);
                    System.out.println("_________________________________________");
                    break;
                }
                case 5 -> {
                    System.out.println("Podaj długość boku sześcianu (a): ");
                    double a = scanner.nextDouble();
                    System.out.println("Objętość sześcianu wynosi (V) = :" + a*a*a);
                    System.out.println("_________________________________________");
                    break;
                    }
                default ->{
                    System.out.println("Wybierz cyfry od 0 do 5");
                    System.out.println("_________________________________________");
                    break;
                }
            }
        }
        while (i !=0);
    }
    }
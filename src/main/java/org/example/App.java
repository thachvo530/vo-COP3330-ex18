/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\n");
        System.out.print("Your choice: ");
        String choice = scan.next();

        if (choice.equals("c") || choice.equals("C")) {

            System.out.print("Please enter the temperature in Fahrenheit: ");

            int F = scan.nextInt();
            int C = (F - 32) * 5 / 9;

            System.out.print("The temperature in Celsius is "+C+".");
        }

        if (choice.equals("f") || choice.equals("F")) {

            System.out.print("Please enter the temperature in Celsius: ");

            int C = scan.nextInt();
            int F = (C * 9 / 5) + 32;

            System.out.print("The temperature in Fahrenheit is "+F+".");
        }

    }
}

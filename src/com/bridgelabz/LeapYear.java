package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Create object of Scanner class
        Scanner sc = new Scanner(System.in);
        //Enter 4 digit number
        System.out.println("Enter year it is a 4 digit number :");
        int n = sc.nextInt(); //initialize
        leapYear(n);
    }

    static void leapYear(int n) {
        if (n > 999 && n <= 9999) { // input is 4 digit number
            if (n % 400 == 0 || n % 4 == 0 && n % 100 != 0) { //condition to check if leap year or not
                System.out.println(n + " is a leap year ");
            } else {
                System.out.println(n + " is not a leap year");
            }
        } else {
            System.out.println("Enter a valid year");
        }
    }
}

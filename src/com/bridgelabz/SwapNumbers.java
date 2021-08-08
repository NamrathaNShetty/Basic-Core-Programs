package com.bridgelabz;
import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        // x and y are to swap
        int x, y, t;
        //Create an object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before swapping numbers: "+x +"  "+ y);
        /*swapping */
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: "+x +"   " + y);
        System.out.println( );
    }
}

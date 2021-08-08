package com.bridgelabz;
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args)
    {
        //Take input from user
        //Create object of scanner class
        int x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = input.nextInt(); //Initialize
        System.out.print("Enter the second number:");
        y = input.nextInt(); //Initialize
        System.out.print("Enter the third number:");
        z = input.nextInt(); //Initialize
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }

    }
}

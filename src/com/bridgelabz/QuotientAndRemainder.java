package com.bridgelabz;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args)
    {
        //Take input from the user
        //Create object of Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();  //Initialize the number
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();  //Initialize the number
        findQuotient(num1,num2);
    }
    //user defined method
    static void findQuotient(int num1, int num2)
    {
        int quotient=num1/num2;
        int remainder=num1%num2;

        //display result
        System.out.println("The quotient of "+num1+" and "+num2+" is "+quotient);
        System.out.println("The remainder of "+num1+" and "+num2+" is "+remainder);

    }
}



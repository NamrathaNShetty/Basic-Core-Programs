package com.bridgelabz;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args)
    {
        //Create object of Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        //initialize n ,scans the next token of input as int
        int n=sc.nextInt();
        isHarmonicNumber(n);

    }

    static void isHarmonicNumber(int n)
    { double sum=0;
        if(n!=0)
        {
            for (int i = 1; i <= n; i++)
            {
                sum=sum+(1.0/i);
                if(i==1)
                {
                    System.out.print("1/"+i+" ");
                }
                else
                {
                    System.out.print(" + "+"1/"+i);
                }


            }
            System.out.println();
            System.out.println("The Nth Harmonic Value is = "+ sum);
        }
        else
        {
            System.out.println("Number should be greater than zero");
        }
    }

}

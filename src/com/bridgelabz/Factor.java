package com.bridgelabz;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args)
    {
        //Create an object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        isFactors(n);

    }

    //logic
    static void isFactors(int n)
    {
        for (int i = 1; i*i <=n; i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }

        }
    }

}

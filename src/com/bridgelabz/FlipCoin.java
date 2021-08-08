package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        //Create object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times coin is flipped : ");
        // initailize, scans the next token of input as int
        int n = sc.nextInt();
        flipCoin(n);
    }
    static void flipCoin(int noOfTimes)
    {
        //initializing
        int countHead=0,countTail=0;
        float percentH,percentT;

        //using math.random to check for values
        for (int i = 0; i < noOfTimes; i++)
        {
            if(Math.random()<0.5)
            {
                countHead++;
            }
            else
            {
                countTail++;
            }
        }

        System.out.println("Number of head = "+countHead);
        System.out.println("Number of tail = "+countTail);

        //checking percentage of Head and Tail
        percentH=(countHead*100)/noOfTimes;
        percentT=(countTail*100)/noOfTimes;

        //print the percentage of Head and Tail
        System.out.println("Percent of head "+percentH +" Percent of Tail"+percentT);


    }

}


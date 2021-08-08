package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times coin is flipped : ");
        int n = sc.nextInt();
        flipCoin(n);
    }
    static void flipCoin(int noOfTimes)
    {
        int countHead=0,countTail=0;
        float percentH,percentT;
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

        percentH=(countHead*100)/noOfTimes;
        percentT=(countTail*100)/noOfTimes;

        System.out.println("Percent of head "+percentH +" Percent of Tail"+percentT);


    }

}


package com.bridgelabz;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        int powerOfTwo = 1;
        if(inputNumber > 0 && inputNumber < 31) {
            for (int i = 1; i <= inputNumber; i++) {
                powerOfTwo = powerOfTwo * 2;
                System.out.println(2 + "to the Power " +i+ " : "+powerOfTwo);
            }
        }
            else{
                System.out.println("Your input overflows the 'int' datatype Limit");
            }
        }

        }


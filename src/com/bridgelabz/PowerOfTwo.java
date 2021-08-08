package com.bridgelabz;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        //Create an object of scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        //scans the next token of input as int
        int input = scanner.nextInt();
        scanner.close();

        //logical part
        int powerOfTwo = 1;
        if(input > 0 && input < 31) {
            for (int i = 1; i <= input; i++) {
                powerOfTwo = powerOfTwo * 2;
                System.out.println(2 + "to the Power " +i+ " : "+powerOfTwo);
            }
        }
            else{
                System.out.println("Your input overflows the 'int' datatype Limit");
            }
        }

        }


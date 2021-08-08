package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        //get input and it is stored ch variable
        char ch = scanner.next().charAt(0);

        // closing scanner class
        scanner.close();

        /* Check if input alphabet is member of set{A,E,I,O,U,a,e,i,o,u} */
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is consonant");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}

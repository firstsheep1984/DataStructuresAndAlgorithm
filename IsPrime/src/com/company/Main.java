package com.company;

import java.util.Scanner;

public class Main {

    public static void displayPrime(int n) {

        int num = 2;
        while(num<n) {
            int isPrime = 1;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
                if (isPrime == 1) {

                    System.out.println(num + "");
                }
                num++;
            }


    }
    public static void main(String[] args) {
        // write your code here
        System.out.println("Please input an integer");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        displayPrime(num);


    }
}


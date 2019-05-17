package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int isPrime = 1;
        int n = 50;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = 0;
                System.out.println(n + "is not prime" + i);
                break;
            }
        }
        if (isPrime == 1) {
            System.out.println(n + "is prime");
        } else {
            System.out.println(n + "is not prime");
        }
    }
}


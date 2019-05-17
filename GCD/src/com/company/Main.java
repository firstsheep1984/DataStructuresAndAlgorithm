package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number A：");
        int a = scanner.nextInt();
        System.out.println("Please input number B：");
        int b = scanner.nextInt();
        int min = a < b ? a : b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD " + i);
                break;
            }
        }
    }
}

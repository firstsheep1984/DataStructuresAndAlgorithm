package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println("Please input a Hex number:");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        String digits = "0123456789ABCDEF";
        inputStr = inputStr.toUpperCase();
        int decimalNum = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            int d = digits.indexOf(c);
            decimalNum = 16*decimalNum + d;
        }

        System.out.println("Decimal is " + decimalNum);



    }
}

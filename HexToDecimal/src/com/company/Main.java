package com.company;

import java.util.Scanner;

public class Main {

    public static void hexToDec(String s){
        int decimal = 0;
        for(int i = 0; i< s.length()-1; i++){

            decimal += (int)(s.charAt(i)) * Math.pow(16,(s.length()-i-1));

        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Please input a hex number:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();



    }
}

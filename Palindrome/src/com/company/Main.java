package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        boolean isPalindrome = true;
        int min =0;
        int max = word.length() - 1;
        while(min < max ){

            if (word.charAt(min) != word.charAt(max)){


                isPalindrome = false;
                break;
            }else {

                min ++;
                max --;

            }

        }

        if(isPalindrome == false){

            System.out.println("Palindrome string is not found!");


        }else{
            System.out.println("this word is palindrome!");
        }

    }
}

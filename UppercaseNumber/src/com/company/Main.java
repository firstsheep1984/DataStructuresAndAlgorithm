package com.company;

import java.util.Scanner;

public class Main {
    static int counter = 0;
    public static void uppercaseNumber(String s, int low){
        // base case
        if(low < s.length()){
           // char c = s.charAt(low);
            // check whether the letter is uppercase, if yes, increase the counter
            if(s.charAt(low)>=65&&s.charAt(low)<=90){
                counter++;

            }
            // call recursive method to check the next letter
            uppercaseNumber(s, low+1);
        }
        // when check the last letter, print the total number of uppercase letters
        if(low == s.length()){System.out.println(counter);}
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a word: ");
        String word = sc.nextLine();
        // call the method to check input word
        uppercaseNumber(word,0);

    }
}

package com.company;

import java.util.Scanner;

public class Main {
    static int counter = 0;
    static int low = 0;
    public static int count(String str, char a){
        // base case
        if(low < str.length()){

            // check whether the letter is uppercase, if yes, increase the counter
            if(str.charAt(low)== a){
                counter++;

            }
            // call recursive method to check the next letter
            low++;
            count(str, a);
        }
        return counter;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a word: ");
        String word = sc.nextLine();
        System.out.println("please enter a specified letter: ");
        char letter = sc.next().charAt(0);
        // call the method to check input word

        System.out.println(count(word, letter));

    }
}

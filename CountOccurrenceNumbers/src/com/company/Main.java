package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] values = new int[100];
        int input;
        int count = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        do
        {
            input = in.nextInt();
            values[count] = input;
            count += 1;
        }
        while (input != 0);

        countOccurrence(values);
    }

    public static void countOccurrence(int[] list) {

        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count += 1;
            }

            System.out.println(i +  "occurs" + count + (count > 1 ? "times" : "time"));
        }
    }
}

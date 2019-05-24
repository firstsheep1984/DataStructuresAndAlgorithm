package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[][][] scores ={
                {{50,50},{40,50},{30,50}},
                {{30,50},{20,50},{35,50}},
                {{36,50},{40,50},{35,40}},
                {{40,50},{30,50},{36,40}}
                };

        for(int i =0; i < scores.length; i++){
            double sum = 0;
            for(int j =0; j< scores[i].length; j++){

                sum += scores[i][j][0] + scores[i][j][1];

            }
            System.out.println("Student " + i + " exam total score is " + sum);
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	 int hex = Int(Math.random() * 10000);
        int currentDecimal = hex %16;
        int counter = 1;
	 while((hex/16) !=0){

         (currentDecimal>=0 && currentDecimal <=9 )
             ?(char) finalDecimal = (char)(currentDecimal + "0")
            : (char) finalDecimal = (char)(currentDecimal - 10 + "A");

	    counter *= 10;


     }
    }
}

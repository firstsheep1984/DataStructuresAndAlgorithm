package com.company;

public class Main {

    public static void main(String[] args) {
	 int decimal = (int)(Math.random() * 10000);
        System.out.println("The decimal value is " + decimal);
       String hex="";
	 while(decimal !=0){
         int currentDecimal = decimal %16;
         char lastHex = (currentDecimal>=0 && currentDecimal <=9 )
             ?(char)(currentDecimal + '0')
            : (char)(currentDecimal - 10 + 'A');

	    hex = lastHex + hex;
        decimal = decimal /16;

     }
	 System.out.println("The hex value is " + hex);
    }
}

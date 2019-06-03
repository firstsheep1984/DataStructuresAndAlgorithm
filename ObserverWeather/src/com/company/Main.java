package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Weather weather = new Weather();
        Bullentin bullentin = new Bullentin(weather);
        weather.setMessurements(80,65,30.4f);
        weather.setMessurements(75,62,30.8f);
        weather.setMessurements(82,68,31.4f);
    }
}

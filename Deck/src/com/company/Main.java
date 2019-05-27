package com.company;

public class Main {

    static void display(int n){
        int reminder = n%13;
        String cardNum = "";
        if(reminder = 0 )
            cardNum = "A";
        if(reminder > 0 && reminder <10)
            cardNum = reminder +1 +"";
        else if(reminder == 10)
            cardNum = "J";
        else if(reminder == 11)
            cardNum = "Q";
        else if(reminder == 12)
            cardNum = "K";
        if(n>=0 && n<13)
            System.out.println("Spades " + cardNum);
        else if(n>=13 && n<26)
            System.out.println("Hearts " + cardNum);
        else if(n>=26 && n<39)
            System.out.println("Diamonds " + cardNum);
        else
            System.out.println("Club " + cardNum);
    }

   static void shuffleDeck(int[] deck){

      for(int i = deck.length-1; i >0; i--){
            int j = (int)(Math.random()*(i+1));
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }


     /*   // Shuffle the cards (second method)
         for (int i = 0; i < deck.length; i++) {
           // Generate an index randomly
             int index = (int)(Math.random() * deck.length);
             int temp = deck[i];
             deck[i] = deck[index];
             deck[index] = temp;
             }

*/
    }

    public static void main(String[] args) {
	// write your code here
      //  int[] deck = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
        int[] deck = new int[52];
        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;

        }
        // Shuffle the cards
        shuffleDeck(deck);
        for (int i = 0; i < deck.length; i++) {

            System.out.println(i);
            display(deck[i]);
        }
        display(deck[0]);
        display(deck[1]);
        display(deck[2]);
        display(deck[3]);

    }
}

package BlackJack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards; //Declare private instance variable which is an ArrayList of Card objects. This will store the Card objects added to the hand.

    public Hand() {
        cards = new ArrayList<>(); //Initialize the list as an empty ArrayList of Card objects
    }

    //A Card is dealt to the Hand and the Hand is responsible to store the card
    public void Deal(Card card) {
        cards.add(card); //Adds the given Card object to the cards list
    }

    public int getSize() {
        return cards.size(); //Returns the number of cards in the hand
    }

    //The Hand uses the methods of each card to determine the value of each card - and adds up all values
    public int getValue() {
        int value = 0;

        for(Card card: cards) {
            card.flip(); //turn the card over to see the value
            value += card.getPointValue(); // Add the card's point value to the total
            card.flip(); //Hide the card again after checking its value
        }
        return value; //Returns the total value of all cards in the hand
    }
}
//The Hand class represents a player's collection of Card objects.
//It can add cards  to the hand (Deal), get the total number of cards (getSize), and calculate the point value of all cards (getValue)
//getValue temporarily flips each card face-up to read its value, adds it to the total, then flips it face-down to keep the cards hidden.

package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    //Declare instance variable
    ArrayList<Card> cards; //Create an instance variable cards, an ArrayList that will hold all the Card objects in the deck.

    public Deck() {
        //Initialize variable in the constructor
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //These loops create all the cards in the deck and add them to the ArrayList
        //This nested loop creates every possible combination of suits and values to form a full deck of 52 cards.
        for(String suit: suits) {
            for(String value: values) {
                Card card = new Card(suit, value); //Creates a new Card object with the current suit and value
                cards.add(card); //Adds the newly created Card object to the cards list
            }
        }
    }

    //Uses the shuffle method from Java’s Collections class to randomly reorder the elements in the cards list, simulating a shuffled deck.
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //Define the deal method, which removes and returns the top card from the deck.
    public Card deal() {
        //Deal the top card (if there are any cards left)
        if(cards.size() > 0) { //Checks if there are any cards left in the deck. If the deck is not empty, removes the first card from the cards list and assigns it to the variable card/
            Card card = cards.remove(0); //Removing the card ensures it won't be dealt again.
            return card; //Returns the removed card
        } else {
            return null; //If there are no cards left in the deck, it returns null, indicating no card can be dealt.
        }
    }

    //Define the getSize method, which returns the number of cards remaining in the deck.
    public int getSize() {
        return cards.size();
    } //return cards.size(); calls the size() method on the cards list to get the current count of cards, indicating how many cards remain in the deck.
}
//Initializes a deck of 52 Card objects representing all possible combinations of suits and values.
//Shuffles the deck to randomize the card order.
//Deals cards by removing and returning the top card.
//Tracks deck size with the getSize method, which returns the number of cards left in the deck.
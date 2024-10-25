package BlackJack;

public class Main {
    public static void main(String[] args) {

        //Initialize deck and shuffle
        Deck deck = new Deck();
        deck.shuffle();

        //Create 2 players
        Hand player1 = new Hand();
        Hand player2 = new Hand();

        // Deal 2 cards to each player
        for(int i = 0; i < 2; i++) {
            player1.Deal(deck.deal());
            player2.Deal(deck.deal());
        }

        //Calculate hand values for both players
        int player1Value = player1.getValue();
        int player2Value = player2.getValue();

        //Display each player's hand value
        System.out.println("Player 1's hand: " + player1Value);
        System.out.println("Player 2's hand: " + player2Value);

        //Determine and display the winner based on the closest value to 21
        int targetValue = 21;
        int player1Difference = Math.abs(targetValue - player1Value);
        int player2Difference = Math.abs(targetValue - player2Value);

        if (player1Difference < player2Difference) {
            System.out.println("Player 1 wins!");
        } if(player2Difference < player1Difference) {
            System.out.println("Player 2 wins!");
        } if(player2Difference == player1Difference) {
            System.out.println("It's a tie!");
        }
    }
}



/* 1. Create Card class - we want to know suite & card number. Make sure face cards (11, 12, 13) be set to 10 and ace set to 11.
    2. Create Deck class - we want to make sure we call from Card to set suites as "Ace, Jack, Queen, King" by making a String[]
                         - Deck contains 52 cards and we want to it 'shuffle' by adding a method
 */
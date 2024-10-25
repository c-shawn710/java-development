package BlackJack;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suite, String value) {
        this.suit = suite;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuite() {
        //Only return the suite if the card is face up
        if(isFaceUp) {
            return suit;
        //set face cards (11, 12, 13) as 10
        } else {
        } return "#"; //Hidden value representation
    }

    public void setSuite(String suite) {
        this.suit = suite;
    }

    public String getValue() {
        //Only return the value if the card is face up
        if(isFaceUp) {
            return value;
        } else {
        } return "#"; //Hidden value representation
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPointValue() {
        if(isFaceUp) {
            switch(value) {
                case "A":
                    return 11;
                case "J":
                case "Q":
                case "K":
                    return 10;
                default:
                    //Return numeric values from String to int
                    return Integer.parseInt(value);
            }
        } else {
            return 0; //Hidden card has no point value
        }
    }

    //Check if card is face up
    public boolean isFaceUp() {
        return isFaceUp;
    }

    //Flip the card's orientation (face up or face down)
    public void flip() {
        isFaceUp = !isFaceUp;
    }
}

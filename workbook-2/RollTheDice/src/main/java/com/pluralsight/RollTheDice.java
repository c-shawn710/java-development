package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {

    //Create instance of Dice named dice
    Dice dice = new Dice();

    //Create integer variables
    int roll1, roll2;
    int twoCounter = 0;
    int fourCounter = 0;
    int sixCounter = 0;
    int sevenCounter = 0;

    //Create loop that execute 100 times
    int i = 1;
    int total;
    while (i <= 100) {
        //Call your dices' roll() method two times
        roll1 = dice.roll();
        roll2 = dice.roll();
        System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + (roll1+roll2));
        total = roll1 + roll2;
        if(total == 2) {
            twoCounter++;
        } else if(total == 4) {
            fourCounter++;
        } else if(total == 6) {
            sixCounter++;
        } else if(total == 7) {
            sevenCounter++;
        }
        i++;
    }
        System.out.println("Number of times rolls equaled sum of 2: " + twoCounter);
        System.out.println("Number of times rolls equaled sum of 4: " + fourCounter);
        System.out.println("Number of times rolls equaled sum of 6: " + sixCounter);
        System.out.println("Number of times rolls equaled sum of 7: " + sevenCounter);
    }
}


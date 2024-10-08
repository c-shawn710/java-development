package com.pluralsight;

public class Dice {
private int dice1, dice2, twoCounter, fourCounter, sixCounter, sevenCounter;


    public int roll() {
        int randomNumber = (int)(Math.random() * 6 + 1);

        return randomNumber;
    }
}


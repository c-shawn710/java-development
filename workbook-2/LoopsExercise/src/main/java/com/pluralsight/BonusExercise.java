package com.pluralsight;

public class BonusExercise {
    public static void bonusExercise(int nrOfMonkeys) {
  /* Print the song "10 little monkeys jumping on the bed, one fell of and bumped his head, mommy called the doctor
     and the doctor said no more monkeys jumping on the bed" Please mind, when you get down to 1 monkey, no monkeyS.
     Try to do this in minimum nr of lines.*/
            for (int i = nrOfMonkeys; i > 0; i--) {
                System.out.println(i + " little" + (i == 1 ? "monkey" : "monkeys" + " jumping on the bed..."));
            }
        }
    }
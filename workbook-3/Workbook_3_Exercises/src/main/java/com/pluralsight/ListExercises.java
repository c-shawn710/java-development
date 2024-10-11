package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExercises {
    public static void main(String[] args) {

        List<String> favArtists = new ArrayList<>();
        favArtists.add("Lil Baby");
        favArtists.add("Drake");
        favArtists.add("Juice WRLD");

        favArtists.remove("Drake");
        //System.out.println(favArtists);

        favArtists.add("Drake");
        Collections.sort(favArtists);
        System.out.println(favArtists);

        List<Integer> age = new ArrayList<>();
        age.add(28);
        age.add(29);
        age.add(27);
        age.add(24);

        Collections.sort(age);
        System.out.println(age);

        //find the sum of the age list
        int sum = 0;
        for (int age2 : age) {     // for(type of variableName : arrayName)
            sum += age2;
            System.out.println(sum);
        }

        //find the average of the age list
        double avg = (double) sum / age.size();
        System.out.println(avg);
        }
    }



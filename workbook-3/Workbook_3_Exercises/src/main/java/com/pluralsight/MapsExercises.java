package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExercises {
    public static void main(String[] args) {
        Map<String, String> namesFruits = new HashMap<>();
        namesFruits.put("shawn", "apples");
        namesFruits.put("jesus", "watermelon");
        namesFruits.put("genald", "peaches");
        namesFruits.put("van", "durian");
        System.out.println(namesFruits);

        Map<Integer, Integer> sqCounterpart = new HashMap<>();
        sqCounterpart.put(1, 1);
        sqCounterpart.put(2, 4);
        sqCounterpart.put(3, 9);
        sqCounterpart.put(4, 16);
        sqCounterpart.put(5, 25);
        System.out.println(sqCounterpart);

        List<String> puppies = new ArrayList<>();
        puppies.add("Golden Retriever, Shiba Inu, German Shepard");
        puppies.add("Shiba Inu");
        puppies.add("German Shepard");

        Map<String, List<String>> ownerPuppies = new HashMap<>();
        ownerPuppies.put("Shawn", puppies);
        System.out.println(ownerPuppies);

        //Create map for owner and call from puppies
        /*PuppyList puppy1 = new PuppyList("Clifford", "big red dog");
        PuppyList puppy2 = new PuppyList("Bob", "beagle");
        PuppyList puppy3 = new PuppyList("Bonita", "chihuahua");

        List<PuppyList> pup1 = new ArrayList<>();
        pup1.add(puppy1);
        pup1.add(puppy2);
        List<PuppyList> pup2 = new ArrayList<>();
        pup2.add(puppy3);
        Map<String, List<PuppyList>> ownersPuppies = new HashMap<>();
        ownersPuppies.put("Shawn", pup1);
        ownersPuppies.put("Bob", pup2);
        System.out.println("Shawn" + ownersPuppies);*/
    }
}

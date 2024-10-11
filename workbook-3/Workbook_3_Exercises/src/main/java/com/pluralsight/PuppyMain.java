package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class PuppyMain {
    public static void main(String[] args) {
        PuppyList p1 = new PuppyList("Boba", "Shiba Inu");
        PuppyList p2 = new PuppyList("Momo", "Maltese");
        PuppyList p3 = new PuppyList("Dodo", "Poodle");

        List<PuppyList> myList = new ArrayList<>();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);

        myList.remove(p3);
        System.out.println(myList.get(0).getBreed());

        for (int remaining = 0; remaining < myList.size(); remaining++) {
        }
        System.out.println("Remaining puppies count: " + myList.size());

        }
    }

    //exercisesList in week3 folder
    //reference ListsExplained in week3 folder


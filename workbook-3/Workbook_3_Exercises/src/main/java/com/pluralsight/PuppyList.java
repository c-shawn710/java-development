package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class PuppyList {
    private String name;
    private String breed;

    public PuppyList(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}


package MethodsMiniExercises;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private String breed;
    private String sound;
    private boolean walk;

    public Dog(String name, String breed, String sound, boolean walk) {
        this.name = name;
        this.breed = breed;
        this.sound = sound;
        this.walk = walk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String bark() {
        return name + " says " + sound;
    }

    public void walk(String ownerName) {
        if(walk == true){
            System.out.println(ownerName + " is walking " + name + "!");
        } else {
            System.out.println(ownerName + " is not walking " + name + "!");
        }
    }

    public void walk() {
        List<String> dogWalkers = new ArrayList<>();
        dogWalkers.add("Ed");
        dogWalkers.add("Edd");
        dogWalkers.add("Eddy");

        System.out.println("List of dog walkers: " + dogWalkers);
    }

    //Easier but same result for list. Above is also list
    public void walk(List<String> dogWalkers) {
        System.out.println(dogWalkers + " is walking " + this.name);
    }

    public void walk(String walkerName, int minutes) {
        System.out.println(walkerName + " is be walking " + name + " for " + minutes + " minutes.");
    }
}

package com.animalpackage;
public class Animal {
 String name;
 int legs=4;

    public void setName(String name) { //setter Method
        this.name = name;
    }

    public String getName() { //getter Method
        return name;
    }

    public void move(){ //Method that tells the animal to move
        System.out.println("The animal moves");
    }

    public void displayLegs(){ //Method that displays the animal legs
        System.out.println("The animal has "+ legs+ " "+ "legs");
    }
}

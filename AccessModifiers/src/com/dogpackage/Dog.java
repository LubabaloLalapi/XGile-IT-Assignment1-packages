package com.dogpackage;

import com.animalpackage.Animal;

public class Dog  extends Animal {

    public void bark(){
        System.out.println("The dog barks");
    }


    public static void main(String[]args){
            Dog spike=new Dog(); //Object of the Dog Class
            spike.setName("Spike"); //Setting the dog name to "Spike" using the setter Method from Animal Class
            spike.getName();//Displays the name, "Spike"
            System.out.println(spike.getName());
            spike.move(); // Displays the move method from the Animal Class
            spike.displayLegs(); //Displays dog legs (Method from Animal Class)

    }
}

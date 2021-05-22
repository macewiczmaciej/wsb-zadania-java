package com.company;

public class Animal {
    public final String species;
    private Double weight;
    String name;

    public String toString(){
        return species+" "+name;
    }

    public Animal(String species) {
        this.species = species;
        if (this.species == "dog") {
            this.weight = 5.0;
        } else if (this.species == "cat") {
            this.weight = 2.0;
        } else if (this.species == "mouse") {
            this.weight = 0.1;
        }
    }

    void feed() {
        if(this.weight>0) {
            weight += 1;
            System.out.println("Your pet has been fed");
        }
        else{
            System.out.println("Your pet is dead. You degenerate!");
        }
    }

    void takeForAWalk() {
        if (this.weight > 0) {
            weight -= 1;
            System.out.println("Your pet came back from a walk");
        } else {
            System.out.println("Your pet is dead. You degenerate!");
        }
    }
}

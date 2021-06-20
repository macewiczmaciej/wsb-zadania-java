package com.company.creatures;

import com.company.Human;
import com.company.Salleable;

import javax.lang.model.type.NullType;

abstract public class Animal implements Salleable, Feedable {
    public final String species;
    public String name;
    private Double weight;



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

    public void feed() {
        if(this.weight>0) {
            weight += 1;
            System.out.println("Your pet has been fed");
        }
        else{
            System.out.println("Your pet is dead. You degenerate!");
        }
    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            weight -= 1;
            System.out.println("Your pet came back from a walk");
        } else {
            System.out.println("Your pet is dead. You degenerate!");
        }
    }
    @Override
    public void feed(Double foodWeight) {

    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet.hashCode() == this.hashCode()){
            if(buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("-------------------------");
                System.out.println("SUCCESS!");
                System.out.println(buyer.firstName+" just bought "+this.name+" for "+price+" from "+seller.firstName);
                System.out.println("-------------------------");
            }
            else{
                System.out.println(seller.firstName+" has this pet, but "+buyer+" is poor");
            }
        }
        else{
            System.out.println(seller.firstName+" is scammer, he doesn't have this pet");
        }
    }
}

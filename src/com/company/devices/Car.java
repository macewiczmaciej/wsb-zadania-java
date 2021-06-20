package com.company.devices;

import com.company.Human;

public class Car extends Device {
    String color;
    Double engineVolume;
    public Double price;

    public String toString(){
        return producer+" "+model;
    }
    public void turnOn() {
        System.out.println("The car was turned on");
    }
    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getHumanCar().hashCode() == this.hashCode()){
            if(buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.setHumanCar(seller.getHumanCar());
                seller.setHumanCar(null);
                System.out.println("-------------------------");
                System.out.println("SUCCESS!");
                System.out.println(buyer.firstName+" just bought "+this.model+" for "+price+" from "+seller.firstName);
                System.out.println("-------------------------");
            }
            else{
                System.out.println(seller.firstName+" has this car, but "+buyer+" is poor");
            }
        }
        else{
            System.out.println(seller.firstName+" is scammer, he doesn't have this car");
        }
    }
}
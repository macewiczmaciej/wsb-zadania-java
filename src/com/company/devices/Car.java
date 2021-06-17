package com.company.devices;

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
}
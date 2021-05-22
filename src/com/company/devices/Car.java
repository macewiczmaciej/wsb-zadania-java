package com.company.devices;

public class Car {
    public final String producer;
    public final String model;
    String color;
    Double engineVolume;
    public Double price;

    public String toString(){
        return producer+" "+model;
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }
}
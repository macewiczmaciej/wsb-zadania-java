package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public Number yearOfProduction;

    public String toString(){
        return producer+" "+model+" "+yearOfProduction;
    }

    abstract void turnOn();

}

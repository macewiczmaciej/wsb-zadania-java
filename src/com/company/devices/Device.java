package com.company.devices;
import com.company.Salleable;

public abstract class Device implements Salleable, Comparable<Device>{
    public String producer;
    public String model;
    public Integer yearOfProduction;

    public String toString(){
        return producer+" "+model+" "+yearOfProduction;
    }

    abstract void turnOn();

    @Override
    public int compareTo(Device o){
        return this.yearOfProduction - o.yearOfProduction;
    }
}

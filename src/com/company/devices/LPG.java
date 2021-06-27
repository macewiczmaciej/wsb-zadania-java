package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model) {
        super(producer, model);
    }

    @Override
    protected void refuel() {
    }
}

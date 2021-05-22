package com.company;

public class Main {

    public static void main(String[] args) {

        Human Hans = new Human();
        Car passat = new Car("Volkswagen","Passat");
        passat.price = 5999.0;

        Hans.getSalary();
        Hans.setSalary(6000.0);
        Hans.getSalary();

        Hans.getCar();
        Hans.setCar(passat);
        Hans.getCar();
    }
}

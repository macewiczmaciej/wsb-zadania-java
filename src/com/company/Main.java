package com.company;

public class Main {

    public static void main(String[] args) {

        Human Hans = new Human();
        Car passat = new Car("Volkswagen","Passat");
        Hans.car = passat;

        Hans.getSalary();
        Hans.setSalary(3000.0);
        Hans.getSalary();
    }
}

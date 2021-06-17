package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

//        Human Hans = new Human();
//        Hans.firstName = "Hans";
//        Hans.lastName = "Kloss";
//        Car passat = new Car("Volkswagen","Passat");
//        Car passat1 = new Car("Volkswagen","Passat");
//
//        Animal doge = new Animal("dog");
//        doge.name = "Doge";
//
//        passat.price = 5999.0;
//
//        Hans.getSalary();
//        Hans.setSalary(6000.0);
//        Hans.getSalary();
//
//        Hans.getCar();
//        Hans.setCar(passat);
//        Hans.getCar();
//
//        System.out.println(passat.equals(passat1));
//        System.out.println(passat.hashCode());
//        System.out.println(passat1.hashCode());
//        System.out.println(passat1);
//        System.out.println(Hans);
//        System.out.println(doge);

        Phone phone1 = new Phone();
        phone1.producer = "Samsung";
        phone1.model = "Galaxy S20";
        phone1.yearOfProduction = 2019;

        System.out.println(phone1.toString());

        phone1.turnOn();
    }
}

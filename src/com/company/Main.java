package com.company;

import com.company.creatures.Animal;
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

//        Phone phone1 = new Phone();
//        phone1.producer = "Samsung";
//        phone1.model = "Galaxy S20";
//        phone1.yearOfProduction = 2019;
//
//        System.out.println(phone1.toString());
//
//        phone1.turnOn();

        Human person1 = new Human();
        Human person2 = new Human();
        person1.firstName = "Janusz";
        person2.firstName = "Mirek";
        person1.cash = 5000.0;
        person2.cash = 30000.0;
        Animal pet1 = new Animal("dog") { };
        pet1.name = "Reksio";
        Animal pet2 = new Animal("dog") { };
        pet2.name = "Burek";
        person1.pet = pet1;

        pet1.sell(person1,person2,200.0);
        person1.sell(person1,person2,1.0);

        Car car1 = new Car("Skoda", "Octavia") {
            @Override
            public void refuel() {
            }
        };
        person1.setHumanCar(car1);

        car1.sell(person1,person2,25000.0);

        Phone phone1 = new Phone();
        phone1.model = "8T";
        phone1.producer = "OnePlus";
        person1.phone = phone1;

        phone1.sell(person1,person2,2599.99);

        phone1.installAnApp("Omega",10.11,"10.38.1.23");

    }
}

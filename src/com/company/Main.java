package com.company;

import com.company.creatures.Animal;
import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Device;
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

        Human person3 = new Human();
        System.out.println(person3.garage.length);
        Human person1 = new Human(3);
        Human person2 = new Human(5);
        person1.firstName = "Janusz";
        person1.lastName = "Wójcik";
        person2.firstName = "Mirek";
        person2.lastName = "Kosecki";
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
        Car car2 = new Car("Ford","Focus"){
            @Override
            protected void refuel() {

            }
        };
        car2.price = 10000.0;
        car2.yearOfProduction = 2006;
        Car car3 = new Car("Fiat","Ducato"){
            @Override
            public void refuel(){
            }
        };
        car3.price = 12400.0;
        car3.yearOfProduction = 2010;
        car1.price = 25000.0;
        car1.yearOfProduction = 2014;
        person1.garage[0] = car1;
        person1.garage[1] = car2;
        person1.garage[2] = car3;

        Phone phone1 = new Phone();
        phone1.model = "8T";
        phone1.producer = "OnePlus";
        person1.phone = phone1;

        phone1.sell(person1,person2,2599.99);

        phone1.installAnApp("Omega",10.11,"10.38.1.23");

        person1.garageValue();
        person1.sortByOld();
        person2.setCar(car3,0);
//        person1.getGarage();
//        person2.getGarage();
        car1.setOwner(person1);
        car1.sell(person1,person2,25000.0);
//        person1.getGarage();
//        person2.getGarage();
        car3.sell(person2,person1,5000.0);
//        person1.getGarage();
//        person2.getGarage();
        car1.sell(person2,person1,4000.0);

        System.out.println(car1.getOwners());
        System.out.println(car1.humanOwner());
        System.out.println(car1.checkTransaction(person2,person1));
        System.out.println(car1.numberOfTransactions());
        System.out.println(car1.getTransactionList());

        Application app1 = new Application("teams","1.01",39.99);
        Application app2 = new Application("traficar","3.41",24.59);
        Application app3 = new Application("papa.io","21.37",20.05);
        Application app4 = new Application("messenger","1.337",0.0);

        phone1.appInstall(person1,app1);
        phone1.appInstall(person1,app2);
        phone1.appInstall(person1,app3);
        phone1.appInstall(person1,app4);

        System.out.println(phone1.isAppInstalled(app2));
        System.out.println(phone1.isAppInstalled("teams"));
        System.out.println(phone1.freeApps());
        System.out.println(phone1.totalAppsValue());
        phone1.alSortedList();
        phone1.priceSortedList();
    }
}

package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Date;

public class Human implements Salleable{
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Car[] garage;
    private Double salary = 2300.0;
    public Double cash;

    public Human(){
        garage = new Car[5];
    }
    public Human(Integer garageSize){
        garage = new Car[garageSize];
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public void garageValue(){
        double sum = 0;
        for (Car car : garage) {
            if(car != null) {
                sum += car.price;
            }
        }
        System.out.println("Wartość garażu "+this.firstName+" wynosi: "+sum);
    }

    public void sortByOld(){
        Arrays.sort(garage);
        for (Car car : garage) {
            System.out.println(car);
        }
    }

    public Car getCar(Integer position) {
        return this.garage[position];
        }

    public void setCar(Car car, Integer position){
        this.garage[position] = car;
//        car.setOwner(this);
    }
    public void getGarage(){
        System.out.println("--"+this.firstName+"'s GARAGE--");
        for (int i = 0; i < this.garage.length; i++) {
            System.out.println(this.garage[i]);
        }
    }

    public void buyCar(Car car, Integer position){
        if (car.price == null){
            this.garage[position] = car;
        }
        else {
            if (car.price<this.salary){
                this.garage[position] = car;
                System.out.println("You are so rich, car was bought by cash");
            }else if(car.price/12<this.salary){
                this.garage[position] = car;
                System.out.println("You just bought a car on credit");
            }else{
                System.out.println("Sorry bro, but you are poor!!");
            }
        }
    }

    void getSalary(){
        System.out.println(new Date());
        System.out.println("Current salary: "+salary+" PLN");
    }
    void setSalary(Double newSalary){
        if(newSalary<0){
            System.out.println("Salary should be greater than 0.");
        }
        else{
            this.salary = newSalary;
            System.out.println("-------------------------");
            System.out.println("Salary was updated.");
            System.out.println("You have to take documents from HR.");
            System.out.println("ZUS and US were informed about update.");
            System.out.println("-------------------------");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Don't try it bro! You cannot sell humans here");
    }
}

package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;
import java.util.Date;

public class Human implements Salleable{
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary = 2300.0;
    Double cash;

    public String toString(){
        return firstName+" "+lastName;
    }
    public void getCar() {
        if(car == null){
            System.out.println("Your car: You don't have a car");
        }else{
            System.out.println("Your car: "+car.producer+' '+car.model);
        }
    }
    public void setCar(Car car){
        if (car.price<this.salary){
            this.car = car;
            System.out.println("You are so rich, car was bought by cash");
        }else if(car.price/12<this.salary){
            this.car = car;
            System.out.println("You just bought a car on credit");
        }else{
            System.out.println("Sorry bro, but you are poor!!");
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

package com.company;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary = 2300.0;

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
}

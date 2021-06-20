package com.company.devices;
import com.company.Human;

public class Phone extends Device {
    public void turnOn() {
        System.out.println("The phone was turned on");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone.hashCode() == this.hashCode()){
            if(buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.phone = seller.phone;
                seller.phone = null;
                System.out.println("-------------------------");
                System.out.println("SUCCESS!");
                System.out.println(buyer.firstName+" just bought "+this.producer+" "+this.model+" for "+price+" from "+seller.firstName);
                System.out.println("-------------------------");
            }
            else{
                System.out.println(seller.firstName+" has this phone, but "+buyer+" is poor");
            }
        }
        else{
            System.out.println(seller.firstName+" is scammer, he doesn't have this phone");
        }
    }
}

package com.company.devices;
import com.company.Human;
import org.w3c.dom.ls.LSOutput;

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
    public void installAnApp(String name){
    }
    public void installAnApp(String name, Double appVersion){
    }
    public void installAnApp(String name, Double appVersion, String serverAdress){
        System.out.println("Aplikacja "+name+" v"+appVersion+" została zainstalowana z serwera "+serverAdress);
    }
    public void installAnApp(String... appNames){
    }

    static final String serverAdress = "10.38.1.23";
    static final String serverProtocol = "2137";
    static final Double appVersion = 14.88;
}

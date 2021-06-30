package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    String color;
    Double engineVolume;
    public Double price;

    public String toString(){
        return producer+" "+model;
    }
    public void turnOn() {
        System.out.println("The car was turned on");
    }
    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    List<Human> owners = new ArrayList<>(1);

    public void setOwner(Human human) {
        this.owners.add(human);
    }
    public List<Human> getOwners(){
        return owners;
    }
    public Integer getLastOwner(){
        if(owners != null && !owners.isEmpty()){
            return owners.get(owners.size()-1).hashCode();
        }else{
            return 0;
        }

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

        Integer indexBuyerNullValue = null;
        Integer indexSellerCarValue = null;

        for (int i = 0; i < seller.garage.length; i++) {
            if(seller.garage[i]!=null){
                if (seller.garage[i].hashCode() == this.hashCode()) {
                    indexSellerCarValue = i;
                    break;
                }
            }
        }

        int j = 0;
        while (buyer.garage.length > j) {
            if (buyer.garage[j] == null) {
                indexBuyerNullValue = j;
                break;
            }
            j++;
        }
        if (getLastOwner() != seller.hashCode()){
            System.out.println("Seller is not last owner of this car");
        }
        else if (indexSellerCarValue == null){
            System.out.println("There no car in seller garage!");
        }
        else if (indexBuyerNullValue == null){
            System.out.println("There no space in buyer garage");
        }else if (buyer.cash < price){
            System.out.println("Buyer has no money");
        }else{
            System.out.println("--------");
            System.out.println("SUCCESS");
            System.out.println(buyer.firstName+" just bought "+this.producer+" "+this.model+" from "+seller.firstName+" for "+price);
            System.out.println("--------");
            buyer.setCar(seller.getCar(indexSellerCarValue),indexBuyerNullValue);
            seller.setCar(null,indexSellerCarValue);
            buyer.cash -= price;
            seller.cash += price;
            setOwner(buyer);
        }

    }

    public boolean humanOwner(){
        if (this.owners.size() > 1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkTransaction(Human humanA,Human humanB) {
        for (int i = 0; i < this.owners.size()-1; i++) {
            if (this.owners.get(i) == humanA & this.owners.get(i+1) == humanB) {
                return true;
            }
        }return false;
    }
    protected abstract void refuel();
}

package com.company.devices;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.company.Human;

public class Transaction{
    public Human seller;
    public Human buyer;
    public double price;
    Date date = new Date();

    public Transaction(Human seller, Human buyer, double price){
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
    }
    public String toString(){
        return "Seller: "+seller+"; Buyer: "+buyer+"; Price: "+price+"; Date: "+date;
    }
}

package com.company.devices;
import com.company.Human;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

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

    HashSet<Application> appList = new HashSet<Application>();

    public void appInstall(Human owner, Application app){
        if(owner.cash<=app.appPrice){
            System.out.println("Owner has no money");
        }else{
            appList.add(app);
            owner.cash -= app.appPrice;
        }
    }
    public boolean isAppInstalled(Application app){
        if (this.appList.contains(app)) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isAppInstalled(String appName){
        for (Application application : appList) {
            if (application.appName == appName){
                return true;
            }
        }return false;
    }
    public String freeApps(){
        HashSet<Application> freeApps = new HashSet<Application>();
        for (Application application : appList) {
            if (application.appPrice == 0.0){
                freeApps.add(application);
            }
        }return "Freee apps: "+freeApps;
    }
    public String totalAppsValue(){
        double total = 0.0;
        for (Application application : appList) {
            total += application.appPrice;
        }
        return "Total value of apps: "+total;
    }

    public void alSortedList(){
        List<Application> alAppList = new ArrayList<Application>(appList);
        Collections.sort(alAppList);
        System.out.println(alAppList);
    }
    public void priceSortedList(){
        List<Application> priceAppList = new ArrayList<Application>(appList);
        Collections.sort(priceAppList, new AppComparator());
        System.out.println(priceAppList);
    }
}

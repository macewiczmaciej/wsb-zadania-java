package com.company.devices;

import java.util.Comparator;

public class Application implements Comparable<Application> {

    public Application(String appName, String appVersion, double appPrice){
        this.appName = appName;
        this.appVersion = appVersion;
        this.appPrice = appPrice;
    }

    @Override
    public String toString() {
        return "appName='" + appName + '\'' +
                "; appVersion='" + appVersion + '\'' +
                "; appPrice=" + appPrice;
    }

    public String appName;
    public String appVersion;
    public double appPrice;

    @Override
    public int compareTo(Application o) {
        int result = this.appName.compareTo(o.appName);
        return result;
    }

}

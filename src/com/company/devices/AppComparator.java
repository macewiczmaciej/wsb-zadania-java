package com.company.devices;

import java.util.Comparator;

public class AppComparator implements Comparator<Application> {

    @Override
    public int compare(Application o1, Application o2) {
        int result;
        if(o1.appPrice > o2.appPrice) return 1;
        if(o2.appPrice > o1.appPrice) return -1;
        return 0;
    }
}

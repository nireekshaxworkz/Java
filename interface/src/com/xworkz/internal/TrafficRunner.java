package com.xworkz.internal;

public class TrafficRunner {
    public static void main(String[] args) {
        TrafficRule trafficRule=new MysoreTraffic();
        BengaloreTraffic bengaloreTraffic=new BengaloreTraffic(trafficRule);
        bengaloreTraffic.check();

    }
}

package com.xworkz.internal;

public class BengaloreTraffic {
    private TrafficRule trafficRule;

    public BengaloreTraffic(TrafficRule trafficRule) { //constructor
        this.trafficRule = trafficRule;
    }

    public void check(String regNo) {
        System.out.println("running signal in BengaloreTraffic");
        if (trafficRule != null) {
            String valid = trafficRule.licenceNo(regNo);
            System.out.println("register no:" + valid);
            if (valid != null) {
                System.out.println("check are on");
            } else {
                System.out.println("check is off");
            }else
            {
                System.out.println("trafficRule is null");
            }
        }
    }
}

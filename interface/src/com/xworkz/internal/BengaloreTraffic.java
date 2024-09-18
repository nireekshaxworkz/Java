package com.xworkz.internal;



public class BengaloreTraffic {
    private TrafficRule trafficRule;

    public BengaloreTraffic(TrafficRule trafficRule){ //constructor
        this.trafficRule=trafficRule;
    }
    public void check(){
        if(trafficRule!=null){
            System.out.println("trafficRule is not null");
        }
        else{
            System.out.println("=============");
        }
        String valid=trafficRule.licenceNo();
        if(valid!=null){
            System.out.println("trafficRule is null");
        }
    }
}

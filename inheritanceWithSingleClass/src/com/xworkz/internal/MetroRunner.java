package com.xworkz.internal;

public class MetroRunner {
    public static void main(String[] args) {
        MetroStation metroStation;
        MetroStation metroStation1=new MysoreStation();
        MetroStation metroStation2=new BengaloreStation() {
            @Override
            public boolean noSoliciting() {
                System.out.println("noSoliciting in bengaloreStation");
                return false;
            }

            @Override
            public boolean noDrinking() {
                System.out.println(("noDrinking in bengaloreStation"));
                return false;
            }

            @Override
            public boolean noSmoking() {
                System.out.println("noSmoking in metroStation");
                return false;
            }

            @Override
            public boolean noLittering() {
                System.out.println("noLittering in metroStation");
                return false;
            }
        };
    }
}

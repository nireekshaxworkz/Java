package com.xworkz.internal;

public class MysoreStation implements MetroStation {
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
}

package com.xworkz.internal;

public class SaiPg implements PgRule{
    @Override
    public double costPerMonth() {
        return 0;
    }

    @Override
    public boolean wifi() {
        return false;
    }
}

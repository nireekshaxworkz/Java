package com.xworkz.internal;

public abstract class PgRuleRunner {
    public static void main(String[] args) {


        PgRule pgRule = new SaiPg();
        ShreePg shreePg = new ShreePg();
        shreePg.setPgRule(pgRule);
        shreePg.available();
    }
}

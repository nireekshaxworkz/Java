package com.xworkz.internal.use;

public class CricketRuleRunner {
    public static void main(String[] args) {
    CricketRule cricketRule=new KaCricketRule();
    BCCI bcci=new BCCI();
    bcci.setCricketRule(cricketRule);
    bcci.check();
}
}
package com.xworkz.internal;

public class ShreePg {
    private PgRule pgRule;

    public void setPgRule(PgRule pgRule){
        this.pgRule=pgRule;
    }
    public void available(){
        if(pgRule!=null){
            System.out.println("pgrule is not null");
            pgRule.costPerMonth();
            pgRule.wifi();
        }
        else{
            System.out.println(("pgrule is null"));
        }
    }
}

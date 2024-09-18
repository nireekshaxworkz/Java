package com.xworkz.internal;

public class MallRuleRunner {
    public static void main(String[] args) {
        MallRule mallRule=new OrionMall();
        LuluMall luluMall=new LuluMall(mallRule);
        luluMall.place();
    }
}

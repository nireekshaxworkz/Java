package com.xworkz.internal;

public class LuluMall {
    private MallRule mallRule;

    public LuluMall(MallRule mallRule){
        this.mallRule=mallRule;
    }
    public void place(){
        if(mallRule!=null){
            System.out.println("mallRule is not null");
        }
        else{
            System.out.println("mallRull is null");
        }

    }
}

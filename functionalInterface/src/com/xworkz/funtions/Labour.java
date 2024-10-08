package com.xworkz.funtions;

public class Labour {
    public void startMotor(Starter starter){
        if(starter!=null){
            System.out.println("starter is not null");
            starter.on();
        }else{
            System.out.println("starter is null");
        }

        System.out.println("exit startMotor in labour");

    }
    public void orderFood(FoodApp foodApp){
        if(foodApp!=null){
            System.out.println("foodApp is not null");
        }
        foodApp.order("idli");
    }

}

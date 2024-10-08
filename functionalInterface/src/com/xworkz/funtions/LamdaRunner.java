package com.xworkz.funtions;

public class LamdaRunner {
    public static void main(String[] args) {
        Starter starter=()->{   //lamda expression
            System.out.println("running on the lamda expression");
        };
        Labour labour=new Labour();
        labour.startMotor(starter);
    }
    FoodApp foodApp=(String item)->{
        System.out.println("foodApp contain string argument:"+item);
    };
    labour.orderFood(foodApp);
}

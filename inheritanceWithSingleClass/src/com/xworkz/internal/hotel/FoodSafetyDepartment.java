package com.xworkz.internal.hotel;

public class FoodSafetyDepartment {
    public HotelRule hotelRule;

    public void setHotelRule(HotelRule hotelRule){
        this.hotelRule=hotelRule;
    }

    public  void inspection(){
        System.out.println("running inspection in FoodSafetyDepartment");
        if(hotelRule!=null){
            System.out.println("hotelRule is not null");
            hotelRule.cleanPremises();
        }else{
            System.out.println(("hotelRule is null"));
        }
    }
}
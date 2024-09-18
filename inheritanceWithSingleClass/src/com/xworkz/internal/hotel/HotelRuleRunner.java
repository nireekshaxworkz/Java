package com.xworkz.internal.hotel;

public class HotelRuleRunner {
    public static void main(String[] args) {
        HotelRule hotelRule=new CanaraHotelRule();
        FoodSafetyDepartment foodSafetyDepartment=new FoodSafetyDepartment();
        foodSafetyDepartment.setHotelRule(hotelRule);
        foodSafetyDepartment.inspection();


    }
}

package com.xworkz.customerDTO;

public class CustomerDTORunner {
    public static void main(String[] args) {
        CustomerDTO customerDTO=new CustomerDTO("Nireeksha","nireeksh055@gmail.com","footware");
        System.out.println("name:"+customerDTO.getName());
        System.out.println("email:"+customerDTO.getEmail());
        System.out.println("productType:"+customerDTO.getProductType());
    }
}

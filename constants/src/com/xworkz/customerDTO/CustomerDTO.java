package com.xworkz.customerDTO;

public class CustomerDTO {
    private String name;
    private String email;
    private String productType;

    CustomerDTO(){

    }
    CustomerDTO(String name,String email,String productType){
        this.name=name;
        this.email=email;
        this.productType=productType;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProductType() {
        return productType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}

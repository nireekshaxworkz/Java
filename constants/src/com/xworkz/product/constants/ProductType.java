package com.xworkz.product.constants;

public enum ProductType {
    KITCHEN,FOOTWEAR,FURNITURE;
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

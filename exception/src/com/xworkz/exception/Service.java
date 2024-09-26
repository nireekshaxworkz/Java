package com.xworkz.exception;

public class Service {
    public Service(){
        super();
    }
    public void validateEmailId(String email)throws InvalidEmailException{
        System.out.println("start validateEmailId in service");
        if(email==null || email.equals("")){
            System.out.println("invalid date,will continue the exception");
            throw new InvalidEmailException();
        }
        System.out.println("valid date,will continue the exception");
    }
    public void validateAmount(double amount){
        System.out.println("start validateAmount in service");
        if(amount>0 || amount<=100) {
            System.out.println("valid price");
        }else {
            throw new InvalidAmountException();
        }
    }
}

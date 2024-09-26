package com.xworkz.exception;

public class ExceptionRunner {
    public static void main(String[] args)throws InvalidEmailException {
        Service service=new Service();
        System.out.println("before amount");
        service.validateAmount(50);
        System.out.println("after amount");
        System.out.println("before email");
        service.validateEmailId("neeriksha@gmail.com");
        System.out.println("after email");
    }
}

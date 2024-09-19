package com.xworkz.standards.repository.service;

import com.xworkz.standards.repository.Repository;
import com.xworkz.standards.repository.RepositoryImpl;

public class ServiceRunner {
    public static void main(String[] args) {
        Repository repository=new RepositoryImpl();
        Service service=new ServiceImpl(repository);
        String msg=service.push();
        System.out.println("push return:"+msg);
    }
}

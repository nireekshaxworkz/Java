package com.xworkz.standards.repository.service;

import com.xworkz.standards.repository.Repository;

public class ServiceImpl implements Service{
    private Repository repository;

    public ServiceImpl(Repository repository){
        this.repository=repository;
        System.out.println("repository param const in serviceImpl");
    }
    @Override
    public String push() {
        System.out.println("running push in serviceImpl");
        if (repository != null) {
            boolean saved = repository.save();
            if (saved) {
                System.out.println("saved in repo");
                return "sucess";
            } else {
                System.out.println("not saved in repo");
                return "failure";
            }
        }
        return "issue";
    }
}

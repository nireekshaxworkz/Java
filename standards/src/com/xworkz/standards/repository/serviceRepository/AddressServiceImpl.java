package com.xworkz.standards.repository.serviceRepository;

import com.xworkz.standards.repository.addressRepository.AddressRepository;

public class AddressServiceImpl implements AddressService{
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository=addressRepository;
    }

    @Override
    public String push() {
        if(addressRepository!=null){
            System.out.println("addressRepository is not null");
           boolean saved=addressRepository.save();
           if(saved){
               System.out.println("saved the repo");
               return "sucess";
           }else{
               System.out.println("notSaved the repo");
               return "failure";
           }
        }
        return "issue";
    }

    @Override
    public String refresh() {
        if(addressRepository!=null){
            System.out.println("addressRepository is not null");
           int values=addressRepository.update();
           if(values>1){
               System.out.println("values the repo");
               return "sucess";
           }else{
               System.out.println("notvalues the repo");
               return "failure";
           }
        }
        return "issue";
    }

    @Override
    public String remove() {
        if(addressRepository!=null){
            System.out.println("addressRepository is not null");
            addressRepository.delete();
        }else{
            System.out.println("null");
        }
        return "zero";
    }

    @Override
    public String load() {
        if(addressRepository!=null){
            String same=addressRepository.read();
            if(same!=null){
                System.out.println("same the repo");
                return "sucess";
            }else{
                System.out.println("not same the repo");
                return "failure";
            }
        }
        return "null";
    }
}

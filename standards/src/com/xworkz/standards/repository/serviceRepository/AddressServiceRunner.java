package com.xworkz.standards.repository.serviceRepository;

import com.xworkz.standards.repository.addressRepository.AddressRepository;
import com.xworkz.standards.repository.addressRepository.AddressRepositoryImpl;

public class AddressServiceRunner {
    public static void main(String[] args) {
        AddressRepository addressRepository=new AddressRepositoryImpl();
        AddressService addressService=new AddressServiceImpl(addressRepository);
       String msg=addressService.push();
        System.out.println("push msg:"+msg );
        String same=addressService.refresh();
        System.out.println("refresh msg1+");
        String delete=addressService.remove();
        System.out.println("remove delete:"+delete);
        String store=addressService.load();
        System.out.println("load add:"+store);
    }
}

package com.xworkz.standards.repository.vehicleService;

import com.xworkz.standards.repository.vehicleRepository.VehicleRepository;
import com.xworkz.standards.repository.vehicleRepository.VehicleRepositoryImpl;

public class VehicleServiceRunner {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository=new VehicleRepositoryImpl();
        VehicleService vehicleService=new VehicleServiceImpl(vehicleRepository);
        String msg=vehicleService.persist();
        System.out.println("persist msg:"+msg);
        String combine=vehicleService.merge();
        System.out.println("merge combine:"+combine);
        String decipline=vehicleService.clear();
        System.out.println("clean decipline:"+decipline);
        String type=vehicleService.search();
        System.out.println("search type:"+type);
    }
}

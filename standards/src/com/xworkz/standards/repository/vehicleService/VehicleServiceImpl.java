package com.xworkz.standards.repository.vehicleService;

import com.xworkz.standards.repository.vehicleRepository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService{
    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository){
        this.vehicleRepository=vehicleRepository;
    }
    @Override
    public String persist() {
        if(vehicleRepository!=null){
            System.out.println("vehicleRepository is not null");
            vehicleRepository.save();
        }else{
            System.out.println("null");
        }
        return "issue";
    }

    @Override
    public String merge() {
        if(vehicleRepository!=null){
            System.out.println("vehicleRepository is not null");
            vehicleRepository.update();
        }else{
            System.out.println("null");
        }
        return "issue";
    }

    @Override
    public String clear() {
        if (vehicleRepository != null) {
            System.out.println("vehicleRepository is not null");
            boolean saved = vehicleRepository.delete();
            if (saved) {
                System.out.println("saved the repo");
                return "sucess";
            } else {
                System.out.println("notSaved the repo");
                return "failure";
            }
        }
        return "issue";
    }
    @Override
    public String search() {
        if(vehicleRepository!=null){
            System.out.println("vehicleRepository is not null");
            String same=vehicleRepository.read();
            if(same!=null){
                System.out.println("saved the repo");
                return "sucess";
            }else{
                System.out.println("notSaved the repo");
                return "failure";
            }
        }
        return "issue";
    }
}

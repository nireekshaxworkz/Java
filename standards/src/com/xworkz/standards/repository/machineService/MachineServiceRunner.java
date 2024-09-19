package com.xworkz.standards.repository.machineService;

import com.xworkz.standards.repository.machineRepository.MachineRepository;
import com.xworkz.standards.repository.machineRepository.MachineRepositoryImpl;

public class MachineServiceRunner {
    public static void main(String[] args) {
        MachineRepository machineRepository=new MachineRepositoryImpl();
        MachineService machineService=new MachineServiceImpl(machineRepository);
        String msg=machineService.save();
        System.out.println("save msg:"+msg);
        String conform=machineService.update();
        System.out.println("update conform:"+conform);
        String erase=machineService.delete();
        System.out.println("delete erase:"+erase);
        String analyze=machineService.read();
        System.out.println("read analyze:"+analyze);
    }
}

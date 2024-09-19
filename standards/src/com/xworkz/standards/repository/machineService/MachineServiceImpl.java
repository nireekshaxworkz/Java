package com.xworkz.standards.repository.machineService;

import com.xworkz.standards.repository.machineRepository.MachineRepository;

public class MachineServiceImpl implements MachineService{

    private MachineRepository machineRepository;

    public MachineServiceImpl(MachineRepository machineRepository){
        this.machineRepository=machineRepository;
    }
    @Override
    public String save() {
        if(machineRepository!=null){
            System.out.println("machinePepository is not null");
            machineRepository.save();
        }else {
            System.out.println("save the repo");
            return "sucess";
        }
        return "isssue";
    }

    @Override
    public String update() {
        if(machineRepository!=null){
            System.out.println("machinePepository is not null");
           int values=machineRepository.update();
           if(values<1){
               System.out.println("update the repo");
               return "sucess";
           }else{
               System.out.println("notUpdate the repo");
               return "failure";
           }
        }
        return "issue";
    }

    @Override
    public String delete() {
        if (machineRepository!=null){
            System.out.println("machinePepository is not null");
            int valuesif (machineRepository!=null){
                System.out.println("machinePepository is not null");
                int values=machineRepository.delete();
                if(values){
                    System.out.println("delete the repo");
                    return "sucess";
                }else{
                    System.out.println("notdelete the repo");
                    return "failure";
                }
            }=machineRepository.delete();
            if(valuesif (machineRepository!=null){
                System.out.println("machinePepository is not null");
                int values=machineRepository.delete();
                if(values){
                    System.out.println("delete the repo");
                    return "sucess";
                }else{
                    System.out.println("notdelete the repo");
                    return "failure";
                }
            }){
                System.out.println("delete the repo");
                return "sucess";
            }else{
                System.out.println("notdelete the repo");
                return "failure";
            }
        }
        return "issue";
    }

    @Override
    public String read() {
        if (machineRepository!=null){
            System.out.println("machinePepository is not null");
            int values=machineRepository.read();
            if(values){
                System.out.println("read the repo");
                return "sucess";
            }else{
                System.out.println("notread the repo");
                return "failure";
            }
        }
        return "";
    }
}

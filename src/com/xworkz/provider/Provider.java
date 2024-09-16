package com.xworkz.provider;

public abstract class Provider {
    public String name;
    public String ceoName;
    public Provider(String name,String ceoName){
        super();
        this.name=name;
        this.ceoName=ceoName;
    }

    public Provider() {
        System.out.println("==========");
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", ceoName='" + ceoName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        System.out.println("equals are used");
        if(obj!=null){
            if(obj instanceof Provider){
                Provider casted=(Provider) obj;
                if(this.name.equals(casted.name)&&this.ceoName.equals(casted.ceoName))
                {
                    System.out.println("both are equal");
                    return true;
                }
            }else{
                System.out.println("obj is not a provider");
            }
        }else{
            System.out.println("object is null");
        }
        return equals(obj);
    }
    public abstract void service();

}

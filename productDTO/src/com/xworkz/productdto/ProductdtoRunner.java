package com.xworkz.productdto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ProductdtoRunner {
    public static void main(String[] args) {
        Productdto dto1=new Productdto(01,"Samsung","Nireeksha",5400);
        Productdto dt02=new Productdto(02,"Sony","Raksha",8000);
        Productdto dt03=new Productdto(03,"LG","Rakshitha",12000);
        Productdto dto4=new Productdto(04,"Vu","Leela",22000);
        Productdto dt05=new Productdto(05,"Motorola","Nancy",38000);
        Productdto dto6=new Productdto(06,"Videocon","Sonu",43000);
        Productdto dto7=new Productdto(07,"Panasonic","Harshi",52000);
        Productdto dto8=new Productdto(08,"MiByXiaomi","Keerthi",42000);
        Productdto dto9=new Productdto(09,"Hisense","Megha",7000);
        Productdto dto10=new Productdto(10,"TCL","Ananya",56800);
        Collection<String> dto=new ArrayList<String>();
        dto.add("dto1");
        dto.add("dto2");
        dto.add("dto3");
        dto.add("dto4");
        dto.add("dto5");
        dto.add("dto6");
        dto.add("dto7");
        dto.add("dto8");
        dto.add("dto9");
        dto.add("dto10");
        //collect product greaterThan 5000
        System.out.println("product greaterThan 5000");
        dto.stream().filter(ref->ref. getCost() >5000).sorted().collect(Collectors.toList())
                .forEach((ref)-> System.out.println(ref));
        //collect product lessThan 3000
        System.out.println("product lessThan 3000");
        dto.stream().filter(ref->ref.getCost()>5000 && ref.getCost()<3000).sorted().collect(Collectors.toList())
                .forEach((ref1)-> System.out.println(ref1));
         //decending order
        System.out.println("desending order");
        dto.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList())
                .forEach((ref)-> System.out.println("sorted:"+ref));
        //Vender name starts with A and sort by ascending
        System.out.println("ascending order");
        dto.stream().filter((ref)->ref.getVender().startsWith("A")).sorted((ref1,ref2)->Double.compare(ref2.getCost(),ref1.getCost())).collect(Collectors.toList())
                .forEach((ref)-> System.out.println(ref));
        //Collect product sort by cost and id
        System.out.println("cost and id");
        dto.stream().sorted((ref)->ref.getId.getCost).collect(Collectors.toList())
                .forEach((ref)-> System.out.println(ref));
        //Collect only names from prodiuct
        System.out.println("names");
        dto.stream().map(product->product.getId()).sorted().collect(Collectors.toList())
                .forEach((ref)-> System.out.println(ref));
        //collect only id from product
        System.out.println("ids");
        dto.stream().map(product->product.getId()).sorted().collect(Collectors.toList())
                .forEach((ref)-> System.out.println(ref));
        //collect product by converting name to upperCase
        System.out.println("names to upper case");
        dto.stream().map((ref)->ref.hashCode()).sorted().collect(Collectors.toList())
                .forEach((ref)-> System.out.println(ref));
    }
}

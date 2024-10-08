package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StateRunner {
    public static void main(String[] args) {
        Collection<String> collection=new LinkedList<String>();
            collection.add("AndhraPradesh");
            collection.add("ArunachalPradesh");
            collection.add("Bihar");
            collection.add("Chhattisgarh");
            collection.add("Goa");
            collection.add("Gujarat");
            collection.add("Haryana");
            collection.add("HimachalPradesh");
            collection.add("Jharkhand");
            collection.add("Karnataka");
            collection.add("Kerala");
            collection.add("MadhyaPradesh");
            collection.add("Maharashtra");
            collection.add("Manipur");
            collection.add("Meghalaya");
            collection.add("Mizoram");
            collection.add("Nagaland");
            collection.add("Odisha");
            collection.add("Punjar");
            collection.add("Rajasthan");
            collection.add("Sikkim");
            collection.add("TamilNadu");
            collection.add("Telengana");
            collection.add("Tripura");
            collection.add("Uttarakhand");
            collection.add("Uttar Pradesh");
            collection.add("WestBengal");
        System.out.println("Before Sorting");
        collection.forEach(ref-> System.out.println("States:"+ref));
        //Ascending order
        collection.stream().sorted().collect(Collectors.toList())
                .forEach(ref1-> System.out.println("States:"+ref1));
        //Descending order
        collection.stream().sorted((ref1, ref)->ref.compareTo(ref1)).collect(Collectors.toList())
                .forEach(sorted-> System.out.println("States:"+sorted));
    }
}

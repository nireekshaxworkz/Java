package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class ContactRunner {
    public static void main(String[] args) {
        Collection<Long> collection=new ArrayList<Long>();
            collection.add(6364201972L);
            collection.add(9740223172L);
            collection.add(9019337549L);
            collection.add(9900327273L);
            collection.add(9742593291L);
            collection.add(7411482718L);
            collection.add(8035254780L);
            collection.add(9380719584L);
            collection.add(7022419858L);
            collection.add(8792632915L);

        System.out.println("Before Shorting");
        collection.forEach(ref-> System.out.println("Mobile No:"+ref));
        //Asecending order
        System.out.println("Sorting in Ascending");
        collection.stream().sorted().collect(Collectors.toList())
                .forEach(ref1 ->System.out.println("Mobile No:"+ref1));
        //Descending order
        System.out.println("Shorting in Descending");
        collection.stream().sorted((ref1,ref)->ref.compareTo(ref1)).collect(Collectors.toList())
                .forEach(sorted-> System.out.println("Mobile No:"+sorted));
    }
}

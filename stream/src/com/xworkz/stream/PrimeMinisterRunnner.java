package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PrimeMinisterRunnner {
    public static void main(String[] args) {
        Collection<String> collection=new LinkedList<String>();
            collection.add("JawaharlalNehru");
            collection.add("GulzariLalNanda");
            collection.add("LalBahadurShastri");
            collection.add("GulzariLalNanda");
            collection.add("IndiraGandhi");
            collection.add("MorarjiDesai");
            collection.add("CharanSingh");
            collection.add("IndiraGandhi");
            collection.add("RajivGandhi");
            collection.add("VishwanathPratapSingh");
            collection.add("ChandraShekhar");
            collection.add("P.V.NarasimhaRao");
            collection.add("AtalBihariVajpayee");
            collection.add("H.D.DeveGowda");
            collection.add("InderKumarGujral");
            collection.add("MonmohanSingh");
            collection.add("NarendraModi");

        System.out.println("Before Shorting");
        collection.forEach(ref-> System.out.println("Names:"+ref));

        //Ascending order
        collection.stream().sorted().collect(Collectors.toList())
                        .forEach(ref1-> System.out.println("Names:"+ref1));
        //Descending order
        collection.stream().sorted((ref,ref1)->ref.compareTo(ref1)).collect(Collectors.toList())
                .forEach(sorted-> System.out.println("Names:"+sorted));

    }
}

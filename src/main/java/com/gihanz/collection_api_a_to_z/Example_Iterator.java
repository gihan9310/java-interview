package com.gihanz.collection_api_a_to_z;

import java.util.ArrayList;
import java.util.Iterator;

public class Example_Iterator {

    public static void main(String[] args) {

        ArrayList<String>  strings = new ArrayList<>();
        strings.add("Gihan");
        strings.add("kumara");
        strings.add("saman");
        strings.add("jana");

        strings.remove("Gihan");

        Iterator<String> iterator = strings.iterator();
        System.out.println("iterator "+iterator);

        while (iterator.hasNext()){
            System.out.println("iterator "+iterator.next());
        }

    }
}

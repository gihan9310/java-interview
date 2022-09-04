package com.gihanz.collection_api_a_to_z;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set<String> hasSet = new HashSet<>();
        Set<String> linkHashSet = new LinkedHashSet<>();
        Set<String> threeSet = new TreeSet<>();
        linkHashSet.add(null);
        linkHashSet.add(null);

        System.out.println(linkHashSet);

//        hasSet.add(null);
//        hasSet.add(null);
    }
}

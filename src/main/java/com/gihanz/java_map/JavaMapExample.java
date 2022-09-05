package com.gihanz.java_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaMapExample {

    public static void main(String[] args) {

        Map<Integer,String> map  = new HashMap<>();
        map.put(null,"");
        Map<Integer,String> linkedHasMap  = new LinkedHashMap<>();
        linkedHasMap.put(null,"Fuck");

        /*
            Methods in map interface
         */
        map.put(2,null);
        map.put(1,"F"); // (1) put
        map.put(1,"F"); // (1) put No compilation or run time Error
        map.putAll(linkedHasMap); // putAll
        map.putIfAbsent(1,"F"); // putIfAbsent
        map.remove(2); // remove return value type if String string
        map.remove(1,"SS"); // remove with object & key using return type boolean
        map.keySet(); // return set --->  get All unique key set
        map.clear(); // reset the map
        map.containsKey(1); // check key is aviable or not return type boolean
        map.containsValue(""); // check specific value is present or no return type boolean
        map.equals(""); // check value found in map or not
        map.get(1); // get value from using key
        map.merge(2,"ff",(s, s2) -> String.valueOf(s2==null));
        map.replace(1,"J"); // value replace
//        map.replaceAll();
        map.size();// get map size
    }
}

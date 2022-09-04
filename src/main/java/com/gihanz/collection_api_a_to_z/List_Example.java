package com.gihanz.collection_api_a_to_z;

import java.util.*;

public class List_Example {

    public static void main(String[] args) {

        /*
            list class implementation
                * ArrayList
                * LinkedList
                * Vector
                * Stack
         */

        List<String> arrayList = new ArrayList();
        List<String> linkList = new LinkedList();
        List<String> vectorList = new Vector<>();
        List <Stack> stackList = new Stack();

        /*
                 * ArrayList
         */

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        /*
         * LinkedList
         */

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add(null);
        al.add(null);
        /*
         * Vector
         */
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
    }
}

package com.gihanz.collection_api_a_to_z;

import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj z");
        queue.add("Raj x");
        queue.add("Raj x");
//        queue.add(null);

        queue.forEach(s -> {
            System.out.println(s);
        });
    }
}

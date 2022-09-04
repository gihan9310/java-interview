package com.gihanz.lamda_concepts;

import com.gihanz.lamda_concepts.dtos.FilterInterface;

public class ExampleOne {

    /*
    The Lambda expression is used to provide the implementation of an interface which has functional interface.
        (1) To provide the implementation of Functional interface.
        (2) Less coding.

        1) Argument-list: It can be empty or non-empty as well.
        2) Arrow-token: It is used to link arguments-list and body of expression.
        3) Body: It contains expressions and statements for lambda expression.
     */

    public static void main(String[] args) {

        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
    }

    public static boolean isSqureNumber(int number){

        FilterInterface v =(x)->{
            return x%2==0;
        };
       return v.filterData(number);
    }
}

package com.gihanz.java_classes;

public  class X {

    public class Saman{

    }

    public Saman getSaman(){

        return  new Saman();
    }
}


class Main{
    public static void main(String[] args) {

        X x = new X();
        X.Saman saman = x.getSaman();


    }
}

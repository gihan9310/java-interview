package com.gihanz.design_pattern;

public class Singletone {

    private static String connection = null;

    private Singletone(){

    }

    public static String getNewConnection()throws Exception{

        if(connection==null){
            connection ="new conection create.............";
        }
        return connection;
    }
}

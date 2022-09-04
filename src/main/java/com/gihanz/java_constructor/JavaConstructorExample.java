package com.gihanz.java_constructor;

/*
    In other words, a constructor is a special type of method that is
    used to initialize instance variables in a class.

    Java constructor can perform any action but specially designed to
    perform initializing actions, such as initializing the instance variables.

    Default Constructor (No-argument constructor)
    Parameterized Constructor (Argument constructor)
 */
public class JavaConstructorExample {

    public static void main(String[] args) {
       // Student  student = new Student();
    }
}

class Person{

    private String name;
    private String address;

     Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

/*
If you apply a private access modifier with a java constructor,
you cannot create an object of that class in other classes.
 */
class Student extends Person{

    public Student(){
         super("","");

     }

     void getAll(){
        
     }
}

/*
    Constructor chaining in Java is a technique of calling one constructor
    from within another constructor by using this and super keywords.
 */

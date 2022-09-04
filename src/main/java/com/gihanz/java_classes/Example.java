package com.gihanz.java_classes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
     In Java, static is a keyword that can be applied with variables,
     methods, inner classes, and blocks. We cannot declare a class
     with static keyword but inner class can be declared as static.
     When an inner class is defined with a static modifier inside the body of another class,
 it is known as static nested class in Java
 */
public class Example {
    public static void main(String[] args) {

        int arr[]  = {1,1,2,3,4,5,7,4,3,2,8,4,5,5,2};
        List<Integer> converterList = new ArrayList<>();
        Arrays.stream(arr).forEach(value -> {converterList.add(value);});
        HashMap<Integer, Long> map = converterList.stream().collect( Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        System.out.println("map : "+map);


    }
}


class A{

    void sout(){
        B b = new B();
        b.name ="fff";
    }
//inner class can be declared as static.
    static class  B{
        String name;
        String address;
    }
}

/*
    An abstract class is a class which is declared with abstract keyword. It is just like a normal class
     but has two differences.
    1. We cannot create an object of this class. Only objects of its non-abstract (or concrete)
    sub-classes can be created.
    2. It can have zero or more abstract methods that are not allowed in a non-abstract class (concrete class).
 */
abstract class AbstractClass{

     void method(){
        System.out.println("XXXXXXXXX : ");
    }

     abstract int sumNumber(int x ,int j);
}

class IMPL extends AbstractClass{

    @Override
    int sumNumber(int x, int j) {
        return 0;
    }

    @Override
    void method() {
        super.method();
    }
}

    /*
        Private class

        An outer class (top-level class) cannot be declared with a private access modifier, but an inner class
         can be declared as private. An inner class is a member of outer class.
     */

package com.gihanz.oop_concepts;

import com.gihanz.oop_concepts.dtos.ChildDTO;
import com.gihanz.oop_concepts.dtos.FatherDTO;

public class Examples {

    public static void main(String[] args) {

        /*
            Inheritance  |->>>  When one object acquires all the properties and behaviors
             of a parent object, it is known as inheritance.
            It provides code reusability. It is used to achieve runtime polymorphism.
         */
//        FatherDTO obj = new ChildDTO();
//        obj.printSomethig();

        /*
             Polymorphism ===>>>> If one task is performed in different ways, it is known as polymorphism.
              For example: to convince
             the customer differently, to draw something, for example, shape, triangle, rectangle, etc.

         */

        /*
            Abstraction - >> Hiding internal details and showing functionality is known as abstraction.
             For example phone call, we don't know the internal processing.
                In Java, we use abstract class and interface to achieve abstraction.
         */

        /*
            Encapsulation -- >> Binding (or wrapping) code and data together into a single unit are
            known as encapsulation. For example, a capsule, it is wrapped with different medicines.
            A java class is the example of encapsulation. Java bean is the fully
             encapsulated class because all the data members are private here.
         */

        /*
            Coupling ---||---> Coupling refers to the knowledge or information or dependency of another class.
            It arises when classes are aware of each other. If a class has the details
             information of another class, there is strong coupling. In Java, we use private,
             protected, and public modifiers to display the visibility level of a class, method, and field.
            You can use interfaces for the weaker coupling because there is no concrete implementation.
         */


        /*
            Cohesion --->> ||--- > Cohesion refers to the level of a component which performs a single
            well-defined task. A single well-defined task is done by a highly cohesive method.
            The weakly cohesive method will split the task into separate parts.

             The java.io package is a highly cohesive package because it has I/O related classes and interface.
              However, the java.util package is a weakly cohesive package because it has unrelated classes
              and interfaces.

         */
    }
}


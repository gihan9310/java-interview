package com.gihanz.oop_concepts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data()
@NoArgsConstructor()
@AllArgsConstructor()
@ToString()
public class ChildDTO implements Methods{

    String degree;

    public void printSomethigX() {
//        super.printSomethig();
        System.out.println(" hi SON");
    }
}

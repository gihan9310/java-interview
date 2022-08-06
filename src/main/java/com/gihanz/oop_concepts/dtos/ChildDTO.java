package com.gihanz.oop_concepts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data()
@NoArgsConstructor()
@AllArgsConstructor()
@ToString()
public class ChildDTO  extends FatherDTO{

    String degree;

    @Override
    public void printSomethig() {
//        super.printSomethig();
        System.out.println(" hi SON");
    }
}

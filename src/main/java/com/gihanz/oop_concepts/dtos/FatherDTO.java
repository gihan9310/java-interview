package com.gihanz.oop_concepts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data()
@NoArgsConstructor()
@AllArgsConstructor()
@ToString()
public class FatherDTO {

    String surName;
    String address;

    public void printSomethig(){
        Methods childDTO = new ChildDTO();
        childDTO.printSomethigX();
    }

}

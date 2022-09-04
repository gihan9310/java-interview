package com.gihanz.lamda_concepts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data()
@ToString()
@AllArgsConstructor()
@NoArgsConstructor()
public class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
}

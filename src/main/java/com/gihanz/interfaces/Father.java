package com.gihanz.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data()
@ToString()
@NoArgsConstructor
@AllArgsConstructor()
public class Father {

     String name;
     String address;

    public void showName() {
        System.out.println("Name : "+name);
    }
}

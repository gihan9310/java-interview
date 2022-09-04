package com.gihanz.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data()
@ToString()
//@NoArgsConstructor
//@AllArgsConstructor()
public class Son extends Father implements AddionCapabilities ,Test{

    public Son(String name, String address) {
        super(name, address);
    }

    @Override
    public void showName() {
        super.showName();
    }

    @Override
    public void displayName() {
        System.out.println("Ok");
    }
}

//java Class -> pri interface

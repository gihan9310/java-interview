package com.gihanz.stram_api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data()
@NoArgsConstructor()
@AllArgsConstructor()
@ToString()
public class StudentDTO {

    private long id;
    private String name;
    private String address;
    private int age;

    public void  addAge(int yeas){
        this.age+=yeas;
    }

    public static List<StudentDTO> getDemoStudentList() {
        List<StudentDTO> tempList = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            tempList.add(new StudentDTO(i + 1, "Name : " + i + 1, "No " + i + "Colombo " + i, 60 - i));
        }

        return tempList;
    }

    public static StudentDTO[] getArray() {
        StudentDTO[] tempList = new StudentDTO[40];
        for (int i = 0; i < 40; i++) {
            tempList[i]=new StudentDTO(i + 1, "Name : " + i + 1, "No " + i + "Colombo " + i, 60 - i);
        }

        return tempList;
    }
}

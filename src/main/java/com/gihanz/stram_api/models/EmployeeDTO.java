package com.gihanz.stram_api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data()
@ToString()
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private int id;
    private String name;
    private Double basicSalary;
    private Double allowance;
    private Double totalSalary;


    public Double getTotalSalary() {
        return this.basicSalary + this.allowance;
    }

    public static List<EmployeeDTO> getTempList() {

        List<EmployeeDTO> list = new ArrayList<>();
        list.add(new EmployeeDTO(1, "A", 80000d, 20000d, 100000d));
        list.add(new EmployeeDTO(2, "B", 90000d, 30000d, 120000d));
        list.add(new EmployeeDTO(3, "C", 100000d, 40000d, 140000d));
        list.add(new EmployeeDTO(4, "D", 100000d, 50000d, 150000d));
        list.add(new EmployeeDTO(5, "E", 110000d, 80000d, 190000d));
        list.add(new EmployeeDTO(6, "F", 150000d, 100000d, 250000d));

        return list;
    }
}

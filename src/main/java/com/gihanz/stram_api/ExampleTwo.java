package com.gihanz.stram_api;

import com.gihanz.stram_api.models.EmployeeDTO;
import com.gihanz.stram_api.models.StudentDTO;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleTwo {

    private static float EPF_COMPANY=12.5f; //
    private static float EPF_Emplyee=8.5f; //

    public static void main(String[] args) {

        List<EmployeeDTO> tempList = EmployeeDTO.getTempList();

        Double totalSalaryForMonth = tempList.stream().map(obj -> obj.getBasicSalary() + obj.getAllowance()).collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println("Total Salary : " +totalSalaryForMonth);
        Double totalSalaryFormTotal = tempList.stream().map(obj -> obj.getTotalSalary()).collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println("totalSalaryFormTotal : " +totalSalaryFormTotal);
        Double companyTotalCostForETF = tempList.stream().map(obj -> obj.getBasicSalary() * (EPF_COMPANY / 100)).collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println("companyTotalCostForETF : "+companyTotalCostForETF);
        Double employeeTotalCostForETF = tempList.stream().map(obj -> obj.getBasicSalary() * (EPF_Emplyee / 100)).collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println("employeeTotalCostForETF : "+employeeTotalCostForETF);

        Double totalMoneyForMonth = totalSalaryForMonth -(employeeTotalCostForETF)+companyTotalCostForETF;
        System.out.println("totalMoneyForMonth Company: "+totalMoneyForMonth);

        HashMap<EmployeeDTO, Double> emplyeeFinalPayemnts = tempList.stream().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.summingDouble(v ->v.getAllowance()+ (v.getBasicSalary() * (1 - (EPF_Emplyee / 100))))));
//        System.out.println("emplyeeFinalPayemnts : "+emplyeeFinalPayemnts);

        HashMap<String, Float> nameAndSalary = new HashMap<>();
        emplyeeFinalPayemnts.forEach((dto, aDouble) -> {
            nameAndSalary.put(dto.getName(),Float.parseFloat(aDouble+""));
        });
        System.out.println("nameAndSalary : "+nameAndSalary);

    }
}

package com.xworkz.abcd.dto;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private String departmentType;
    private String departmentName;
    private EmployeeDetails employeeDetails;


}

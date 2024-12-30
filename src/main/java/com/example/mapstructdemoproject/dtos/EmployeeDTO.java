package com.example.mapstructdemoproject.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {

    private Long empId;
    private String empName;
    private String email;
    private String salary;
    private DepartmentDTO department;

}

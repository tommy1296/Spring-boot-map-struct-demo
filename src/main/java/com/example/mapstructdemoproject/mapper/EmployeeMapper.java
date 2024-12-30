package com.example.mapstructdemoproject.mapper;

import com.example.mapstructdemoproject.dtos.EmployeeDTO;
import com.example.mapstructdemoproject.models.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {DepartmentMapper.class})
public interface EmployeeMapper {

    @Mappings({
            @Mapping(source = "empName", target = "name"),
            @Mapping(source = "empId", target = "id"),
            @Mapping(source = "department", target = "department")
    })
    Employee toEntity(EmployeeDTO employeeDTO);

    @Mapping(source = "name", target = "empName")
    @Mapping(source = "id", target = "empId")
    @Mapping(source = "department", target = "department")
    EmployeeDTO toDTO(Employee employee);

}

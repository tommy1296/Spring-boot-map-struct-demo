package com.example.mapstructdemoproject.mapper;

import com.example.mapstructdemoproject.dtos.DepartmentDTO;
import com.example.mapstructdemoproject.models.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    Department toEntity(DepartmentDTO departmentDTO);

    DepartmentDTO toDTO(Department department);

}

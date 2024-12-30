package com.example.mapstructdemoproject.services;

import com.example.mapstructdemoproject.dtos.EmployeeDTO;
import com.example.mapstructdemoproject.mapper.EmployeeMapper;
import com.example.mapstructdemoproject.models.Employee;
import com.example.mapstructdemoproject.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee savedEmployee = employeeRepository.save(employeeMapper.toEntity(employeeDTO));
        return employeeMapper.toDTO(savedEmployee);
    }

    public EmployeeDTO findById(Long id) {
        return employeeRepository.findById(id)
                .map(employeeMapper::toDTO)
                .orElse(null);
    }

}

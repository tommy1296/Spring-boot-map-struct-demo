package com.example.mapstructdemoproject.controllers;

import com.example.mapstructdemoproject.dtos.EmployeeDTO;
import com.example.mapstructdemoproject.models.Employee;
import com.example.mapstructdemoproject.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDTO> addEmployee(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.findById(id));
    }

}

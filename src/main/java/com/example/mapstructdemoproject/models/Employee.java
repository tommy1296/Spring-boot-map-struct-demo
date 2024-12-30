package com.example.mapstructdemoproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private float salary;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id", foreignKey = @ForeignKey(name = "emp_dept_fk"))
    private Department department;

}

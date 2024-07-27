package com.thantrick.Springboot_RDS_Demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_tbl")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double salary;
}

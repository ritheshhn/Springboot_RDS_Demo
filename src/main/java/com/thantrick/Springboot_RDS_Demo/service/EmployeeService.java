package com.thantrick.Springboot_RDS_Demo.service;

import com.thantrick.Springboot_RDS_Demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity addEmployee(EmployeeEntity emp);

    EmployeeEntity getEmployeeById(int id);
    List<EmployeeEntity> getAllEmployees();
    List<EmployeeEntity> getEmployeeSalaryBetween(double sal1, double sal2);
    EmployeeEntity updateEmployee(EmployeeEntity emp);
    void deleteEmployee(int id);
}

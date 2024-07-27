package com.thantrick.Springboot_RDS_Demo.service;

import com.thantrick.Springboot_RDS_Demo.Repository.EmployeeRepository;
import com.thantrick.Springboot_RDS_Demo.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public EmployeeEntity getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<EmployeeEntity> getEmployeeSalaryBetween(double sal1, double sal2) {
        //return employeeRepository.findBySalaryLestThan;
        return null;
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}

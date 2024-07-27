package com.thantrick.Springboot_RDS_Demo.controller;

import com.thantrick.Springboot_RDS_Demo.entity.EmployeeEntity;
import com.thantrick.Springboot_RDS_Demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    public EmployeeEntity addEmployee(@RequestBody() EmployeeEntity emp){
        return employeeService.addEmployee(emp);
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("{sal1}/{sal2}")
    public List<EmployeeEntity> getAllEmployeesSalaryRange(@PathVariable int sal1, @PathVariable int sal2){
        return employeeService.getEmployeeSalaryBetween(sal1, sal2);
    }

    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity emp){
        return employeeService.updateEmployee(emp);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}

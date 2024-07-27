package com.thantrick.Springboot_RDS_Demo.Repository;

import com.thantrick.Springboot_RDS_Demo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}

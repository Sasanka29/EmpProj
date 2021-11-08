package com.springboot.empDeptManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.empDeptManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

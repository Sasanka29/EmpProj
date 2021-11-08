package com.springboot.empDeptManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.empDeptManagement.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}

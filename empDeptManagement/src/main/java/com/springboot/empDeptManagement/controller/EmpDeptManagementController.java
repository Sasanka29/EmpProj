package com.springboot.empDeptManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.empDeptManagement.dto.EmpDeptMangDTO;
import com.springboot.empDeptManagement.entity.Employee;
import com.springboot.empDeptManagement.repository.DepartmentRepository;
import com.springboot.empDeptManagement.repository.EmployeeRepository;

@RestController
@RequestMapping(value="/empDeptMang-api")
public class EmpDeptManagementController {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@Autowired
	private DepartmentRepository deptRepository;

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody EmpDeptMangDTO empDeptMangDTO ) {
		return empRepository.save(empDeptMangDTO.getEmployee());
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	
}


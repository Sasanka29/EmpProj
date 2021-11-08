package com.springboot.empDeptManagement.dto;

import com.springboot.empDeptManagement.entity.Employee;

public class EmpDeptMangDTO {
	
	private Employee employee;
	
	
	public EmpDeptMangDTO(Employee employee) {
		super();
		this.employee = employee;
	}
	

	public EmpDeptMangDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmpDeptMangDTO [employee=" + employee + "]";
	}
	
	

}

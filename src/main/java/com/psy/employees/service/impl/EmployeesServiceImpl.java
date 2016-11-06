package com.psy.employees.service.impl;

import java.util.List;

import com.psy.employees.biz.EmployeesBiz;
import com.psy.employees.service.EmployeesService;
import com.psy.employees.vo.EmployeesVO;

public class EmployeesServiceImpl implements EmployeesService {

	private EmployeesBiz employeesBiz;

	public void setEmployeesBiz(EmployeesBiz employeesBiz) {
		this.employeesBiz = employeesBiz;
	}
	
	@Override
	public List<EmployeesVO> viewAllEmployees() {
		return employeesBiz.viewAllEmployees();
	}
	@Override
	public boolean doAddNewEmployee(EmployeesVO employee) {
		return employeesBiz.doAddNewEmployee(employee);
	}
	@Override
	public boolean doDeleteEmployee(String employeeId) {
		return employeesBiz.doDeleteEmployee(employeeId);
	}
	@Override
	public EmployeesVO getEmployeeById(String employeeId) {
		return employeesBiz.getEmployeeById(employeeId);
	}
	@Override
	public boolean doLevelUpEmployeePosition(String employeeId) {
		return employeesBiz.doLevelUpEmployeePosition(employeeId);
	}
	@Override
	public boolean doModifyJobId(EmployeesVO employee) {
		return employeesBiz.doModifyJobId(employee);
	}
}

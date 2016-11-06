package com.psy.employees.service;

import java.util.List;

import com.psy.employees.vo.EmployeesVO;

public interface EmployeesService {

	public List<EmployeesVO> viewAllEmployees();

	public boolean doAddNewEmployee(EmployeesVO employee);

	public boolean doDeleteEmployee(String employeeId);

	public EmployeesVO getEmployeeById(String employeeId);

	public boolean doLevelUpEmployeePosition(String employeeId);

	public boolean doModifyJobId(EmployeesVO employee);

}

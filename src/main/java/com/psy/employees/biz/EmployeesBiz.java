package com.psy.employees.biz;

import java.util.List;

import com.psy.employees.vo.EmployeesVO;

public interface EmployeesBiz {

	public List<EmployeesVO> viewAllEmployees();

	public boolean doAddNewEmployee(EmployeesVO employee);

	public boolean doDeleteEmployee(String employeeId);

	public EmployeesVO getEmployeeById(String employeeId);

	public boolean doLevelUpEmployeePosition(String employeeId);

}

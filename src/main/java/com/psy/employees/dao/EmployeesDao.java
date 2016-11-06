package com.psy.employees.dao;

import java.util.List;

import com.psy.employees.vo.EmployeesVO;

public interface EmployeesDao {

	public List<EmployeesVO> viewAllEmployees();

	public int doAddNewEmployee(EmployeesVO employee);

	public int doDeleteEmployee(String employeeId);

	public EmployeesVO getEmployeeById(String employeeId);

	public int doLevelUpEmployeePosition(String employeeId);

	public int doModifyJobId(EmployeesVO employee);

}

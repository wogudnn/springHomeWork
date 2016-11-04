package com.psy.employees.biz.impl;

import java.util.List;

import com.psy.employees.biz.EmployeesBiz;
import com.psy.employees.dao.EmployeesDao;
import com.psy.employees.vo.EmployeesVO;

public class EmployeesBizImpl implements EmployeesBiz {

	private EmployeesDao employeesDao;

	public void setEmployeesDao(EmployeesDao employeesDao) {
		this.employeesDao = employeesDao;
	}
	
	@Override
	public List<EmployeesVO> viewAllEmployees() {
		return employeesDao.viewAllEmployees();
	}
	@Override
	public boolean doAddNewEmployee(EmployeesVO employee) {
		return employeesDao.doAddNewEmployee(employee)>0;
	}
	
	@Override
	public boolean doDeleteEmployee(String employeeId) {
		return employeesDao.doDeleteEmployee(employeeId)>0;
	}
	@Override
	public EmployeesVO getEmployeeById(String employeeId) {
		return employeesDao.getEmployeeById(employeeId);
	}
	@Override
	public boolean doLevelUpEmployeePosition(String employeeId) {
		return employeesDao.doLevelUpEmployeePosition(employeeId)>0;
	}
}

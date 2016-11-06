package com.psy.employees.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.psy.employees.dao.EmployeesDao;
import com.psy.employees.vo.EmployeesVO;

public class EmployeesDaoImpl extends SqlSessionDaoSupport implements EmployeesDao {

	@Override
	public List<EmployeesVO> viewAllEmployees() {
		return getSqlSession().selectList("employeesDao.viewAllEmployees");
	}
	@Override
	public int doAddNewEmployee(EmployeesVO employee) {
		return getSqlSession().insert("employeesDao.doAddNewEmployee",employee);
	}
	@Override
	public int doDeleteEmployee(String employeeId) {
		return getSqlSession().delete("employeesDao.doDeleteEmployee", employeeId);
	}
	@Override
	public EmployeesVO getEmployeeById(String employeeId) {
		return getSqlSession().selectOne("employeesDao.getEmployeeById", employeeId);
	}
	@Override
	public int doLevelUpEmployeePosition(String employeeId) {
		return getSqlSession().update("employeesDao.doLevelUpEmployeePosition");
	}
	@Override
	public int doModifyJobId(EmployeesVO employee) {
		logger.info(employee.getJobId());
		logger.info(employee.getEmployeeId());
		return getSqlSession().update("employeesDao.doModifyJobId",employee);
	}
}

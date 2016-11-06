package com.psy.departments.biz.impl;

import java.util.List;
import java.util.Map;

import com.psy.departments.biz.DepartmentsBiz;
import com.psy.departments.dao.DepartmentsDao;
import com.psy.departments.vo.DepartmentsVO;

public class DepartmentsBizImpl implements DepartmentsBiz {

	private DepartmentsDao departmentsDao;

	public void setDepartmentsDao(DepartmentsDao departmentsDao) {
		this.departmentsDao = departmentsDao;
	}
	
	@Override
	public List<DepartmentsVO> viewAllDepartments() {
		return departmentsDao.viewAllDepartments();
	}
	
	@Override
	public boolean doSelectDepartment(Map<String, String> forSelectDepartment) {
		return departmentsDao.doSelectDepartment(forSelectDepartment)>0;
	}
	@Override
	public boolean doAddNewDepartment(DepartmentsVO department) {
		return departmentsDao.doAddNewDepartment(department)>0;
	}
	@Override
	public boolean doDeleteDepartment(String departmentId) {
		return departmentsDao.doDeleteDepartment(departmentId)>0;
	}
}

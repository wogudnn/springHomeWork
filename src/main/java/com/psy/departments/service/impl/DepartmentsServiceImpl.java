package com.psy.departments.service.impl;

import java.util.List;
import java.util.Map;

import com.psy.departments.biz.DepartmentsBiz;
import com.psy.departments.service.DepartmentsService;
import com.psy.departments.vo.DepartmentsVO;

public class DepartmentsServiceImpl implements DepartmentsService {

	private DepartmentsBiz departmentsBiz;

	public void setDepartmentsBiz(DepartmentsBiz departmentsBiz) {
		this.departmentsBiz = departmentsBiz;
	}
	
	@Override
	public List<DepartmentsVO> viewAllDepartments() {
		return departmentsBiz.viewAllDepartments();
	}
	
	@Override
	public boolean doSelectDepartment(Map<String, String> forSelectDepartment) {
		return departmentsBiz.doSelectDepartment(forSelectDepartment);
	}
	@Override
	public boolean doAddNewDepartment(DepartmentsVO department) {
		return departmentsBiz.doAddNewDepartment(department);
	}
	@Override
	public boolean doDeleteDepartment(String departmentId) {
		return departmentsBiz.doDeleteDepartment(departmentId);
	}
}

package com.psy.departments.service;

import java.util.List;
import java.util.Map;

import com.psy.departments.vo.DepartmentsVO;

public interface DepartmentsService {

	public List<DepartmentsVO> viewAllDepartments();

	public boolean doSelectDepartment(Map<String, String> forSelectDepartment);

	public boolean doAddNewDepartment(DepartmentsVO department);

	public boolean doDeleteDepartment(String departmentId);

}

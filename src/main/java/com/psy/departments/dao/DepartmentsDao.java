package com.psy.departments.dao;

import java.util.List;
import java.util.Map;

import com.psy.departments.vo.DepartmentsVO;

public interface DepartmentsDao {

	public List<DepartmentsVO> viewAllDepartments();

	public int doSelectDepartment(Map<String, String> forSelectDepartment);

	public int doAddNewDepartment(DepartmentsVO department);

	public int doDeleteDepartment(String departmentId);

}

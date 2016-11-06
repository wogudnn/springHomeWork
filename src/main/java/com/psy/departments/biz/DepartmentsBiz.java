package com.psy.departments.biz;

import java.util.List;
import java.util.Map;

import com.psy.departments.vo.DepartmentsVO;

public interface DepartmentsBiz {

	public List<DepartmentsVO> viewAllDepartments();

	public boolean doSelectDepartment(Map<String, String> forSelectDepartment);

	public boolean doAddNewDepartment(DepartmentsVO department);

	public boolean doDeleteDepartment(String departmentId);

}

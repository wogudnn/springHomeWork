package com.psy.departments.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.psy.departments.dao.DepartmentsDao;
import com.psy.departments.vo.DepartmentsVO;

public class DepartmentsDaoImpl extends SqlSessionDaoSupport implements DepartmentsDao {

	@Override
	public List<DepartmentsVO> viewAllDepartments() {
		return getSqlSession().selectList("departmentsDao.viewAllDepartments");
	}
	
	@Override
	public int doSelectDepartment(Map<String, String> forSelectDepartment) {
		return getSqlSession().update("departmentsDao.doSelectDepartment", forSelectDepartment);
	}
	
	@Override
	public int doAddNewDepartment(DepartmentsVO department) {
		return getSqlSession().insert("departmentsDao.doAddNewDepartment", department);
	}
	@Override
	public int doDeleteDepartment(String departmentId) {
		return getSqlSession().delete("departmentsDao.doDeleteDepartment",departmentId);
	}
}

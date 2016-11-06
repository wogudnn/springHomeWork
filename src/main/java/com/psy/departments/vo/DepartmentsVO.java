package com.psy.departments.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class DepartmentsVO {

	private String departmentId;
	
	@NotNull(message="부서명이비었습니다.")
	@NotEmpty(message="부서명이비었습니다.")
	private String departmentName;
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}

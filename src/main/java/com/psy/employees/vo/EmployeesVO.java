package com.psy.employees.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.psy.position.vo.PositionVO;

public class EmployeesVO {

	private String employeeId;
	private String positionId;

	@NotEmpty(message = "이름이 비었습니다.(공백)")
	@NotNull(message = "이름이 비었습니다.")
	private String lastName;

	@NotEmpty(message = "직무가 비었습니다.(공백)")
	@NotNull(message = "직무가 비었습니다.")
	private String jobId;

	@Min(value = 0, message = "연봉이 비었습니다.")
	@Range(min = 0, max = Integer.MAX_VALUE, message = "연봉이 비었습니다.!")
	private int salary;

	private String departmentName;
	private PositionVO positionVO;
	
	public EmployeesVO() {
		positionVO = new PositionVO();
	}
	
	public PositionVO getPositionVO() {
		return positionVO;
	}

	public void setPositionVO(PositionVO positionVO) {
		this.positionVO = positionVO;
	}



	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*public void setSalary(String salary) {
		try {
			this.salary = Integer.parseInt(salary);
		} catch (NumberFormatException e) {
			this.salary = 0;
		}
	}
*/
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}

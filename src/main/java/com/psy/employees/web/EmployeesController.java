package com.psy.employees.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.psy.employees.service.EmployeesService;
import com.psy.employees.vo.EmployeesVO;

@Controller
public class EmployeesController {

	private EmployeesService employeesService;

	public void setEmployeesService(EmployeesService employeesService) {
		this.employeesService = employeesService;
	}
	
	@RequestMapping("/hr/employees")
	public ModelAndView viewAllEmployees(){
		
		List<EmployeesVO> employees = employeesService.viewAllEmployees();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/employees");
		view.addObject("employees", employees);
		return view;
	}
	
	@RequestMapping("/hr/addNewEmployee")
	public String viewAddNewEmployeePage(){
		return "hr/addNewEmployee";
	}
	
	@RequestMapping("/hr/doAddNewEmployee")
	public ModelAndView doAddNewEmployee(@Valid EmployeesVO employee, Errors errors){
		ModelAndView view = new ModelAndView();
		
		if(errors.hasErrors()){
			view.setViewName("hr/addNewEmployee");
		}
		else{
			boolean isSuccess = employeesService.doAddNewEmployee(employee);
			view.setViewName("redirect:/hr/employees");
		}
		
		return view;
	}
	
	@RequestMapping("/hr/employees/{employeeId}")
	public ModelAndView viewEmployeePage(@PathVariable String employeeId){
		
		EmployeesVO employee = employeesService.getEmployeeById(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/employees");
		view.addObject("employee", employee);
		return view;
	}
	
	@RequestMapping("/hr/employees/doDeleteEmployee/{employeeId}")
	public ModelAndView doDeleteEmployee(@PathVariable String employeeId){
		
		boolean isSuccess = employeesService.doDeleteEmployee(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/hr/employees");
		return view;
	}
	@RequestMapping("/hr/employees/doLevelUpEmployeePosition/{employeeId}")
	public ModelAndView doLevelUpEmployeePosition(@PathVariable String employeeId){
		
		boolean isSuccess = employeesService.doLevelUpEmployeePosition(employeeId);
		
		ModelAndView view = new ModelAndView();
		return view;
	}
	
}

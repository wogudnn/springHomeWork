package com.psy.departments.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.psy.departments.service.DepartmentsService;
import com.psy.departments.vo.DepartmentsVO;

@Controller
public class DepartmentsController {

	private DepartmentsService departmentsService;

	public void setDepartmentsService(DepartmentsService departmentsService) {
		this.departmentsService = departmentsService;
	}
	
	@RequestMapping("/hr/departments/doSelectDepartment")
	public ModelAndView doSelectDepartment(@RequestParam String departmentId, String employeeId) {
		
		Map<String, String> forSelectDepartment = new HashMap<String, String>();
		
		forSelectDepartment.put("employeeId", employeeId);
		forSelectDepartment.put("departmentId", departmentId);
		
		boolean isSuccess = departmentsService.doSelectDepartment(forSelectDepartment);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/hr/employees");
		return view;
	}
	
	@RequestMapping("/hr/addNewDepartment")
	public String addNewDepartment(){
		
		return	"hr/addNewDepartment";
	}
	
	@RequestMapping("/hr/doAddNewDepartment")
	public ModelAndView doAddNewDepartment(@Valid DepartmentsVO department, Errors errors){
		ModelAndView view = new ModelAndView();
		
		if(errors.hasErrors()){
			view.setViewName("/hr/addNewDepartment");
		}
		else{
			boolean isSuccess = departmentsService.doAddNewDepartment(department);
			view.setViewName("redirect:/hr/departments");
		}
		return view;
	}
	@RequestMapping("/hr/departments")
	public ModelAndView viewDeparmentsList(){
		
		List<DepartmentsVO> departments = departmentsService.viewAllDepartments();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/departments");
		view.addObject("departments", departments);
		return view;
	}
	@RequestMapping("/hr/departments/delete/{departmentId}")
	public ModelAndView doDeleteDepartment(@PathVariable String departmentId){
		
		boolean isSuccess = departmentsService.doDeleteDepartment(departmentId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/hr/departments");
		return view;
	}
}

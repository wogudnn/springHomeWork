package com.psy.position.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.psy.position.service.PositionService;

@Controller
public class PositionController {

	private PositionService positionService;
	
	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
	}

	@RequestMapping("/hr/position/doLevelUpEmployeePosition/{employeeId}")
	public ModelAndView doLevelUpEmployeePosition(@PathVariable String employeeId){
		
		boolean isSuccess = positionService.doLevelUpEmployeePosition(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/hr/employees");
		return view;
	}
}

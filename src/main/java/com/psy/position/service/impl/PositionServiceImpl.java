package com.psy.position.service.impl;

import com.psy.position.biz.PositionBiz;
import com.psy.position.service.PositionService;

public class PositionServiceImpl implements PositionService {

	private PositionBiz positionBiz;

	public void setPositionBiz(PositionBiz positionBiz) {
		this.positionBiz = positionBiz;
	}
	
	@Override
	public boolean doLevelUpEmployeePosition(String employeeId) {
		return positionBiz.doLevelUpEmployeePosition(employeeId);
	}
}

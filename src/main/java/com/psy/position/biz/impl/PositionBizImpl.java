package com.psy.position.biz.impl;

import com.psy.position.biz.PositionBiz;
import com.psy.position.dao.PositionDao;

public class PositionBizImpl implements PositionBiz {

	private PositionDao positionDao;

	public void setPositionDao(PositionDao positionDao) {
		this.positionDao = positionDao;
	}
	
	@Override
	public boolean doLevelUpEmployeePosition(String employeeId) {
		return positionDao.doLevelUpEmployeePosition(employeeId)>0;
	}
	
}

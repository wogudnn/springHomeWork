package com.psy.position.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.psy.position.dao.PositionDao;

public class PositionDaoImpl extends SqlSessionDaoSupport implements PositionDao {

	
	@Override
	public int doLevelUpEmployeePosition(String employeeId) {
		return getSqlSession().update("positionDao.doLevelUpEmployeePosition",employeeId);
	}
	
}

package com.czbank.stscreditcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.ApplyUserAdminDao;
import com.czbank.stscreditcard.po.ViewApplyUserAdmin;
import com.czbank.stscreditcard.service.ApplyUserAdminService;
@Service
public class ApplyUserAdminServiceImpl implements ApplyUserAdminService{
	@Autowired
	private ApplyUserAdminDao applyseradminDao;
	@Override
	public List<ViewApplyUserAdmin> applyuseradminSelectAll() {
		// TODO Auto-generated method stub
		return applyseradminDao.applyuseradminSelectAll();
	}
	@Override
	public int applyuseradminDelete(int id) {
		// TODO Auto-generated method stub
		return applyseradminDao.applyuseradminDelete(id);
	}
	@Override
	public List<ViewApplyUserAdmin> applyuseradminSelectUnchecked() {
		// TODO Auto-generated method stub
		return applyseradminDao.applyuseradminSelectUnchecked();
	}
	@Override
	public List<ViewApplyUserAdmin> userApplyStatus(int userId) {
		// TODO Auto-generated method stub
		return applyseradminDao.userApplyStatus(userId);
	}
	
}

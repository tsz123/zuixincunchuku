package com.czbank.stscreditcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.AdminDao;
import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao;
	@Override
	public List<TblAdmin> adminSelectAll(){
		return adminDao.adminSelectAll();
	}
	
	
	@Override
	public int adminSelectId(String adminName) {
		// TODO Auto-generated method stub
		return adminDao.adminSelectId(adminName);
	}


	@Override
	public TblAdmin adminSelectOne(String adminName) {
		// TODO Auto-generated method stub
		return adminDao.adminSelectOne(adminName);
	}

	

	
}

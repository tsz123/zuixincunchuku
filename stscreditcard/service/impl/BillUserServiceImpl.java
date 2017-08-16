package com.czbank.stscreditcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.BillUserDao;
import com.czbank.stscreditcard.po.ViewBillUser;
import com.czbank.stscreditcard.service.BillUserService;

@Service
public class BillUserServiceImpl implements BillUserService{
	@Autowired
	private BillUserDao billUserDao;

	@Override
	public List<ViewBillUser> billUserSelectAll(int userId) {
		// TODO Auto-generated method stub
		return billUserDao.billUserSelectAll(userId);
	}
	
}

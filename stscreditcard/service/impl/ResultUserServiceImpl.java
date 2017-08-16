package com.czbank.stscreditcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.ResultUserDao;
import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.po.ViewResultUser;
import com.czbank.stscreditcard.service.ResultUserService;

@Service
public class ResultUserServiceImpl implements ResultUserService{
	
	@Autowired
	private ResultUserDao resultUserDao;
	@Override
	public List<ViewResultUser> resultUserSelectAll(){
		return resultUserDao.resultUserSelectAll();
	}
	/*@Override
	public int resultUserUpdate(ViewResultUser viewResultUser) {
		// TODO Auto-generated method stub
		return resultUserDao.resultUserUpdate(viewResultUser);
	}
	*/
	

}

package com.czbank.stscreditcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.UserDao;

import com.czbank.stscreditcard.po.TblUser;
import com.czbank.stscreditcard.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public List<TblUser> userSelectAll(){
		return userDao.userSelectAll();
	}
	@Override
	public int userUpdate(TblUser tbluser) {
		// TODO Auto-generated method stub
		return userDao.userUpdate(tbluser);
	}
	@Override
	public int userApplyInsert(TblUser tbluser){
		// TODO Auto-generated method stub
		return userDao.userApplyInsert(tbluser);
	}
}

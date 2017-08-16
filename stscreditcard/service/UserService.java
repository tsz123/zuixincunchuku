package com.czbank.stscreditcard.service;

import java.util.List;

import com.czbank.stscreditcard.po.TblUser;

public interface UserService {
	public List<TblUser> userSelectAll();
	
	public int userUpdate(TblUser tbluser);
	public int userApplyInsert(TblUser tbluser);

}

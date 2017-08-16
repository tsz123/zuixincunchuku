package com.czbank.stscreditcard.dao;

import java.util.List;

import com.czbank.stscreditcard.po.ViewBillUser;

public interface BillUserDao {

	//获取用户账单
	public List<ViewBillUser> billUserSelectAll(int userId);
}

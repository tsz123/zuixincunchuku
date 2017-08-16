package com.czbank.stscreditcard.service;

import java.util.List;

import com.czbank.stscreditcard.po.ViewBillUser;

public interface BillUserService {

	//获取用户账单
		public List<ViewBillUser> billUserSelectAll(int userId);
}

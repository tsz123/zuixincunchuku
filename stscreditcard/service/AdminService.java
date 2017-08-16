package com.czbank.stscreditcard.service;

import java.util.List;

import com.czbank.stscreditcard.po.TblAdmin;

public interface AdminService {

	//selectall
		public List<TblAdmin> adminSelectAll();
	    //selectone
		public TblAdmin adminSelectOne(String adminName);
		public int adminSelectId(String adminName);
}

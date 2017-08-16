package com.czbank.stscreditcard.dao;

import java.util.List;

import com.czbank.stscreditcard.po.TblAdmin;



public interface AdminDao {
	//selectall
	public List<TblAdmin> adminSelectAll();
    //selectaadminone
	public TblAdmin adminSelectOne(String adminName);
	public int adminSelectId(String adminName);
}

package com.czbank.stscreditcard.service;

import java.util.List;

import com.czbank.stscreditcard.po.ViewApplyUserAdmin;


public interface ApplyUserAdminService {
	public List<ViewApplyUserAdmin> applyuseradminSelectAll();

	public  int applyuseradminDelete(int id);
	
	  public List<ViewApplyUserAdmin> applyuseradminSelectUnchecked();
	  public List<ViewApplyUserAdmin> userApplyStatus(int userId);
}

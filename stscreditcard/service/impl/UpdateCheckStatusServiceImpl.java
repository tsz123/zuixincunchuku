package com.czbank.stscreditcard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.UpdateCheckStatusDao;
import com.czbank.stscreditcard.po.TblApplyInfo;
import com.czbank.stscreditcard.service.UpdateCheckStatusService;
@Service
public class UpdateCheckStatusServiceImpl implements UpdateCheckStatusService{

	@Autowired
    private UpdateCheckStatusDao updateCheckStatusDao;
	@Override
	public int updateCheckStatus(TblApplyInfo tblApplyInfo) {
		// TODO Auto-generated method stub
		return updateCheckStatusDao.updateCheckStatus(tblApplyInfo);
	}

}

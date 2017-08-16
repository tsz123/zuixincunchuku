package com.czbank.stscreditcard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.ResultInfoDao;
import com.czbank.stscreditcard.po.TblResultInfo;
import com.czbank.stscreditcard.service.ResultInfoService;
@Service
public class ResultInfoServiceImpl implements ResultInfoService{
	@Autowired
	ResultInfoDao resultInfoDao;
	
	@Override
	public int resultInfoInsert(TblResultInfo tblResultInfo) {
		return resultInfoDao.resultInfoInsert(tblResultInfo);
	}

}

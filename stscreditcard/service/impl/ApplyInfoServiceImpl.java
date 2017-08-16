package com.czbank.stscreditcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czbank.stscreditcard.dao.AdminDao;
import com.czbank.stscreditcard.dao.ApplyInfoDao;
import com.czbank.stscreditcard.po.PoApplyCountByStatus;
import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.service.ApplyInfoService;

@Service
public class ApplyInfoServiceImpl implements ApplyInfoService{

	@Autowired
	private ApplyInfoDao applyinfoDao;
	@Override
	public List<PoApplyCountByStatus> applyinfoSelectStatusCount(){
		return applyinfoDao.applyinfoSelectStatusCount();
	}
}

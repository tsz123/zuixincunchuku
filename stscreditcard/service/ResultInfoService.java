package com.czbank.stscreditcard.service;

import com.czbank.stscreditcard.po.TblResultInfo;

public interface ResultInfoService {
	//审核结果插入
	public int resultInfoInsert(TblResultInfo tblResultInfo);
}

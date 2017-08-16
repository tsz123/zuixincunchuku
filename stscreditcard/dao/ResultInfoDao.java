package com.czbank.stscreditcard.dao;

import com.czbank.stscreditcard.po.TblResultInfo;

public interface ResultInfoDao {
	//审核结果插入
	public int resultInfoInsert(TblResultInfo tblResultInfo);
}

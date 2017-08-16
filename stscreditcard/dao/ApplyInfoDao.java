package com.czbank.stscreditcard.dao;

import java.util.List;

import com.czbank.stscreditcard.po.PoApplyCountByStatus;

public interface ApplyInfoDao {
	public List<PoApplyCountByStatus> applyinfoSelectStatusCount();
}

package com.czbank.stscreditcard.service;

import java.util.List;

import com.czbank.stscreditcard.po.PoApplyCountByStatus;

public interface ApplyInfoService {
	public List<PoApplyCountByStatus> applyinfoSelectStatusCount();
}

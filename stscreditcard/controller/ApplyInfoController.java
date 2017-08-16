package com.czbank.stscreditcard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.czbank.stscreditcard.po.PoApplyCountByStatus;
import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.service.AdminService;
import com.czbank.stscreditcard.service.ApplyInfoService;

@RestController
public class ApplyInfoController {
	// 0定义字段
	@Autowired
	private ApplyInfoService applyinfoService;
	
	@RequestMapping("/applyinfoSelectStatusCount")
	public String applyinfoSelectStatusCount() {
		List<PoApplyCountByStatus> a=applyinfoService.applyinfoSelectStatusCount();
		System.out.println(JSON.toJSONString(a));
		System.out.println(a.size());
		return JSON.toJSONString(a);


		}
}

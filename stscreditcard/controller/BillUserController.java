package com.czbank.stscreditcard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.czbank.stscreditcard.po.ViewBillUser;
import com.czbank.stscreditcard.service.BillUserService;

@RestController
public class BillUserController {
	@Autowired
	private BillUserService billUserService;
	@RequestMapping("/billUserSelectAll")
	public String billUserSelectAll(HttpServletRequest req){
		String userId=req.getParameter("userId");
		List<ViewBillUser> billUserList= billUserService.billUserSelectAll(Integer.valueOf(userId));
		System.out.println(JSON.toJSONString(billUserList));
		return JSON.toJSONString(billUserList);
		
	}
}

package com.czbank.stscreditcard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import com.czbank.stscreditcard.po.ViewResultUser;
import com.czbank.stscreditcard.service.ResultUserService;

@RestController
public class ResultUserController {
	@Autowired
	private ResultUserService resultUserService;
	@RequestMapping("/resultUserSelectAll")
	public String resultUserSelectAll(){
		List<ViewResultUser> resultuserList= resultUserService.resultUserSelectAll();
		System.out.println(JSON.toJSONString(resultuserList));
		return JSON.toJSONString(resultuserList);
	}
	
	/*@RequestMapping("/resultUserUpdate")
	public String resultUserUpdate(HttpServletRequest req){
		String resultId=req.getParameter("resultId");
		String userName=req.getParameter("userName");
		String creditCardNumber=req.getParameter("creditCardNumber");
		String amount=req.getParameter("amount");
		String creditCardLevel=req.getParameter("creditCardLevel");
		String applyId=req.getParameter("applyId");
		String IdNumber=req.getParameter("IdNumber");
		ViewResultUser viewResultUser=new ViewResultUser();
		viewResultUser.setResultId(Integer.valueOf(resultId));
		viewResultUser.setUserName(userName);
		viewResultUser.setCreditCardNumber(creditCardNumber);
		viewResultUser.setIdNumber(IdNumber);
		viewResultUser.setAmount(Integer.valueOf(amount));
		viewResultUser.setCreditCardLevel(creditCardLevel);
		viewResultUser.setApplyId(Integer.valueOf(applyId));
		
		System.out.println(viewResultUser);
		
		return String.valueOf(resultUserService.resultUserUpdate(viewResultUser));
		
		
	}*/

}

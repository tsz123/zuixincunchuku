package com.czbank.stscreditcard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.po.TblUser;
import com.czbank.stscreditcard.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService; 
	@RequestMapping("/userSelectAll")
	public String userSelectAll(){
		List<TblUser> userList= userService.userSelectAll();
		System.out.println(JSON.toJSONString(userList));
		System.out.println(userList.size());
		return JSON.toJSONString(userList);
	}

	@RequestMapping("/userApplyInsert")
	public String userApplyInsert(TblUser tbluser){
		return String.valueOf(userService.userApplyInsert(tbluser));
	}
	
	@RequestMapping("/userUpdate")
	public String userUpdate(HttpServletRequest req) {
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String age = req.getParameter("age");
		String sex = req.getParameter("sex");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String IdNumber = req.getParameter("IdNumber");
		String url1 = req.getParameter("url1");
		String url2 = req.getParameter("url2");
		String debt = req.getParameter("debt");
		String income = req.getParameter("income");
		String guaranteer = req.getParameter("guaranteer");
		String guaranteerPhone = req.getParameter("guaranteerPhone");
		String email = req.getParameter("email");
		String creditCardId = req.getParameter("creditCardId");
		TblUser tbleuser = new TblUser();
		tbleuser.setUserId(Integer.valueOf(userId));
		tbleuser.setUserName(userName);
		tbleuser.setAge(Integer.valueOf(age));
		tbleuser.setSex(Integer.valueOf(sex));
		tbleuser.setPhone(phone);
		tbleuser.setAddress(address);
		tbleuser.setIdNumber(IdNumber);
		tbleuser.setUrl1(url1);
		tbleuser.setUrl1(url2);
		tbleuser.setDebt(Double.valueOf(debt));
		tbleuser.setIncome(Double.valueOf(income));
		tbleuser.setGuaranteer(guaranteer);
		tbleuser.setGuaranteerPhone(guaranteerPhone);
		tbleuser.setEmail(email);
		tbleuser.setCreditCardId(Integer.valueOf(creditCardId));
		System.out.println(JSON.toJSONString(tbleuser));
		//System.out.println(userService.userUpdate(tbleuser));
		System.out.println("a");
		System.out.println(userService.userUpdate(tbleuser));
		if(userService.userUpdate(tbleuser)==1){
			System.out.println("aa");
			if(String.valueOf(userApplyInsert(tbleuser))==String.valueOf(userService.userUpdate(tbleuser)))
			{
				System.out.println("inserted");
			}
		
		}else{
			
		}
		return String.valueOf(userService.userUpdate(tbleuser));
	}

}

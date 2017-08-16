package com.czbank.stscreditcard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.service.AdminService;

@RestController
public class AdminController {

	// 0定义字段
	@Autowired
	private AdminService adminService;

	@RequestMapping("/adminSelectAll")
	public String adminSelectAll() {
		List<TblAdmin> adminList = adminService.adminSelectAll();
		System.out.println(JSON.toJSONString(adminList));
		System.out.println(adminList.size());
		return JSON.toJSONString(adminList);
	}

	@RequestMapping("/adminSelectId")
	public int adminSelectId(String adminName) {
		return adminService.adminSelectId(adminName);
	}

	@RequestMapping("/adminSelectOne")
	public int adminSelectOne(HttpServletRequest req) {
		String adminName = req.getParameter("adminName");
		String password = req.getParameter("password");
		System.out.println(adminName);
		TblAdmin adminList = adminService.adminSelectOne(adminName);
			if (adminList.getPassword().equals(password)) {
				System.out.println(adminList.getAdminId());
				return Integer.valueOf(adminList.getAdminId());
			} else {
				return -1;//0作为空数据替换用
			}

		}
	
}

package com.czbank.stscreditcard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.po.ViewApplyUserAdmin;
import com.czbank.stscreditcard.service.ApplyUserAdminService;

@RestController
public class ApplyUserAdminController {
	@Autowired
	private ApplyUserAdminService applyuseradminService;
	@RequestMapping("/applyuseradminSelectAll")
	public String applySelectAll(){
		List<ViewApplyUserAdmin> applyList= applyuseradminService.applyuseradminSelectAll();
		System.out.println(JSON.toJSONString(applyList));
		System.out.println(applyList.size());
		return JSON.toJSONString(applyList);
	}
	@RequestMapping("/applyuseradminSelectUnchecked")
	public String applyuseradminSelectUnchecked(){
		List<ViewApplyUserAdmin> applyUncheckedList= applyuseradminService.applyuseradminSelectUnchecked();
		return JSON.toJSONString(applyUncheckedList);	
	}
	@RequestMapping("/userApplyStatus")
	public String updateCheckStatus(HttpServletRequest req){
		String userId=req.getParameter("userId");
		List<ViewApplyUserAdmin> userApplyStatusList = applyuseradminService.userApplyStatus(Integer.valueOf(userId));
		System.out.println(JSON.toJSONString(userApplyStatusList));
		return JSON.toJSONString(userApplyStatusList);
		
	}
	
/*	@Autowired
	private ApplyInfoService applyinfoService;
	
	@RequestMapping("/applyinfoDelete")
	public String applyDelete(HttpServletRequest req) {
		String id=req.getParameter("apply_id");
		return String.valueOf(applyinfoService.applyinfoDelete(Integer.valueOf(id)));

	}*/
}

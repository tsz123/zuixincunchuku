package com.czbank.stscreditcard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czbank.stscreditcard.po.TblApplyInfo;
import com.czbank.stscreditcard.service.UpdateCheckStatusService;

@RestController
public class UpdateCheckStatusController {
	@Autowired
	private UpdateCheckStatusService updateCheckStatusService;
	
	@RequestMapping("/updateCheckStatus")
	public String updateCheckStatus(HttpServletRequest req) {
		String applyId=req.getParameter("applyId");
		String checkStatus=req.getParameter("checkStatus");
		TblApplyInfo tblApplyInfo=new TblApplyInfo();
		tblApplyInfo.setApplyId(Integer.valueOf(applyId));
		tblApplyInfo.setCheckStatus(Integer.valueOf(checkStatus));
		System.out.println(applyId);
        System.out.println(checkStatus);
		return String.valueOf(updateCheckStatusService.updateCheckStatus(tblApplyInfo));

		
	}
}

package com.czbank.stscreditcard.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czbank.stscreditcard.po.TblResultInfo;
import com.czbank.stscreditcard.service.ResultInfoService;

@RestController
public class ResultInfoController {
	@Autowired
	ResultInfoService infoService;

	@RequestMapping("/resultInfoInsert")
	public String resultInfoInsert(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String creditCardNumber = request.getParameter("creditCardNumber");
		String creditCardId = request.getParameter("creditCardId");
		String amount = request.getParameter("amount");
		TblResultInfo info = new TblResultInfo();
		info.setUserId(Integer.valueOf(userId));
		info.setCreditCardNumber(creditCardNumber);
		info.setCreditCardId(Integer.valueOf(creditCardId));
		info.setAmount(Double.valueOf(amount));
		return String.valueOf(infoService.resultInfoInsert(info));
	}
}

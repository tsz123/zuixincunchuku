package com.czbank.stscreditcard.po;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ViewBillUser {

	private int userId;
	private String userName;
	private String creditCardNumber;
	private double consumptionCount;
	private String consumptionPlace;
	@JSONField(format="yyyy-MM-dd hh:mm:ss")
	private Date consumptionTime;
	private String consumptionType;
	private String repayNumber;
	private double repayAmount;
	@JSONField(format="yyyy-MM-dd hh:mm:ss")
	private Date repayDate;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public double getConsumptionCount() {
		return consumptionCount;
	}
	public void setConsumptionCount(double consumptionCount) {
		this.consumptionCount = consumptionCount;
	}
	public String getConsumptionPlace() {
		return consumptionPlace;
	}
	public void setConsumptionPlace(String consumptionPlace) {
		this.consumptionPlace = consumptionPlace;
	}
	public Date getConsumptionTime() {
		return consumptionTime;
	}
	public void setConsumptionTime(Date consumptionTime) {
		this.consumptionTime = consumptionTime;
	}
	public String getConsumptionType() {
		return consumptionType;
	}
	public void setConsumptionType(String consumptionType) {
		this.consumptionType = consumptionType;
	}
	public String getRepayNumber() {
		return repayNumber;
	}
	public void setRepayNumber(String repayNumber) {
		this.repayNumber = repayNumber;
	}
	public double getRepayAmount() {
		return repayAmount;
	}
	public void setRepayAmount(double repayAmount) {
		this.repayAmount = repayAmount;
	}
	public Date getRepayDate() {
		return repayDate;
	}
	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}
	public ViewBillUser() {
		super();
	}
	public ViewBillUser(int userId, String userName, String creditCardNumber, double consumptionCount,
			String consumptionPlace, Date consumptionTime, String consumptionType, String repayNumber,
			double repayAmount, Date repayDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.creditCardNumber = creditCardNumber;
		this.consumptionCount = consumptionCount;
		this.consumptionPlace = consumptionPlace;
		this.consumptionTime = consumptionTime;
		this.consumptionType = consumptionType;
		this.repayNumber = repayNumber;
		this.repayAmount = repayAmount;
		this.repayDate = repayDate;
	}
	@Override
	public String toString() {
		return "ViewBillUser [userId=" + userId + ", userName=" + userName + ", creditCardNumber=" + creditCardNumber
				+ ", consumptionCount=" + consumptionCount + ", consumptionPlace=" + consumptionPlace
				+ ", consumptionTime=" + consumptionTime + ", consumptionType=" + consumptionType + ", repayNumber="
				+ repayNumber + ", repayAmount=" + repayAmount + ", repayDate=" + repayDate + "]";
	}
	
	
	
}

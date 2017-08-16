package com.czbank.stscreditcard.po;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ViewApplyUserAdmin {
	private int userId;
	private int applyId;
	private int creditCardId;
	private int checkStatus;
	@JSONField(format="yyyy-MM-dd hh:mm:ss")
	private Date checkTime;
	private int adminId;
	private String adminName;
	 private String loginName;
	  private String userName;
	  private int age;
	  private int sex;
	  private String phone;
	  private String address;
	  private String IdNumber;
	  private String url1;
	  private String url2;
	  private double debt;
	  private double income;
	  private  String guaranteer;
	  private String guaranteerPhone;
	  private String email;
	  private String creditCardLevel;
	  
	  
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getApplyId() {
		return applyId;
	}
	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}
	public int getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}
	public int getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}
	public String getUrl1() {
		return url1;
	}
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
	public String getUrl2() {
		return url2;
	}
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	public double getDebt() {
		return debt;
	}
	public void setDebt(double debt) {
		this.debt = debt;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getGuaranteer() {
		return guaranteer;
	}
	public void setGuaranteer(String guaranteer) {
		this.guaranteer = guaranteer;
	}
	public String getGuaranteerPhone() {
		return guaranteerPhone;
	}
	public void setGuaranteerPhone(String guaranteerPhone) {
		this.guaranteerPhone = guaranteerPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreditCardLevel() {
		return creditCardLevel;
	}
	public void setCreditCardLevel(String creditCardLevel) {
		this.creditCardLevel = creditCardLevel;
	}
	
	
	public ViewApplyUserAdmin() {
		super();
	}
	public ViewApplyUserAdmin(int userId, int applyId, int creditCardId, int checkStatus, Date checkTime, int adminId,
			String adminName, String loginName, String userName, int age, int sex, String phone, String address,
			String idNumber, String url1, String url2, double debt, double income, String guaranteer,
			String guaranteerPhone, String email, String creditCardLevel) {
		super();
		this.userId = userId;
		this.applyId = applyId;
		this.creditCardId = creditCardId;
		this.checkStatus = checkStatus;
		this.checkTime = checkTime;
		this.adminId = adminId;
		this.adminName = adminName;
		this.loginName = loginName;
		this.userName = userName;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		IdNumber = idNumber;
		this.url1 = url1;
		this.url2 = url2;
		this.debt = debt;
		this.income = income;
		this.guaranteer = guaranteer;
		this.guaranteerPhone = guaranteerPhone;
		this.email = email;
		this.creditCardLevel = creditCardLevel;
	}
	@Override
	public String toString() {
		return "ViewApplyUserAdmin [userId=" + userId + ", applyId=" + applyId + ", creditCardId=" + creditCardId
				+ ", checkStatus=" + checkStatus + ", checkTime=" + checkTime + ", adminId=" + adminId + ", adminName="
				+ adminName + ", loginName=" + loginName + ", userName=" + userName + ", age=" + age + ", sex=" + sex
				+ ", phone=" + phone + ", address=" + address + ", IdNumber=" + IdNumber + ", url1=" + url1 + ", url2="
				+ url2 + ", debt=" + debt + ", income=" + income + ", guaranteer=" + guaranteer + ", guaranteerPhone="
				+ guaranteerPhone + ", email=" + email + ", creditCardLevel=" + creditCardLevel + "]";
	}
	  
	  
	  
	

	
}

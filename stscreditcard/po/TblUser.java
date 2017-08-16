package com.czbank.stscreditcard.po;

import java.util.Date;

public class TblUser {
	private int userId;
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
	private String guaranteer;
	private String guaranteerPhone;
	private String email;
	private int creditCardId;



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

	



	public int getCreditCardId() {
		return creditCardId;
	}

	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}

	public TblUser() {
		super();
	}

	public TblUser(int userId, String userName, int age, int sex, String phone, String address, String idNumber,
			String url1, String url2, double debt, double income, String guaranteer, String guaranteerPhone,
			String email) {
		super();
		this.userId = userId;
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
	}

	
	public TblUser(int userId, String userName, int age, int sex, String phone, String address, String idNumber,
			String url1, String url2, double debt, double income, String guaranteer, String guaranteerPhone,
			String email, int creditCardId) {
		super();
		this.userId = userId;
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
		this.creditCardId = creditCardId;
	}

	@Override
	public String toString() {
		return "TblUser [userId=" + userId + ", userName=" + userName + ", age=" + age + ", sex=" + sex + ", phone="
				+ phone + ", address=" + address + ", IdNumber=" + IdNumber + ", url1=" + url1 + ", url2=" + url2
				+ ", debt=" + debt + ", income=" + income + ", guaranteer=" + guaranteer + ", guaranteerPhone="
				+ guaranteerPhone + ", email=" + email + "]";
	}

	
	

	
}
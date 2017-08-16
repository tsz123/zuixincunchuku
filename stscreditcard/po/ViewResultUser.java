package com.czbank.stscreditcard.po;

public class ViewResultUser {
	
	private int resultId;
	private String userName;
	private String creditCardNumber;
	private int amount;
	private String creditCardLevel;
	private int applyId;
	private String IdNumber;
	
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCreditCardLevel() {
		return creditCardLevel;
	}
	public void setCreditCardLevel(String creditCardLevel) {
		this.creditCardLevel = creditCardLevel;
	}
	public int getApplyId() {
		return applyId;
	}
	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}
	public String getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}
	public ViewResultUser() {
		super();
	}
	public ViewResultUser(int resultId, String userName, String creditCardNumber, int amount, String creditCardLevel,
			int applyId, String idNumber) {
		super();
		this.resultId = resultId;
		this.userName = userName;
		this.creditCardNumber = creditCardNumber;
		this.amount = amount;
		this.creditCardLevel = creditCardLevel;
		this.applyId = applyId;
		IdNumber = idNumber;
	}
	@Override
	public String toString() {
		return "ViewResultUser [resultId=" + resultId + ", userName=" + userName + ", creditCardNumber="
				+ creditCardNumber + ", amount=" + amount + ", creditCardLevel=" + creditCardLevel + ", applyId="
				+ applyId + ", IdNumber=" + IdNumber + "]";
	}
	
	
	
	
	
	
	
	
	
	

}

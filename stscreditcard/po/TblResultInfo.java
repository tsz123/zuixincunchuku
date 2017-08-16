package com.czbank.stscreditcard.po;

public class TblResultInfo {
	private int resultId;
	private int userId;
	private String creditCardNumber;
	private int creditCardId;
	private double amount;
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public int getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TblResultInfo() {
		super();
	}
	public TblResultInfo(int resultId, int userId, String creditCardNumber, int creditCardId, double amount) {
		super();
		this.resultId = resultId;
		this.userId = userId;
		this.creditCardNumber = creditCardNumber;
		this.creditCardId = creditCardId;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TblResultInfo [resultId=" + resultId + ", userId=" + userId + ", creditCardNumber=" + creditCardNumber
				+ ", creditCardId=" + creditCardId + ", amount=" + amount + "]";
	}
	
	
}

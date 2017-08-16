package com.czbank.stscreditcard.po;

public class PoApplyCountByStatus {

	private  int count;
	private int checkStatus;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}
	public PoApplyCountByStatus(int count, int checkStatus) {
		super();
		this.count = count;
		this.checkStatus = checkStatus;
	}
	public PoApplyCountByStatus() {
		super();
	}
	@Override
	public String toString() {
		return "PoApplyCountByStatus [count=" + count + ", checkStatus=" + checkStatus + "]";
	}
	
}

package com.czbank.stscreditcard.po;

import java.util.Date;

public class TblApplyInfo {
	private int applyId;
	private int creditCardId;
	private int userId;
	private int adminId;
	private int checkStatus;
	private Date checkTime;
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
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public TblApplyInfo() {
		super();
	}
	public TblApplyInfo(int creditCardId, int userId, int adminId, int checkStatus, Date checkTime) {
		super();
		this.creditCardId = creditCardId;
		this.userId = userId;
		this.adminId = adminId;
		this.checkStatus = checkStatus;
		this.checkTime = checkTime;
	}
	@Override
	public String toString() {
		return "TblApplyInfo [applyId=" + applyId + ", creditCardId=" + creditCardId + ", userId=" + userId
				+ ", adminId=" + adminId + ", checkStatus=" + checkStatus + ", checkTime=" + checkTime + "]";
	}


}

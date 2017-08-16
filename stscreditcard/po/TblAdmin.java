package com.czbank.stscreditcard.po;

public class TblAdmin {

	//字段
	private int adminId;
	private String adminName;
	private String password;
	
	//注释
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TblAdmin() {
		super();
	}
	public TblAdmin( String adminName, String password) {
		super();
		
		this.adminName = adminName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "TblAdmin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + "]";
	}
	
	
	
	
	
}

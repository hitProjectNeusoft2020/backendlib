package com.neusoft.hotel.manage.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

//管理员信息表
@Alias("Admin")
public class AdminModel implements Serializable {
	private String id = null;
	private String name = null;
	private String passwd = null;
	private String cernum = null;
	private String superPower = null;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getCernum() {
		return cernum;
	}
	public void setCernum(String cernum) {
		this.cernum = cernum;
	}
	public String getSuperPower() {
		return superPower;
	}
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	

}

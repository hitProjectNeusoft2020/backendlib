package com.neusoft.hotel.manage.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
//客户信息表
@Alias("Guest")
public class GuestModel implements Serializable {
	private String cernum = null;
	private String name = null;
	private String tel = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCernum() {
		return cernum;
	}
	public void setCernum(String cernum) {
		this.cernum = cernum;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	

}

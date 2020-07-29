package com.neusoft.hotel.manage.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
//额外消费产品种类表
@Alias("ConsumptionType")
public class ConsumptionTypeModel implements Serializable {
	private String id = null;
	private String type = null;
	private int cost = 0;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}

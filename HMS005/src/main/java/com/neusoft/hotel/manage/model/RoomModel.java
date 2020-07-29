package com.neusoft.hotel.manage.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
//房间基本表
@Alias("Room")
public class RoomModel implements Serializable {
	private String id = null;
	private String roomState = null;
	//private String roomType = null;  关联属性外键
	private String remark = null;
	
	//关联的房间类型  在controller层创建room对象时，调用set函数，初始化这个属性
	private RoomTypeModel roomTypeModel = null;
	
	
	
	public String getId() {
		return id;
	}
	public RoomTypeModel getRoomTypeModel() {
		return roomTypeModel;
	}
	public void setRoomTypeModel(RoomTypeModel roomTypeModel) {
		this.roomTypeModel = roomTypeModel;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRoomState() {
		return roomState;
	}
	public void setRoomState(String roomState) {
		this.roomState = roomState;
	}
	/*
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	*/
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}

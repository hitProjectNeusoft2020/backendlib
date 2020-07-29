package com.neusoft.hotel.manage.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;
//房屋类型表
@Alias("RoomType")
public class RoomTypeModel implements Serializable {
	private String roomType = null;
	private String size = null;
	private String level = null;
	private int price = 0;
	//关联该类型的所有房间
	List<RoomModel> rooms = null;
	
	public List<RoomModel> getRooms() {
		return rooms;
	}
	public void setRooms(List<RoomModel> rooms) {
		this.rooms = rooms;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	
	

}

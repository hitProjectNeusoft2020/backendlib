package com.neusoft.hotel.manage.service;

import java.util.List;

import com.neusoft.hotel.manage.model.RoomTypeModel;

//房间类型的业务层接口
public interface IRoomTypeService {
	
	//增加房屋类型
	public int add(RoomTypeModel rtm) throws Exception;
	//修改房屋类型
	public void modify(RoomTypeModel rtm) throws Exception;
	//删除房屋类型
	public void delete(RoomTypeModel rtm) throws Exception;
	
	//通过id获取房屋类型对象
	public RoomTypeModel getById(String id) throws Exception;
	
	//取得所有管房屋信息列表
	public List<RoomTypeModel> getListByAll() throws Exception;
	
	
	

}

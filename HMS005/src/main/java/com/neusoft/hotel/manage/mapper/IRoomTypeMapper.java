package com.neusoft.hotel.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.neusoft.hotel.manage.model.RoomTypeModel;

//房屋类型信息的Mapper接口
@Mapper
public interface IRoomTypeMapper {

	
	//增加房屋类型
	public void insert(RoomTypeModel rtm) throws Exception;
	//修改房屋类信（可用来修改房屋登记，人数，价格）
	public void update(RoomTypeModel rtm) throws Exception;
	//删除房屋类型（尽量不要用，因为需要同时删除和此类型关联的房间）
	public void delete(RoomTypeModel rtm) throws Exception;
	
	//通过id获取房屋类型对象
	public RoomTypeModel selectById(String roomType) throws Exception;
	
	//取得所有管房屋信息列表
	public List<RoomTypeModel> selectByAll() throws Exception;
	
	
}

package com.neusoft.hotel.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.manage.model.RoomModel;

//房间基本信息的Mapper接口
@Mapper
public interface IRoomMapper {

	//增加房间
	public void insert(RoomModel rm) throws Exception;
	//修改房间
	public void update(RoomModel rm) throws Exception;
	//删除房间
	public void delete(RoomModel rm) throws Exception;
	
	
	//=============等值连接查询============连接后的结果可以看到所有房间的类型信息，状态信息
	//通过id获取房间所有信息
	public RoomModel selectRoomById(String id) throws Exception;
	
	//取得所有房间信息  (此方法只适用于 查看所有房间使用状况)
	public List<RoomModel> selectAllRoom() throws Exception;
	
	//取得可用房间信息 (默认state=1)（动态sql语句====输入筛选条件）
	public List<RoomModel> selectAvailableRoom(
			@Param("size") String size, 
			@Param("level") String level 
			) throws Exception;
	
	
	
}

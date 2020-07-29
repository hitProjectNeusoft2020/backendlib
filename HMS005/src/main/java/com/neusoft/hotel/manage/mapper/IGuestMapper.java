package com.neusoft.hotel.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.manage.model.GuestModel;

//客户的Mapper接口
@Mapper
public interface IGuestMapper {

	
	//增加客户
	public void insert(GuestModel gm) throws Exception;
	//修改客户
	public void update(GuestModel gm) throws Exception;
	//删除客户
	public void delete(GuestModel gm) throws Exception;
	
	//通过身份证号获取客户对象
	public GuestModel selectByCerNum(String cernum) throws Exception;
	
	//取得所有客户信息列表  
	public List<GuestModel> selectByAll() throws Exception;
	
	
	
	
}

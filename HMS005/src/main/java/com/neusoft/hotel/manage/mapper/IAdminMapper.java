package com.neusoft.hotel.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.manage.model.AdminModel;

//管理员的Mapper接口
@Mapper
public interface IAdminMapper {

	
	//增加管理员
	public void insert(AdminModel am) throws Exception;
	//修改管理员
	public void update(AdminModel am) throws Exception;
	//删除管理员
	public void delete(AdminModel am) throws Exception;
	
	//通过id获取管理员对象（此方法只适用于于低权限管理员查看自己，这种安全性约束有待在service层实现）
	public AdminModel selectById(String id) throws Exception;
	
	//取得所有管理员信息列表  (此方法只适用于超级管理员查看所有管理员信息，这种安全性约束有待在service层实现)
	public List<AdminModel> selectByAll() throws Exception;
	
	
	
	
}

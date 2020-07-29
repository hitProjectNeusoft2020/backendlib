package com.neusoft.hotel.manage.service;

import java.util.List;

import com.neusoft.hotel.manage.model.AdminModel;

//管理员信息的业务层接口
public interface IAdminService {
	
	//增加管理员
	public int add(AdminModel am) throws Exception;
	//修改管理员
	public void modify(AdminModel am) throws Exception;
	//删除管理员
	public void delete(AdminModel am) throws Exception;
	
	//根据id获取管理员
	public AdminModel getById(String id) throws Exception;
	
	//取得所有管理员列表
	public List<AdminModel> getListByAll() throws Exception;
	
	
	

}

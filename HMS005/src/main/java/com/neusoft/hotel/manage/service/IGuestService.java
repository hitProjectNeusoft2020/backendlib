package com.neusoft.hotel.manage.service;

import java.util.List;

import com.neusoft.hotel.manage.model.GuestModel;

//客户的业务层接口
public interface IGuestService {
	
	//增加客户
	public int add(GuestModel gm) throws Exception;
	//修改客户
	public void modify(GuestModel gm) throws Exception;
	//删除客户
	public void delete(GuestModel gm) throws Exception;
	
	//通过身份证号获取客户对象
	public GuestModel getByCerNum(String cernum) throws Exception;
	
	//取得所有客户信息列表 
	public List<GuestModel> getListByAll() throws Exception;
	
	
	

}

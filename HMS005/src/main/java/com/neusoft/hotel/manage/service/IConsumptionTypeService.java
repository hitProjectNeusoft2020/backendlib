package com.neusoft.hotel.manage.service;

import java.util.List;

import com.neusoft.hotel.manage.model.ConsumptionTypeModel;

//额外消费种类的业务层接口
public interface IConsumptionTypeService {
	
	//增加额外消费物品种类
	public int add(ConsumptionTypeModel ctm) throws Exception;
	//修改额外消费物品种类
	public void modify(ConsumptionTypeModel ctm) throws Exception;
	//删除额外消费物品种类
	public void delete(ConsumptionTypeModel ctm) throws Exception;
	
	//通过id获取额外消费物品种类对象
	public ConsumptionTypeModel getById(String id) throws Exception;
	
	//取得所有额外消费物品种类列表 
	public List<ConsumptionTypeModel> getListByAll() throws Exception;
	
	
	

}

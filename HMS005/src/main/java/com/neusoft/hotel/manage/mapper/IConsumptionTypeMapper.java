package com.neusoft.hotel.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.manage.model.ConsumptionTypeModel;

//额外消费种类的Mapper接口
@Mapper
public interface IConsumptionTypeMapper {

	
	//增加额外消费物品种类
	public void insert(ConsumptionTypeModel ctm) throws Exception;
	//修改额外消费物品种类
	public void update(ConsumptionTypeModel ctm) throws Exception;
	//删除额外消费物品种类
	public void delete(ConsumptionTypeModel ctm) throws Exception;
	
	//通过id获取额外消费物品种类对象
	public ConsumptionTypeModel selectById(String id) throws Exception;
	
	//取得所有额外消费物品种类列表  
	public List<ConsumptionTypeModel> selectByAll() throws Exception;
	
	
	
	
}

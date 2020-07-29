package com.neusoft.hotel.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.manage.mapper.IConsumptionTypeMapper;
import com.neusoft.hotel.manage.model.ConsumptionTypeModel;
import com.neusoft.hotel.manage.service.IConsumptionTypeService;

@Service
@Transactional
public class ConsumptionTypeServiceImpl implements IConsumptionTypeService {

	
	@Autowired
	private IConsumptionTypeMapper consumptionTypeMapper = null;
	
	@Override
	public int add(ConsumptionTypeModel ctm) throws Exception {
		consumptionTypeMapper.insert(ctm);
		return Integer.parseInt(ctm.getId());
	}

	@Override
	public void modify(ConsumptionTypeModel ctm) throws Exception {
		consumptionTypeMapper.update(ctm);

	}

	@Override
	public void delete(ConsumptionTypeModel ctm) throws Exception {
		consumptionTypeMapper.delete(ctm);

	}

	@Override
	public ConsumptionTypeModel getById(String id) throws Exception {
		
		return consumptionTypeMapper.selectById(id);
	}

	@Override
	public List<ConsumptionTypeModel> getListByAll() throws Exception {
		
		return consumptionTypeMapper.selectByAll();
	}

}

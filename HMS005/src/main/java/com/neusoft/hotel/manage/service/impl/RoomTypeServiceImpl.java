package com.neusoft.hotel.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.manage.mapper.IRoomTypeMapper;
import com.neusoft.hotel.manage.model.RoomTypeModel;
import com.neusoft.hotel.manage.service.IRoomTypeService;

@Service
@Transactional
public class RoomTypeServiceImpl implements IRoomTypeService {

	@Autowired
	private IRoomTypeMapper roomTypeMapper = null;
	
	@Override
	public int add(RoomTypeModel rtm) throws Exception {
		roomTypeMapper.insert(rtm);
		return Integer.parseInt(rtm.getRoomType());
	}

	@Override
	public void modify(RoomTypeModel rtm) throws Exception {
		roomTypeMapper.update(rtm);

	}

	@Override
	public void delete(RoomTypeModel rtm) throws Exception {
		roomTypeMapper.delete(rtm);
	}

	@Override
	public RoomTypeModel getById(String id) throws Exception {
		
		return roomTypeMapper.selectById(id);
	}

	@Override
	public List<RoomTypeModel> getListByAll() throws Exception {
		
		return roomTypeMapper.selectByAll();
	}

}

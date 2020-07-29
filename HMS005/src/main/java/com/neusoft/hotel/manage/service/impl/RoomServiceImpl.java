package com.neusoft.hotel.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.manage.mapper.IRoomMapper;
import com.neusoft.hotel.manage.model.RoomModel;
import com.neusoft.hotel.manage.service.IRoomService;

@Service
@Transactional
public class RoomServiceImpl implements IRoomService {
	
	@Autowired
	private IRoomMapper roomMapper = null;

	@Override
	public int add(RoomModel rm) throws Exception {
		roomMapper.insert(rm);
		return Integer.parseInt(rm.getId());
	}

	@Override
	public void modify(RoomModel rm) throws Exception {
		roomMapper.update(rm);

	}

	@Override
	public void delete(RoomModel rm) throws Exception {
		roomMapper.delete(rm);

	}

	@Override
	public RoomModel getById(String id) throws Exception {
		
		return roomMapper.selectRoomById(id);
	}

	@Override
	public List<RoomModel> getListByAll() throws Exception {
		
		return roomMapper.selectAllRoom();
	}

	@Override
	public List<RoomModel> getListByAvailable(String size, String level) throws Exception {
		
		return roomMapper.selectAvailableRoom(size, level);
	}

}

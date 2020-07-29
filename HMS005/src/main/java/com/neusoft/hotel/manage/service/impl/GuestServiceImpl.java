package com.neusoft.hotel.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.manage.mapper.IGuestMapper;
import com.neusoft.hotel.manage.model.GuestModel;
import com.neusoft.hotel.manage.service.IGuestService;

@Service
@Transactional
public class GuestServiceImpl implements IGuestService {

	@Autowired
	private IGuestMapper guestMapper = null;
	
	@Override
	public int add(GuestModel gm) throws Exception {
		guestMapper.insert(gm);
		return Integer.parseInt(gm.getCernum());
	}

	@Override
	public void modify(GuestModel gm) throws Exception {
		guestMapper.update(gm);

	}

	@Override
	public void delete(GuestModel gm) throws Exception {
		guestMapper.delete(gm);

	}

	@Override
	public GuestModel getByCerNum(String cernum) throws Exception {
		
		return guestMapper.selectByCerNum(cernum);
	}

	@Override
	public List<GuestModel> getListByAll() throws Exception {
		
		return guestMapper.selectByAll();
	}

}

package com.neusoft.hotel.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.manage.mapper.IAdminMapper;
import com.neusoft.hotel.manage.model.AdminModel;
import com.neusoft.hotel.manage.service.IAdminService;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private IAdminMapper adminMapper = null;
	
	@Override
	public int add(AdminModel am) throws Exception {
		adminMapper.insert(am);
		return Integer.parseInt(am.getId());
	}
	@Override
	public void modify(AdminModel am) throws Exception {
		adminMapper.update(am);
		
	}
	@Override
	public void delete(AdminModel am) throws Exception {
		adminMapper.delete(am);
		
	}
	@Override
	public AdminModel getById(String id) throws Exception {
		
		return adminMapper.selectById(id);
	}
	@Override
	public List<AdminModel> getListByAll() throws Exception {
	
		return adminMapper.selectByAll();
	}
}

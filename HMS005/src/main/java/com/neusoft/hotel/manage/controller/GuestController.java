package com.neusoft.hotel.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.manage.model.AdminModel;
import com.neusoft.hotel.manage.model.GuestModel;
import com.neusoft.hotel.manage.service.IAdminService;
import com.neusoft.hotel.manage.service.IGuestService;
import com.neusoft.hotel.restresult.Result;

@RestController
@RequestMapping(value="/guest")
public class GuestController {
	
	@Autowired
	private IGuestService gs = null;
	
	//增加客户信息
	@PostMapping(value="/add")
	public Result<String> add(GuestModel gm) throws Exception{
		gs.add(gm);
		//System.out.println(am.getSuperPower());
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加客户信息成功!");
		return result;
	}
	//修改客户信息
	@PostMapping(value="/modify")
	public Result<String> modify(GuestModel gm) throws Exception{
		gs.modify(gm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改客户信息成功!");
		return result;
	}
	//删除客户信息
	@PostMapping(value="/delete")
	public Result<String> delete(GuestModel gm) throws Exception{
		gs.delete(gm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除客户信息成功!");
		return result;
	}
	//通过身份证号获取客户信息（隐藏密码）
	@GetMapping(value="/getbyid")
	public Result<GuestModel> getById(@RequestParam(required=true) String id) throws Exception{
		Result<GuestModel> result=new Result<GuestModel>();
		result.setResult(gs.getByCerNum(id));
		result.setStatus("OK");
		result.setMessage("取得指定客户信息对象成功!");
		return result;
	}
	//获取所有客户信息（隐藏密码）
	@GetMapping(value="/getlistbyall")
	public Result<GuestModel> getListByAll() throws Exception{
		Result<GuestModel> result=new Result<GuestModel>();
		result.setList(gs.getListByAll());
		result.setStatus("OK");
		result.setMessage("取得所有客户信息对象成功!");
		return result;
	}
	
	

}

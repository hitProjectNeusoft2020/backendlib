package com.neusoft.hotel.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.manage.model.AdminModel;
import com.neusoft.hotel.manage.service.IAdminService;
import com.neusoft.hotel.restresult.Result;

@RestController
@RequestMapping(value="/admin")
public class AdminController {
	
	@Autowired
	private IAdminService as = null;
	
	//增加管理员信息
	@PostMapping(value="/add")
	public Result<String> add(AdminModel am) throws Exception{
		as.add(am);
		System.out.println(am.getSuperPower());
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加管理员成功!");
		return result;
	}
	//修改管理员信息
	@PostMapping(value="/modify")
	public Result<String> modify(AdminModel am) throws Exception{
		as.modify(am);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改管理员成功!");
		return result;
	}
	//删除管理员信息
	@PostMapping(value="/delete")
	public Result<String> delete(AdminModel am) throws Exception{
		as.delete(am);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除管理员成功!");
		return result;
	}
	//通过id获取管理员信息（隐藏密码）
	@GetMapping(value="/getbyid")
	public Result<AdminModel> getById(@RequestParam(required=true) String id) throws Exception{
		Result<AdminModel> result=new Result<AdminModel>();
		result.setResult(as.getById(id));
		result.setStatus("OK");
		result.setMessage("取得指定管理员对象成功!");
		return result;
	}
	//获取所有管理员信息（隐藏密码）
	@GetMapping(value="/getlistbyall")
	public Result<AdminModel> getListByAll() throws Exception{
		Result<AdminModel> result=new Result<AdminModel>();
		result.setList(as.getListByAll());
		result.setStatus("OK");
		result.setMessage("取得所有管理员对象成功!");
		return result;
	}
	
	

}

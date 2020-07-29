package com.neusoft.hotel.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.manage.model.RoomTypeModel;
import com.neusoft.hotel.manage.service.IRoomTypeService;
import com.neusoft.hotel.restresult.Result;

@RestController
@RequestMapping(value="/roomtype")
public class RoomTypeController {
	
	@Autowired
	private IRoomTypeService rts = null;
	
	//增加房间类型信息
	@PostMapping(value="/add")
	public Result<String> add(RoomTypeModel rtm) throws Exception{
		rts.add(rtm);
		//System.out.println(am.getSuperPower());
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加房间类型成功!");
		return result;
	}
	//修改房间类型信息
	@PostMapping(value="/modify")
	public Result<String> modify(RoomTypeModel rtm) throws Exception{
		rts.modify(rtm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改房间类型成功!");
		return result;
	}
	//删除房间类型信息
	@PostMapping(value="/delete")
	public Result<String> delete(RoomTypeModel rtm) throws Exception{
		rts.delete(rtm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除房间类型成功!");
		return result;
	}
	//通过id获取房间类型信息
	@GetMapping(value="/getbyid")
	public Result<RoomTypeModel> getById(@RequestParam(required=true) String id) throws Exception{
		Result<RoomTypeModel> result=new Result<RoomTypeModel>();
		result.setResult(rts.getById(id));
		result.setStatus("OK");
		result.setMessage("取得指定房间类型对象成功!");
		return result;
	}
	//获取所有房间类型信息
	@GetMapping(value="/getlistbyall")
	public Result<RoomTypeModel> getListByAll() throws Exception{
		Result<RoomTypeModel> result=new Result<RoomTypeModel>();
		result.setList(rts.getListByAll());
		result.setStatus("OK");
		result.setMessage("取得所有房间类型对象成功!");
		return result;
	}
	
	

}

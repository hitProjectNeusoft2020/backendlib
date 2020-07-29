package com.neusoft.hotel.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.manage.model.ConsumptionTypeModel;
import com.neusoft.hotel.manage.service.IConsumptionTypeService;
import com.neusoft.hotel.restresult.Result;

@RestController
@RequestMapping(value="/consumptiontype")
public class ConsumptionTypeController {
	
	@Autowired
	private IConsumptionTypeService cts = null;
	
	//增加额外消费品种类
	@PostMapping(value="/add")
	public Result<String> add(ConsumptionTypeModel ctm) throws Exception{
		cts.add(ctm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加额外消费品种类成功!");
		return result;
	}
	//修改额外消费品种类
	@PostMapping(value="/modify")
	public Result<String> modify(ConsumptionTypeModel ctm) throws Exception{
		cts.modify(ctm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改额外消费品种类成功!");
		return result;
	}
	//删除额外消费品种类
	@PostMapping(value="/delete")
	public Result<String> delete(ConsumptionTypeModel ctm) throws Exception{
		cts.delete(ctm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除额外消费品种类成功!");
		return result;
	}
	//根据id查询额外消费品种类
	@GetMapping(value="/getbyid")
	public Result<ConsumptionTypeModel> getById(@RequestParam(required=true) String id) throws Exception{
		Result<ConsumptionTypeModel> result=new Result<ConsumptionTypeModel>();
		result.setResult(cts.getById(id));
		result.setStatus("OK");
		result.setMessage("取得指定额外消费品种类对象成功!");
		return result;
	}
	//查询所有额外消费品种类
	@GetMapping(value="/getlistbyall")
	public Result<ConsumptionTypeModel> getListByAll() throws Exception{
		Result<ConsumptionTypeModel> result=new Result<ConsumptionTypeModel>();
		result.setList(cts.getListByAll());
		result.setStatus("OK");
		result.setMessage("取得所有额外消费品种类成功!");
		return result;
	}
	
	

}

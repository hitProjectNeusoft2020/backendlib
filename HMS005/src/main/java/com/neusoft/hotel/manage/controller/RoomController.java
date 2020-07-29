package com.neusoft.hotel.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.manage.model.RoomModel;
import com.neusoft.hotel.manage.model.RoomTypeModel;
import com.neusoft.hotel.manage.service.IRoomService;
import com.neusoft.hotel.manage.service.IRoomTypeService;
import com.neusoft.hotel.restresult.Result;

@RestController
@RequestMapping(value="/room")
public class RoomController {
	
	@Autowired
	private IRoomService rs = null;
	
	//增加房间
	@PostMapping(value="/add")
	public Result<String> add(@RequestParam(required=true) String id,@RequestParam(required=false) String roomState,
			@RequestParam(required=true) String roomType,@RequestParam(required=false) String remark) throws Exception{
		RoomTypeModel rtm = new RoomTypeModel();
		rtm.setRoomType(roomType);
		RoomModel rm = new RoomModel();
		rm.setId(id);
		rm.setRoomState(roomState);
		rm.setRemark(remark);
		rm.setRoomTypeModel(rtm);
		
		rs.add(rm);
		//System.out.println(am.getSuperPower());
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加房间成功!");
		return result;
	}
	//修改房间
	@PostMapping(value="/modify")
	public Result<String> modify(@RequestParam(required=true) String id,@RequestParam(required=false) String roomState,
			@RequestParam(required=false) String roomType,@RequestParam(required=false) String remark) throws Exception{
		RoomModel rm = rs.getById(id);
		if(roomState!=null) {
			rm.setRoomState(roomState);
		}
		if(roomType!=null) {
			RoomTypeModel rtm = new RoomTypeModel();
			rtm.setRoomType(roomType);
			rm.setRoomTypeModel(rtm);
		}
		if(remark!=null) {
			rm.setRemark(remark);
		}
		//注意：问题所在：当我们修改数据的时候，是不用强制性输入所有属性的，因此，当我们没有输入某些属性时，我们可能需要先取出原元组，然后再修改
		
		rs.modify(rm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改房间成功!");
		return result;
	}
	//删除房间
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestParam(required=true) String id,@RequestParam(required=false) String roomState,
			@RequestParam(required=false) String roomType,@RequestParam(required=false) String remark) throws Exception{
		RoomModel rm = new RoomModel();
		rm.setId(id);
		
		rs.delete(rm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除房间成功!");
		return result;
	}
	//通过id获取房间
	@GetMapping(value="/getbyid")
	public Result<RoomModel> getById(@RequestParam(required=true) String id) throws Exception{
		Result<RoomModel> result=new Result<RoomModel>();
		result.setResult(rs.getById(id));
		result.setStatus("OK");
		result.setMessage("取得指定房间对象成功!");
		return result;
	}
	//获取所有房间
	@GetMapping(value="/getlistbyall")
	public Result<RoomModel> getListByAll() throws Exception{
		Result<RoomModel> result=new Result<RoomModel>();
		result.setList(rs.getListByAll());
		result.setStatus("OK");
		result.setMessage("取得所有房间对象成功!");
		return result;
	}
	
	//获取可用房间
	@GetMapping(value="/getavailable")
	public Result<RoomModel> getavailable(@RequestParam(required=false) String size,@RequestParam(required=false) String level) throws Exception{
		Result<RoomModel> result=new Result<RoomModel>();
		result.setList(rs.getListByAvailable(size, level));   //动态sql语句暂未实现，如果我们不输入某些值，则会以null带进去搜索，这种筛选条件将导致什么也筛选不到
		result.setStatus("OK");
		result.setMessage("取得所有房间对象成功!");
		return result;
	}
	
	

}

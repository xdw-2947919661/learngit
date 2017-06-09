package com.cxc.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cxc.vo.User;

@RestController
@RequestMapping("/diction")
public class DictionControler {


	/**
	 * 数据字典添加
	 */
	
	@RequestMapping(value="/add", consumes="application/json", produces="application/json", method=RequestMethod.POST)
	public ResponseEntity<User> add(@RequestBody User user){
		String s;
		if(user.getName()==null){
			s="xxx";
		}else{
			 s=user.getName();
		}
		System.out.println(user.getName()+"*********");
		User u1=new User();
		u1.setId(456789765);
		u1.setPwd("fsdfsdf");
		u1.setName("张三");
		return new ResponseEntity<User>(u1,HttpStatus.OK);
	}
}

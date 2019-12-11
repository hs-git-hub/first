package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Emp;
import com.github.pagehelper.PageHelper;
import com.service.EmpService;

@RequestMapping("/xx")
@RestController
public class XjbxController {

	@Autowired
	private EmpService empService;
	
	
	@PostMapping("/xx1")
	public void xx1(@RequestBody(required=false) Map<String,Object> map) {
//		Object object = map.get("pageNo");
//		System.out.println(object+"////////////////");
		System.out.println("???<><fff<><><><");
	}
	@PostMapping("/xx2")
	public List<Emp> xx2(@RequestBody Emp emp) {
		PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
		return empService.select(emp);
	}
	
	
	
}

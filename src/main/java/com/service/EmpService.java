package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Emp;
import com.mapper.EmpMapper;
@Service
public class EmpService {

	@Autowired
	private EmpMapper empMapper;
	
	
	public List<Emp> select(Emp emp) {
		
		return empMapper.select(emp);
	}

}

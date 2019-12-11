package com.interceptor;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

//@Component
public class ParamsInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//		BufferedReader reader = request.getReader();
		//		String line = null;
		//		while((line=reader.readLine())!=null) {
		//			System.out.println("........");
		//			System.out.println(line);
		//		}

//		BufferedReader reader = request.getReader();
//		StringBuffer json = new StringBuffer();
//		while(true) {
//			String readLine = reader.readLine();
//			if (readLine == null || readLine.equalsIgnoreCase("null")) {
//				break;
//			}
//			json.append(readLine);
//		}
//
//		JSONObject parseObject = JSON.parseObject(json.toString());
//		Integer pageNo = Integer.valueOf(String.valueOf(parseObject.get("pageNo")));
//		Integer pageSize = Integer.valueOf(String.valueOf(parseObject.get("pageSize")));
//
//
//		String string = request.getParameter("pageNo");
//		Object s = request.getAttribute("pageNo");
//
//		System.out.println(string+"???????????");

		return true;
	}




}

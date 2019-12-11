package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({ "com.mapper" }) // dao层所在的包
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	
}

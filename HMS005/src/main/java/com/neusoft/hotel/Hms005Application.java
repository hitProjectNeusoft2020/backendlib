package com.neusoft.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.hotel.manage.mapper","com.neusoft.hotel.bill.mapper"})
public class Hms005Application {

	public static void main(String[] args) {
		SpringApplication.run(Hms005Application.class, args);
	}

}

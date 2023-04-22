package com.example.papermanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.papermanagementsystem.Dao")
public class PaperManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaperManagementSystemApplication.class, args);
	}

}

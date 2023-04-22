package com.example.papermanagementsystem;

import com.example.papermanagementsystem.Controller.LoginController;
import com.example.papermanagementsystem.Entity.StuLogin;
import com.example.papermanagementsystem.Service.LoginService;
import com.example.papermanagementsystem.Service.LoginServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class PaperManagementSystemApplicationTests {


	@Autowired
	LoginController lgc;

	@Autowired
	LoginServiceImpl lgs;


	@Test
	void contextLoads() {
	}

	@Test
	void TestLogin(){
		StuLogin testStu=new StuLogin(1862810320,"123","nby");
		int res=lgs.login(testStu);
		log.info("结果 ： "+res);
	}

}

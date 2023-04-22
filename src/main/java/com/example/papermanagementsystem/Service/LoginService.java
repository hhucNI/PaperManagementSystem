package com.example.papermanagementsystem.Service;

import com.example.papermanagementsystem.Dao.LoginDao;
import com.example.papermanagementsystem.Entity.StuLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    int login(StuLogin idAndPwd);


}

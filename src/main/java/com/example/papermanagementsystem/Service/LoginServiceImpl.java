package com.example.papermanagementsystem.Service;

import com.example.papermanagementsystem.Dao.LoginDao;
import com.example.papermanagementsystem.Entity.StuLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    LoginDao loginDao;


    public int login(StuLogin idAndPwd){
        StuLogin stuLogin = loginDao.selectById(idAndPwd.getId());
        if(stuLogin==null){
            return 1;
        }else if(!stuLogin.getPassword().equals(idAndPwd.getPassword())){
            return 2;
        }else{
            return 0;
        }

    }
}

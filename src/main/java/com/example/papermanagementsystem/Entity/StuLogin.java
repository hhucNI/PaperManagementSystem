package com.example.papermanagementsystem.Entity;


import lombok.Data;

@Data
public class StuLogin {
    int id;
    String password;
    //冗余但有用
    String name;

    public StuLogin(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public StuLogin() {
    }
}

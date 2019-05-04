package com.example.demo5.service;


import com.example.demo5.bean.LoginRequest;

import java.util.List;

public interface UserService {

//    通过id查询
    LoginRequest getUserById(Integer id);

//    获取用户列表
    public List<LoginRequest> getUserList();

//    增
    public int add(LoginRequest loginRequest);

//    删
    public int delete(Integer id);

//    改
    public int update(Integer id, LoginRequest loginRequest);
}

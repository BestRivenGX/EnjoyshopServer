package com.example.demo5.service;

import com.example.demo5.bean.LoginRequest;
import com.example.demo5.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



//  如果有一个类带了@Service注解，将自动注册到Spring容器，不需要再在applicationContext里面定义bean了
@Service
public class UserServiceImpl implements UserService{

//  Autowired:把配置好的Bean拿来用，完成属性、方法的组装
    @Autowired
    private UserMapper userMapper;

    @Override
    public LoginRequest getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<LoginRequest> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(LoginRequest loginRequest) {
        return userMapper.add(loginRequest);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(Integer id, LoginRequest loginRequest) {
        return userMapper.update(id,loginRequest);
    }
}

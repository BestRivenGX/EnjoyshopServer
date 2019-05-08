package com.example.demo5.service;


import com.example.demo5.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

//    通过id查询
    User getUserById(@Param("username")String username);

//    获取用户列表
    public List<User> getUserList();

//    增
    public int add(User user);

//    删
    public int delete(Integer id);

//    改
    public int update(Integer id, User user);
}

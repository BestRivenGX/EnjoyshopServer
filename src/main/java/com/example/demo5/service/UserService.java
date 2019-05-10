package com.example.demo5.service;

import com.example.demo5.dao.UserMapper;
import com.example.demo5.model.User;
import com.example.demo5.request.UserRequest;
import com.example.demo5.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo5.dao.UserDynamicSqlSupport.user;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;

@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public LoginVO login(UserRequest userRequest) {
        List<User> loginByUsername = userMapper
                .selectByExample()
                .where(user.username, isEqualTo(userRequest.username))
                .and(user.password,isEqualTo(userRequest.password))
                .build()
                .execute();

        if (loginByUsername.size() != 1) {
            throw new RuntimeException("用户不存在或密码错误");
        }

        User record = loginByUsername.get(0);
        LoginVO vo = new LoginVO();
        vo.setUsername(record.getUsername());
        vo.setAccount(record.getAccount());
        vo.setStatus(record.getStatus());
        vo.setToken(record.getToken());
        return vo;
    }

}

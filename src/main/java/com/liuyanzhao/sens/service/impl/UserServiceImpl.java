package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.entity.User;
import com.liuyanzhao.sens.mapper.UserMapper;
import com.liuyanzhao.sens.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveByUser(User user) {
        if (user != null && user.getId() != null) {
            userMapper.updateById(user);
        } else {
            userMapper.insert(user);
        }
    }

    @Override
    public User findByPhone(String phone) {
        User user = new User();
        user.setMobi(phone);
        return userMapper.selectOne(user);
    }

    @Override
    public User findByUserId(Long userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public void removeUser(Long userId) {
        userMapper.deleteById(userId);
    }
}

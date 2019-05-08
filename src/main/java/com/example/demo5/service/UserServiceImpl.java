package com.example.demo5.service;

import com.example.demo5.dao.UserDynamicSqlSupport;
import com.example.demo5.model.User;
import com.example.demo5.dao.UserMapper;
import com.sun.org.apache.bcel.internal.generic.InstructionComparator;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.select;


//  如果有一个类带了@Service注解，将自动注册到Spring容器，不需要再在applicationContext里面定义bean了
@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;
    //  Autowired:把配置好的Bean拿来用，完成属性、方法的组装
    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(String username) {
        InstructionComparator select = Select.getComparator();
        //SQL语句为 select username, password, tel from user where username = ?; 参数username
        User user = userMapper.selectOne(
                select(
                        UserDynamicSqlSupport.username,
                        UserDynamicSqlSupport.password,
                        UserDynamicSqlSupport.account,
                        UserDynamicSqlSupport.id)
                        .from(UserDynamicSqlSupport.user)
                        .where(UserDynamicSqlSupport.username, IsEqualTo.of(()->username))
                        .build()
                        .render(RenderingStrategy.MYBATIS3));

        //SQL语句 select username....(所有字段) from user where username = ?; 参数username
        user = userMapper.selectByExample()
                .where(UserDynamicSqlSupport.username, IsEqualTo.of(()->username))
                .build()
                .execute()
                .get(0);
        return user;
    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public int update(Integer id, User user) {
        return 0;
    }
//    @Override
//    public User getUserById(Integer id) {
//        List<> list = select.....;
//        if (list.size() == 0) {
//
//        }
//        LoginVO vo = new LoginVO();
//        vo.setNamel(list(0).g);
//        vo.setHige(list);
//        return vo;
//        return userMapper.getUserById(id);
//    }
//
//    @Override
//    public List<User> getUserList() {
//        return userMapper.getUserList();
//    }
//
//    @Override
//    public int add(User user) {
//        return userMapper.add(user);
//    }
//
//    @Override
//    public int delete(Integer id) {
//        return userMapper.delete(id);
//    }
//
//    @Override
//    public int update(Integer id, User user) {
//        return userMapper.update(id, user);
//    }
}

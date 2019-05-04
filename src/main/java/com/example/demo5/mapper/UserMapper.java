package com.example.demo5.mapper;

import com.example.demo5.bean.LoginRequest;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;



// @Mapper 这里可以使用@Mapper注解，但是每个mapper都加注解比较麻烦，
// 所以统一配置@MapperScan在扫描路径在application类中
//@Repository，不添加此注解会报错 【Could not autowire.】
@Repository
public interface UserMapper {

//    查
    @Select("SELECT * FROM user WHERE id = #{id}")
    LoginRequest getUserById(Integer id);

//    查所有
    @Select("SELECT * FROM user")
    public List<LoginRequest> getUserList();

//    增
    @Select("insert into user(id,account,password,username) values (#{id},#{account},#{password},#{username})")
    public int add(LoginRequest loginRequest);

//    删
    @Select("delete from user where id=#{id}")
    public int delete(Integer id);

//    改
    @Update("update User set account=#{user.account},password=#{user.password},username=#{user.username} where id=#{id}")
    public int update(@Param("id") Integer id, @Param("loginRequest") LoginRequest loginRequest);
}

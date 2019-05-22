package com.liuyanzhao.sens.service;

import com.liuyanzhao.sens.entity.User;


/**
 * <pre>
 *     用户业务逻辑接口
 * </pre>
 *
 */
public interface UserService {

    /**
     * 新增/修改用户
     *
     * @param user user
     * @return Role
     */
    void saveByUser(User user);

    /**
     * 根据手机号获得用户
     *
     * @param phone 手机号
     * @return 用户
     */
    User findByPhone(String phone);


    /**
     * 根据用户Id获得用户
     *
     * @param userId 用户名
     * @return 用户
     */
    User findByUserId(Long userId);

    /**
     * 删除用户
     *
     * @param userId 用户Id
     */
    void removeUser(Long userId);

}

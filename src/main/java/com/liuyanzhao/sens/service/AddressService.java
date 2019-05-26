package com.liuyanzhao.sens.service;

import com.liuyanzhao.sens.entity.Address;

import java.util.List;


/**
 * <pre>
 *     地址业务逻辑接口
 * </pre>
 *
 */
public interface AddressService {

    /**
     * 新增/修改地址
     *
     * @param address address
     * @return Role
     */
    void saveByAddress(Address address);

    /**
     * 根据地址Id获得地址
     *
     * @param addressId 地址名
     * @return 地址
     */
    Address findByAddressId(Long addressId);
    
    /**
     * 删除地址
     *
     * @param addressId 地址Id
     */
    void removeAddress(Long addressId);


    /**
     * 根据用户ID获得地址
     *
     * @param userId 用户ID
     * @return
     */
    List<Address> findByUserId(Long userId);

    /**
     * 去掉某个用户的默认地址
     *
     * @param userId 用户ID
     */
    void resetDefaultAddress(Long userId);
}

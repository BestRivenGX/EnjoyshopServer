package com.liuyanzhao.sens.service;

import com.liuyanzhao.sens.entity.Address;
import com.liuyanzhao.sens.entity.Order;

import java.util.List;


/**
 * <pre>
 *     订单业务逻辑接口
 * </pre>
 *
 */
public interface OrderService {

    /**
     * 新增/修改订单
     *
     * @param order order
     * @return Role
     */
    void saveByOrder(Order order);

    /**
     * 根据订单Id获得订单
     *
     * @param orderId 订单名
     * @return 订单
     */
    Order findByOrderId(Long orderId);
    
    /**
     * 删除订单
     *
     * @param orderId 订单Id
     */
    void removeOrder(Long orderId);

    /**
     * 根据用户ID获得订单
     *
     * @param userId 用户ID
     * @return
     */
    List<Order> findByUserId(Long userId);
}

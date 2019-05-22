package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.entity.Address;
import com.liuyanzhao.sens.entity.Order;
import com.liuyanzhao.sens.mapper.OrderMapper;
import com.liuyanzhao.sens.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void saveByOrder(Order order) {
        if (order != null && order.getId() != null) {
            orderMapper.updateById(order);
        } else {
            orderMapper.insert(order);
        }
    }


    @Override
    public Order findByOrderId(Long orderId) {
        return orderMapper.selectById(orderId);
    }

    @Override
    public void removeOrder(Long orderId) {
        orderMapper.deleteById(orderId);
    }

    @Override
    public List<Order> findByUserId(Long userId) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("user_id", userId);
        return orderMapper.selectByMap(map);
    }
}

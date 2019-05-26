package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.entity.Address;
import com.liuyanzhao.sens.mapper.AddressMapper;
import com.liuyanzhao.sens.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public void saveByAddress(Address address) {
        //2.修改
        if (address != null && address.getId() != null) {
            addressMapper.updateById(address);
        } else {
            addressMapper.insert(address);
        }
    }



    @Override
    public Address findByAddressId(Long addressId) {
        return addressMapper.selectById(addressId);
    }

    @Override
    public void removeAddress(Long addressId) {
        addressMapper.deleteById(addressId);
    }

    @Override
    public List<Address> findByUserId(Long userId) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("user_id",userId);
        return addressMapper.selectByMap(map);
    }

    @Override
    public void resetDefaultAddress(Long userId) {
        addressMapper.resetDefaultAddress(userId);
    }
}

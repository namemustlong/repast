package com.common.serivce;

import com.common.api.BaseDeliveryAddressService;
import com.common.model.BaseDeliveryAddress;
import com.common.model.BaseDeliveryAddressExample;
import mapper.BaseDeliveryAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("baseDeliveryAddressService")
public class BaseDeliveryAddressServiceImpl implements BaseDeliveryAddressService {
    @Autowired
    private BaseDeliveryAddressMapper mapper;

    @Override
    public List<BaseDeliveryAddress> qryAllDeliveryAddress() {
        return mapper.selectByExample(new BaseDeliveryAddressExample());
    }
}

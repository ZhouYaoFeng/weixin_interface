package com.hbq.share.service.impl;

import com.hbq.share.bean.Result;
import com.hbq.share.dao.CustomerMapper;
import com.hbq.share.entity.model.Customer;
import com.hbq.share.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zyf10 on 2017/6/24.
 */
@Service("baseService")
public class baseServiceImpl implements BaseService {
    @Resource
    CustomerMapper customerMapper ;

    public Result addUser(Customer customer) {
        int id = customerMapper.insert(customer);
        Result result = new Result();
        result.setMsg(id+"" );
        return result;
    }
}

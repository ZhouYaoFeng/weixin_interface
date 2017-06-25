package com.hbq.share.controller;

import com.hbq.share.bean.Result;
import com.hbq.share.entity.model.Customer;
import com.hbq.share.service.BaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zyf10 on 2017/6/15.
 */
@Controller
public class SystemController {
    @Resource
    BaseService baseService;

    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public Result test(Customer customer){
        return baseService.addUser(customer);
    }
}

package com.fzz.Feign.controller;

import com.fzz.Feign.Client.ComputerClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huayu on 2017/5/22.
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputerClient computerClient;
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(){
        return computerClient.add(10,20);
    }
}

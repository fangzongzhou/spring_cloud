package com.fzz.Feign.Client;

import com.fzz.Feign.hystrix.ComputerClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huayu on 2017/5/22.
 */
@FeignClient(value = "compute-service",fallback = ComputerClientHystrix.class)
public interface ComputerClient {

    @RequestMapping(method = RequestMethod.GET,value = "/add" )
    Integer add(@RequestParam(value = "a")Integer a,@RequestParam(value = "b") Integer b);
}

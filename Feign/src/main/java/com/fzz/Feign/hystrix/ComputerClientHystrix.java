package com.fzz.Feign.hystrix;

import com.fzz.Feign.Client.ComputerClient;
import org.springframework.stereotype.Component;

/**
 * Created by huayu on 2017/5/22.
 */
@Component
public class ComputerClientHystrix implements ComputerClient {
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}

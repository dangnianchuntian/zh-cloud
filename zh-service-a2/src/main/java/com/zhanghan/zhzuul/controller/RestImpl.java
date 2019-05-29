package com.zhanghan.zhzuul.controller;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 *
 * @author Haojun Ren
 * @version 1.0
 */

import com.zhanghan.zhzuul.controller.request.LombokRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestImpl {


    @RequestMapping(path = "/ttt", method = RequestMethod.POST)
    public Object rest(@RequestBody LombokRequest lombokRequest) {

        Map<String,String> result = new HashMap<>();
        result.put("service","this is a2");
        result.put("mobile",lombokRequest.getMobile());
        return result;
    }


}
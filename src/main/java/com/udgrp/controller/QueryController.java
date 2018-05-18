package com.udgrp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.udgrp.service.QueryService;

/**
 * @author kejw
 * @version V1.0
 * @Project phoenix-test
 * @Description: TODO
 * @date 2018/5/7
 */

@Controller
@RequestMapping("/kylin")
public class QueryController {

    @Autowired
    QueryService queryService;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public int getTraffic(int pageSize) {
        System.out.println(pageSize);
        return queryService.count(pageSize);
    }
}















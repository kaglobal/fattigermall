package com.kaglobal.malladmin.rest.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/27 16:04
 * @Version 1.0.0
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public  String test(){

        return "hello";
    }
    @RequestMapping(value = "/mall-admin/test",method = RequestMethod.GET)
    public  String test1(){

        return "hello1";
    }

}

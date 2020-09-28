package com.kaglobal.malladmin.rest.v1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
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
@Api(tags = "测试记录",description = "测试记录")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public  String test(){

        return "hello";
    }
    @RequestMapping(value = "/mall-admin/test",method = RequestMethod.GET)
    public  String test1(){

        return "hello1";
    }

    @ApiOperation(value = "1.0.0 新增输血记录数据", httpMethod = "POST", notes = "1.0.0 新增输血记录信息", consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping("/v1//blood-transfusion-record")
    public String  AnesthAfterInsert(){

        return  "ss";
    }
}

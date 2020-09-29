package com.kaglobal.malladmin.rest.v1;

import com.kaglobal.malladmin.biz.sevice.MemberBizService;
import com.kaglobal.malladmin.entity.Member;
import com.kaglobal.mallcommon.base.ResponseDataModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    private  MemberBizService memberBizService;
    TestController(MemberBizService memberBizService){
        this.memberBizService = memberBizService;
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public  String test(){

        return "hello";
    }
    @RequestMapping(value = "/mall-admin/test",method = RequestMethod.GET)
    public ResponseDataModel<List<Member>> test1(){

        return ResponseDataModel.ok(memberBizService.selectMemberList());
    }

    @ApiOperation(value = "1.0.0 新增输血记录数据", httpMethod = "POST", notes = "1.0.0 新增输血记录信息", consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping("/v1//blood-transfusion-record")
    public String  AnesthAfterInsert(){

        return  "ss";
    }
}

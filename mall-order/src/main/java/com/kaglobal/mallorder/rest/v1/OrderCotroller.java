package com.kaglobal.mallorder.rest.v1;

import com.kaglobal.mallcommon.base.ResponseDataModel;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderCotroller
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 11:10
 * @Version 1.0.0
 **/
@Api(tags = "order",description = "订单信息")
@RestController
@RequestMapping("/v1//order")
public class OrderCotroller {

    public ResponseDataModel<Object> get(){
        return  ResponseDataModel.ok(new Object());
    }


}

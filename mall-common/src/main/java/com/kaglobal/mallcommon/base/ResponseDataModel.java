package com.kaglobal.mallcommon.base;

/**
 * @ClassName ResponseDataModel
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 11:18
 * @Version 1.0.0
 **/
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("请求响应的数据模型")
public class ResponseDataModel<T> {
    @ApiModelProperty(
            value = "接口返回状态码",
            required = true
    )
    @JsonView({BaseView.DataModel.class})
    private String code;
    @ApiModelProperty(
            value = "接口返回消息",
            required = true
    )
    @JsonView({BaseView.DataModel.class})
    private String msg;
    @ApiModelProperty(
            value = "返回数据",
            required = true
    )
    @JsonView({BaseView.DataModel.class})
    private T data;
    @ApiModelProperty(
            value = "时间戳",
            required = true
    )
    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @JsonView({BaseView.DataModel.class})
    private Date timestamp;

    public static ResponseDataModel ok() {
        return new ResponseDataModel(ResponseCode.SUCCESS, (String)null);
    }

    public ResponseDataModel() {
        this((ResponseCode)ResponseCode.SUCCESS, (String)null);
    }

    public static <T> ResponseDataModel<T> ok(T data) {
        ResponseDataModel<T> model = new ResponseDataModel(ResponseCode.SUCCESS, (String)null);
        model.setData(data);
        return model;
    }

    public ResponseDataModel(ResponseCode responseCode, String msg) {
        this.timestamp = new Date();
        this.code = responseCode.code();
        this.msg = msg;
    }

    public ResponseDataModel(String code, String msg) {
        this.timestamp = new Date();
        this.code = code;
        this.msg = msg;
    }

    public ResponseDataModel(String code, String msg, T data) {
        this.timestamp = new Date();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

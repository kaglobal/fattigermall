package com.kaglobal.mallcommon.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * @ClassName BaseDTO
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 16:14
 * @Version 1.0.0
 **/
public class BaseDTO implements Serializable {
    @ApiModelProperty("主键")
    private Long id;
    @JsonIgnore
    @ApiModelProperty(
            value = "操作人id",
            hidden = true
    )
    private Long operId;
    @JsonIgnore
    @ApiModelProperty(
            value = "有效性",
            hidden = true
    )
    private Boolean validity;

    public BaseDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOperId() {
        return this.operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public Boolean getValidity() {
        return this.validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toStringExclude(this, Constants.excludeFieldNames);
    }
}

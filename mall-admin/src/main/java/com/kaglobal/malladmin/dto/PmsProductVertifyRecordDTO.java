package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 商品审核记录DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "商品审核记录DTO")
public class PmsProductVertifyRecordDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;
    /** createTime */
    @ApiModelProperty(value = "", position = 2)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /** 审核人 */
    @ApiModelProperty(value = "审核人", position = 3)
    private String vertifyMan;
    /** status */
    @ApiModelProperty(value = "", position = 4)
    private Integer status;
    /** 反馈详情 */
    @ApiModelProperty(value = "反馈详情", position = 5)
    private String detail;
}
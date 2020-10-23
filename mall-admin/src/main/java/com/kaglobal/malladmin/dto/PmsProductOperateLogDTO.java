package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import lombok.Data;

/**
 * DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "DTO")
public class PmsProductOperateLogDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;
    /** priceOld */
    @ApiModelProperty(value = "", position = 2)
    private BigDecimal priceOld;
    /** priceNew */
    @ApiModelProperty(value = "", position = 3)
    private BigDecimal priceNew;
    /** salePriceOld */
    @ApiModelProperty(value = "", position = 4)
    private BigDecimal salePriceOld;
    /** salePriceNew */
    @ApiModelProperty(value = "", position = 5)
    private BigDecimal salePriceNew;
    /** 赠送的积分 */
    @ApiModelProperty(value = "赠送的积分", position = 6)
    private Integer giftPointOld;
    /** giftPointNew */
    @ApiModelProperty(value = "", position = 7)
    private Integer giftPointNew;
    /** usePointLimitOld */
    @ApiModelProperty(value = "", position = 8)
    private Integer usePointLimitOld;
    /** usePointLimitNew */
    @ApiModelProperty(value = "", position = 9)
    private Integer usePointLimitNew;
    /** 操作人 */
    @ApiModelProperty(value = "操作人", position = 10)
    private String operateMan;
    /** createTime */
    @ApiModelProperty(value = "", position = 11)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
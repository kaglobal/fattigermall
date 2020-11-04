package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 查询运费模版VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "查询运费模版VO")
public class PmsFeightTemplateQueryVO {

    /** id */
    @ApiModelProperty(value = "")
    private Long id;

    /** name */
    @ApiModelProperty(value = "", position = 1)
    private String name;

    /** 计费类型:0->按重量；1->按件数 */
    @ApiModelProperty(value = "计费类型:0->按重量；1->按件数", position = 2)
    private Integer chargeType;

    /** 首重kg */
    @ApiModelProperty(value = "首重kg", position = 3)
    private BigDecimal firstWeight;

    /** 首费（元） */
    @ApiModelProperty(value = "首费（元）", position = 4)
    private BigDecimal firstFee;

    /** continueWeight */
    @ApiModelProperty(value = "", position = 5)
    private BigDecimal continueWeight;

    /** continmeFee */
    @ApiModelProperty(value = "", position = 6)
    private BigDecimal continmeFee;

    /** 目的地（省、市） */
    @ApiModelProperty(value = "目的地（省、市）", position = 7)
    private String dest;
}
package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;

/**
 * 运费模版VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "运费模版VO")
public class PmsFeightTemplateSaveVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** name */
    @ApiModelProperty(value = "", position = 1 )
    @Length(max=64, message = "不能大于64")
    private String name;
    /** 计费类型:0->按重量；1->按件数 */
    @ApiModelProperty(value = "计费类型:0->按重量；1->按件数", position = 2 )
    private Integer chargeType;
    /** 首重kg */
    @ApiModelProperty(value = "首重kg", position = 3 )
    private BigDecimal firstWeight;
    /** 首费（元） */
    @ApiModelProperty(value = "首费（元）", position = 4 )
    private BigDecimal firstFee;
    /** continueWeight */
    @ApiModelProperty(value = "", position = 5 )
    private BigDecimal continueWeight;
    /** continmeFee */
    @ApiModelProperty(value = "", position = 6 )
    private BigDecimal continmeFee;
    /** 目的地（省、市） */
    @ApiModelProperty(value = "目的地（省、市）", position = 7 )
    @Length(max=255, message = "目的地（省、市）不能大于255")
    private String dest;
}
package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品会员价格表DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "商品会员价格表DTO")
public class PmsMemberPriceDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;
    /** memberLevelId */
    @ApiModelProperty(value = "", position = 2)
    private Long memberLevelId;
    /** 会员价格 */
    @ApiModelProperty(value = "会员价格", position = 3)
    private BigDecimal memberPrice;
    /** memberLevelName */
    @ApiModelProperty(value = "", position = 4)
    private String memberLevelName;
}
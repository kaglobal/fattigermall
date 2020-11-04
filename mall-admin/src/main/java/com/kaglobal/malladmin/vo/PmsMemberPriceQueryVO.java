package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 查询商品会员价格表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "查询商品会员价格表VO")
public class PmsMemberPriceQueryVO {

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
package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 产品阶梯价格表(只针对同商品)DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "产品阶梯价格表(只针对同商品)DTO")
public class PmsProductLadderDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;
    /** 满足的商品数量 */
    @ApiModelProperty(value = "满足的商品数量", position = 2)
    private Integer count;
    /** 折扣 */
    @ApiModelProperty(value = "折扣", position = 3)
    private BigDecimal discount;
    /** 折后价格 */
    @ApiModelProperty(value = "折后价格", position = 4)
    private BigDecimal price;
}
package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * sku的库存DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "sku的库存DTO")
public class PmsSkuStockDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;
    /** sku编码 */
    @ApiModelProperty(value = "sku编码", position = 2)
    private String skuCode;
    /** price */
    @ApiModelProperty(value = "", position = 3)
    private BigDecimal price;
    /** 库存 */
    @ApiModelProperty(value = "库存", position = 4)
    private Integer stock;
    /** 预警库存 */
    @ApiModelProperty(value = "预警库存", position = 5)
    private Integer lowStock;
    /** 展示图片 */
    @ApiModelProperty(value = "展示图片", position = 6)
    private String pic;
    /** 销量 */
    @ApiModelProperty(value = "销量", position = 7)
    private Integer sale;
    /** 单品促销价格 */
    @ApiModelProperty(value = "单品促销价格", position = 8)
    private BigDecimal promotionPrice;
    /** 锁定库存 */
    @ApiModelProperty(value = "锁定库存", position = 9)
    private Integer lockStock;
    /** 商品销售属性，json格式 */
    @ApiModelProperty(value = "商品销售属性，json格式", position = 10)
    private String spData;
}
package com.kaglobal.malladmin.entity;

import java.math.BigDecimal;
import lombok.*;

/**
 * sku的库存
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsSkuStock {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** sku编码 */
    private String skuCode;
    /** price */
    private BigDecimal price;
    /** 库存 */
    private Integer stock;
    /** 预警库存 */
    private Integer lowStock;
    /** 展示图片 */
    private String pic;
    /** 销量 */
    private Integer sale;
    /** 单品促销价格 */
    private BigDecimal promotionPrice;
    /** 锁定库存 */
    private Integer lockStock;
    /** 商品销售属性，json格式 */
    private String spData;
}
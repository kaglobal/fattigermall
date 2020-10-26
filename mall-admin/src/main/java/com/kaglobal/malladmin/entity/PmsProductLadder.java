package com.kaglobal.malladmin.entity;

import java.math.BigDecimal;
import lombok.*;

/**
 * 产品阶梯价格表(只针对同商品)
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductLadder {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** 满足的商品数量 */
    private Integer count;
    /** 折扣 */
    private BigDecimal discount;
    /** 折后价格 */
    private BigDecimal price;
}
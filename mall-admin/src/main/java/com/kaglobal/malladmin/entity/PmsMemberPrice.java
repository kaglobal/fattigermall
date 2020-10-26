package com.kaglobal.malladmin.entity;

import java.math.BigDecimal;
import lombok.*;

/**
 * 商品会员价格表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsMemberPrice {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** memberLevelId */
    private Long memberLevelId;
    /** 会员价格 */
    private BigDecimal memberPrice;
    /** memberLevelName */
    private String memberLevelName;
}
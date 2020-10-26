package com.kaglobal.malladmin.entity;

import java.math.BigDecimal;
import lombok.*;

/**
 * 产品满减表(只针对同商品)
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductFullReduction {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** fullPrice */
    private BigDecimal fullPrice;
    /** reducePrice */
    private BigDecimal reducePrice;
}
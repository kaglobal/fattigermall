package com.kaglobal.malladmin.entity;

import java.util.Date;
import java.math.BigDecimal;
import lombok.*;

/**
 * 
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductOperateLog {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** priceOld */
    private BigDecimal priceOld;
    /** priceNew */
    private BigDecimal priceNew;
    /** salePriceOld */
    private BigDecimal salePriceOld;
    /** salePriceNew */
    private BigDecimal salePriceNew;
    /** 赠送的积分 */
    private Integer giftPointOld;
    /** giftPointNew */
    private Integer giftPointNew;
    /** usePointLimitOld */
    private Integer usePointLimitOld;
    /** usePointLimitNew */
    private Integer usePointLimitNew;
    /** 操作人 */
    private String operateMan;
    /** createTime */
    private Date createTime;
}
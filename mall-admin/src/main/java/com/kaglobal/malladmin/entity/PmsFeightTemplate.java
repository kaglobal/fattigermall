package com.kaglobal.malladmin.entity;

import java.math.BigDecimal;
import lombok.*;

/**
 * 运费模版
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsFeightTemplate {
    /** id */
    private Long id;
    /** name */
    private String name;
    /** 计费类型:0->按重量；1->按件数 */
    private Integer chargeType;
    /** 首重kg */
    private BigDecimal firstWeight;
    /** 首费（元） */
    private BigDecimal firstFee;
    /** continueWeight */
    private BigDecimal continueWeight;
    /** continmeFee */
    private BigDecimal continmeFee;
    /** 目的地（省、市） */
    private String dest;
}
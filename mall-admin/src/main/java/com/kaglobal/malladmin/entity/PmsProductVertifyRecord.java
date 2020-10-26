package com.kaglobal.malladmin.entity;

import java.util.Date;

import lombok.*;

/**
 * 商品审核记录
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductVertifyRecord {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** createTime */
    private Date createTime;
    /** 审核人 */
    private String vertifyMan;
    /** status */
    private Integer status;
    /** 反馈详情 */
    private String detail;
}
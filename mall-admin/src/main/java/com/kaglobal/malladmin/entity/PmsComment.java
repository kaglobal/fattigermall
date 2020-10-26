package com.kaglobal.malladmin.entity;

import java.util.Date;

import lombok.*;

/**
 * 商品评价表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsComment {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** memberNickName */
    private String memberNickName;
    /** productName */
    private String productName;
    /** 评价星数：0->5 */
    private Integer star;
    /** 评价的ip */
    private String memberIp;
    /** createTime */
    private Date createTime;
    /** showStatus */
    private Integer showStatus;
    /** 购买时的商品属性 */
    private String productAttribute;
    /** collectCouont */
    private Integer collectCouont;
    /** readCount */
    private Integer readCount;
    /** content */
    private String content;
    /** 上传图片地址，以逗号隔开 */
    private String pics;
    /** 评论用户头像 */
    private String memberIcon;
    /** replayCount */
    private Integer replayCount;
}
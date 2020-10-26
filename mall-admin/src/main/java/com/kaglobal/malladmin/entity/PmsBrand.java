package com.kaglobal.malladmin.entity;


import lombok.*;

/**
 * 品牌表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsBrand {
    /** id */
    private Long id;
    /** name */
    private String name;
    /** 首字母 */
    private String firstLetter;
    /** sort */
    private Integer sort;
    /** 是否为品牌制造商：0->不是；1->是 */
    private Integer factoryStatus;
    /** showStatus */
    private Integer showStatus;
    /** 产品数量 */
    private Integer productCount;
    /** 产品评论数量 */
    private Integer productCommentCount;
    /** 品牌logo */
    private String logo;
    /** 专区大图 */
    private String bigPic;
    /** 品牌故事 */
    private String brandStory;
}
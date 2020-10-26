package com.kaglobal.malladmin.entity;


import lombok.*;

/**
 * 产品分类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductCategory {
    /** id */
    private Long id;
    /** 上机分类的编号：0表示一级分类 */
    private Long parentId;
    /** name */
    private String name;
    /** 分类级别：0->1级；1->2级 */
    private Integer level;
    /** productCount */
    private Integer productCount;
    /** productUnit */
    private String productUnit;
    /** 是否显示在导航栏：0->不显示；1->显示 */
    private Integer navStatus;
    /** 显示状态：0->不显示；1->显示 */
    private Integer showStatus;
    /** sort */
    private Integer sort;
    /** 图标 */
    private String icon;
    /** keywords */
    private String keywords;
    /** 描述 */
    private String description;
}
package com.kaglobal.malladmin.entity;


import lombok.*;

/**
 * 产品属性分类表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductAttributeCategory {
    /** id */
    private Long id;
    /** name */
    private String name;
    /** 属性数量 */
    private Integer attributeCount;
    /** 参数数量 */
    private Integer paramCount;
}
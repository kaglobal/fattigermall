package com.kaglobal.malladmin.entity;


import lombok.*;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductCategoryAttributeRelation {
    /** id */
    private Long id;
    /** productCategoryId */
    private Long productCategoryId;
    /** productAttributeId */
    private Long productAttributeId;
}
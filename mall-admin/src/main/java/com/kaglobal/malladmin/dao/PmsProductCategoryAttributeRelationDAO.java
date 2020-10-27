package com.kaglobal.malladmin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaglobal.malladmin.entity.PmsProductCategoryAttributeRelation;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） DAO
 * 
 * @author bianj
 * @version 2020-10-19
 */
public interface PmsProductCategoryAttributeRelationDAO extends BaseMapper<PmsProductCategoryAttributeRelation> {

}
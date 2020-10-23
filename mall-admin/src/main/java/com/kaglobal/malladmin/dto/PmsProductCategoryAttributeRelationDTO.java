package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "产品的分类和属性的关系表DTO")
public class PmsProductCategoryAttributeRelationDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productCategoryId */
    @ApiModelProperty(value = "", position = 1)
    private Long productCategoryId;
    /** productAttributeId */
    @ApiModelProperty(value = "", position = 2)
    private Long productAttributeId;
}
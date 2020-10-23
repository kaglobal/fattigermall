package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 商品属性参数表DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "商品属性参数表DTO")
public class PmsProductAttributeDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productAttributeCategoryId */
    @ApiModelProperty(value = "", position = 1)
    private Long productAttributeCategoryId;
    /** name */
    @ApiModelProperty(value = "", position = 2)
    private String name;
    /** 属性选择类型：0->唯一；1->单选；2->多选 */
    @ApiModelProperty(value = "属性选择类型：0->唯一；1->单选；2->多选", position = 3)
    private Integer selectType;
    /** 属性录入方式：0->手工录入；1->从列表中选取 */
    @ApiModelProperty(value = "属性录入方式：0->手工录入；1->从列表中选取", position = 4)
    private Integer inputType;
    /** 可选值列表，以逗号隔开 */
    @ApiModelProperty(value = "可选值列表，以逗号隔开", position = 5)
    private String inputList;
    /** 排序字段：最高的可以单独上传图片 */
    @ApiModelProperty(value = "排序字段：最高的可以单独上传图片", position = 6)
    private Integer sort;
    /** 分类筛选样式：1->普通；1->颜色 */
    @ApiModelProperty(value = "分类筛选样式：1->普通；1->颜色", position = 7)
    private Integer filterType;
    /** 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索 */
    @ApiModelProperty(value = "检索类型；0->不需要进行检索；1->关键字检索；2->范围检索", position = 8)
    private Integer searchType;
    /** 相同属性产品是否关联；0->不关联；1->关联 */
    @ApiModelProperty(value = "相同属性产品是否关联；0->不关联；1->关联", position = 9)
    private Integer relatedStatus;
    /** 是否支持手动新增；0->不支持；1->支持 */
    @ApiModelProperty(value = "是否支持手动新增；0->不支持；1->支持", position = 10)
    private Integer handAddStatus;
    /** 属性的类型；0->规格；1->参数 */
    @ApiModelProperty(value = "属性的类型；0->规格；1->参数", position = 11)
    private Integer type;
}
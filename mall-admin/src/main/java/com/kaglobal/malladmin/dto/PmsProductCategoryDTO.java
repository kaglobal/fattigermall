package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 产品分类DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "产品分类DTO")
public class PmsProductCategoryDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** 上机分类的编号：0表示一级分类 */
    @ApiModelProperty(value = "上机分类的编号：0表示一级分类", position = 1)
    private Long parentId;
    /** name */
    @ApiModelProperty(value = "", position = 2)
    private String name;
    /** 分类级别：0->1级；1->2级 */
    @ApiModelProperty(value = "分类级别：0->1级；1->2级", position = 3)
    private Integer level;
    /** productCount */
    @ApiModelProperty(value = "", position = 4)
    private Integer productCount;
    /** productUnit */
    @ApiModelProperty(value = "", position = 5)
    private String productUnit;
    /** 是否显示在导航栏：0->不显示；1->显示 */
    @ApiModelProperty(value = "是否显示在导航栏：0->不显示；1->显示", position = 6)
    private Integer navStatus;
    /** 显示状态：0->不显示；1->显示 */
    @ApiModelProperty(value = "显示状态：0->不显示；1->显示", position = 7)
    private Integer showStatus;
    /** sort */
    @ApiModelProperty(value = "", position = 8)
    private Integer sort;
    /** 图标 */
    @ApiModelProperty(value = "图标", position = 9)
    private String icon;
    /** keywords */
    @ApiModelProperty(value = "", position = 10)
    private String keywords;
    /** 描述 */
    @ApiModelProperty(value = "描述", position = 11)
    private String description;
}
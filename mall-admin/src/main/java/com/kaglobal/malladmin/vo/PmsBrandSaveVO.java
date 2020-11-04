package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;

/**
 * 品牌表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "品牌表VO")
public class PmsBrandSaveVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** name */
    @ApiModelProperty(value = "", position = 1 )
    @Length(max=64, message = "不能大于64")
    private String name;
    /** 首字母 */
    @ApiModelProperty(value = "首字母", position = 2 )
    @Length(max=8, message = "首字母不能大于8")
    private String firstLetter;
    /** sort */
    @ApiModelProperty(value = "", position = 3 )
    private Integer sort;
    /** 是否为品牌制造商：0->不是；1->是 */
    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是", position = 4 )
    private Integer factoryStatus;
    /** showStatus */
    @ApiModelProperty(value = "", position = 5 )
    private Integer showStatus;
    /** 产品数量 */
    @ApiModelProperty(value = "产品数量", position = 6 )
    private Integer productCount;
    /** 产品评论数量 */
    @ApiModelProperty(value = "产品评论数量", position = 7 )
    private Integer productCommentCount;
    /** 品牌logo */
    @ApiModelProperty(value = "品牌logo", position = 8 )
    @Length(max=255, message = "品牌logo不能大于255")
    private String logo;
    /** 专区大图 */
    @ApiModelProperty(value = "专区大图", position = 9 )
    @Length(max=255, message = "专区大图不能大于255")
    private String bigPic;
    /** 品牌故事 */
    @ApiModelProperty(value = "品牌故事", position = 10 )
    @Length(max=65535, message = "品牌故事不能大于65535")
    private String brandStory;
}
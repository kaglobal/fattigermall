package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;

/**
 * 相册表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "相册表VO")
public class PmsAlbumSaveVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** name */
    @ApiModelProperty(value = "", position = 1 )
    @Length(max=64, message = "不能大于64")
    private String name;
    /** coverPic */
    @ApiModelProperty(value = "", position = 2 )
    @Length(max=1000, message = "不能大于1000")
    private String coverPic;
    /** picCount */
    @ApiModelProperty(value = "", position = 3 )
    private Integer picCount;
    /** sort */
    @ApiModelProperty(value = "", position = 4 )
    private Integer sort;
    /** description */
    @ApiModelProperty(value = "", position = 5 )
    @Length(max=1000, message = "不能大于1000")
    private String description;
}
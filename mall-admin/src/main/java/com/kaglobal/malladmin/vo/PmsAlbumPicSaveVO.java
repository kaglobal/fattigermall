package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;

/**
 * 画册图片表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "画册图片表VO")
public class PmsAlbumPicSaveVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** albumId */
    @ApiModelProperty(value = "", position = 1 )
    private Long albumId;
    /** pic */
    @ApiModelProperty(value = "", position = 2 )
    @Length(max=1000, message = "不能大于1000")
    private String pic;
}
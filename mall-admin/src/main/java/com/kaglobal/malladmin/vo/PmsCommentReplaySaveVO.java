package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;

/**
 * 产品评价回复表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "产品评价回复表VO")
public class PmsCommentReplaySaveVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** commentId */
    @ApiModelProperty(value = "", position = 1 )
    private Long commentId;
    /** memberNickName */
    @ApiModelProperty(value = "", position = 2 )
    @Length(max=255, message = "不能大于255")
    private String memberNickName;
    /** memberIcon */
    @ApiModelProperty(value = "", position = 3 )
    @Length(max=255, message = "不能大于255")
    private String memberIcon;
    /** content */
    @ApiModelProperty(value = "", position = 4 )
    @Length(max=1000, message = "不能大于1000")
    private String content;
    /** createTime */
    @ApiModelProperty(value = "", position = 5 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /** 评论人员类型；0->会员；1->管理员 */
    @ApiModelProperty(value = "评论人员类型；0->会员；1->管理员", position = 6 )
    private Integer type;
}
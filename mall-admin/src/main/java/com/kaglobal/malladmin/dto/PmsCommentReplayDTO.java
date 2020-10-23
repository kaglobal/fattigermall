package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 产品评价回复表DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "产品评价回复表DTO")
public class PmsCommentReplayDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** commentId */
    @ApiModelProperty(value = "", position = 1)
    private Long commentId;
    /** memberNickName */
    @ApiModelProperty(value = "", position = 2)
    private String memberNickName;
    /** memberIcon */
    @ApiModelProperty(value = "", position = 3)
    private String memberIcon;
    /** content */
    @ApiModelProperty(value = "", position = 4)
    private String content;
    /** createTime */
    @ApiModelProperty(value = "", position = 5)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /** 评论人员类型；0->会员；1->管理员 */
    @ApiModelProperty(value = "评论人员类型；0->会员；1->管理员", position = 6)
    private Integer type;
}
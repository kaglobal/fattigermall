package com.kaglobal.malladmin.entity;

import java.util.Date;

import lombok.*;

/**
 * 产品评价回复表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsCommentReplay {
    /** id */
    private Long id;
    /** commentId */
    private Long commentId;
    /** memberNickName */
    private String memberNickName;
    /** memberIcon */
    private String memberIcon;
    /** content */
    private String content;
    /** createTime */
    private Date createTime;
    /** 评论人员类型；0->会员；1->管理员 */
    private Integer type;
}
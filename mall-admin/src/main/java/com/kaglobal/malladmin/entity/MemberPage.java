package com.kaglobal.malladmin.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Member
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 16:07
 * @Version 1.0.0
 **/
@Data
public class MemberPage<Member> implements Serializable {
    private Member data;
    private String pageNo;


    public MemberPage(Member data, String pageNo) {
        this.data = data;
        this.pageNo = pageNo;
    }
}


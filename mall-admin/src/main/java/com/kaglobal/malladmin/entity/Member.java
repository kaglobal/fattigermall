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
public class Member implements Serializable {
    private  long id;
    private String memberName;
    private String memberAge;
}

package com.kaglobal.malladmin.biz.service;

import com.kaglobal.malladmin.entity.Member;

import java.util.List;

/**
 * @ClassName MemberBizService
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 16:20
 * @Version 1.0.0
 **/
public interface MemberBizService {
    /**
    * @Description:  查询所有会员信息list
    * @Param: 
     * @param 
    * @Author: fuhang
    * @Date Created in 2020/10/28 14:38
    * @Return: java.util.List<com.kaglobal.malladmin.entity.Member>
    *@Version 1.0.0
    */
    List<Member> selectMemberList();

    
}

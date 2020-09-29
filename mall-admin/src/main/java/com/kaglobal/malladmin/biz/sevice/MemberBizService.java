package com.kaglobal.malladmin.biz.sevice;

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
    List<Member> selectMemberList();
}

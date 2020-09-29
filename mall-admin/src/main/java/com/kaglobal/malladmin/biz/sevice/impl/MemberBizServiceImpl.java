package com.kaglobal.malladmin.biz.sevice.impl;

import com.kaglobal.malladmin.biz.sevice.MemberBizService;
import com.kaglobal.malladmin.entity.Member;
import com.kaglobal.malladmin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MemberBizServiceImpl
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 16:21
 * @Version 1.0.0
 **/
@Service
public class MemberBizServiceImpl implements MemberBizService {
    @Autowired
    private MemberService memberService;


    @Override
    public List<Member> selectMemberList() {
        return  memberService.selectMemberList();
    }
}

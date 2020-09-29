package com.kaglobal.malladmin.service.impl;

import com.kaglobal.malladmin.dao.MemberDao;
import com.kaglobal.malladmin.entity.Member;
import com.kaglobal.malladmin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MemberServiceImpl
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 16:24
 * @Version 1.0.0
 **/
@Service
public class MemberServiceImpl implements MemberService {

    private MemberDao memberDao;

    MemberServiceImpl(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    @Override
    public List<Member> selectMemberList() {
        return  memberDao.queryAllUsers();
    }
}

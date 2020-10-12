package com.kaglobal.malladmin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaglobal.malladmin.entity.Member;

import java.util.List;

public interface MemberDao  extends BaseMapper<Member> {
    List<Member> selectMemberList();

    List<Member> queryAllUsers();
}

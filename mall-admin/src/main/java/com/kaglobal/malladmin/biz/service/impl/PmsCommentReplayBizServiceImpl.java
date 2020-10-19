package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsCommentReplayBizService;
import com.kaglobal.malladmin.dto.PmsCommentReplayDTO;
import com.kaglobal.malladmin.entity.PmsCommentReplay;
import com.kaglobal.malladmin.vo.PmsCommentReplayQueryVO;
import com.kaglobal.malladmin.vo.PmsCommentReplaySaveVO;
import com.kaglobal.malladmin.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 产品评价回复表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsCommentReplayBizServiceImpl implements PmsCommentReplayBizService {
    
	private PmsCommentReplayService pmsCommentReplayService;

	PmsCommentReplayBizServiceImpl(PmsCommentReplayService pmsCommentReplayService){
		this.pmsCommentReplayService = pmsCommentReplayService;
	}

    
    protected void setCriteriaForQuery(PmsCommentReplayQueryVO vo, QueryWrapper<PmsCommentReplay> criteria) {
        if(Objects.nonNull(vo.getCommentId())){
            criteria.eq("comment_id", vo.getCommentId());
        }
        if(Objects.nonNull(vo.getMemberNickName())){
            criteria.eq("member_nick_name", vo.getMemberNickName());
        }
        if(Objects.nonNull(vo.getMemberIcon())){
            criteria.eq("member_icon", vo.getMemberIcon());
        }
        if(Objects.nonNull(vo.getContent())){
            criteria.eq("content", vo.getContent());
        }
        if(Objects.nonNull(vo.getCreateTime())){
            criteria.eq("create_time", vo.getCreateTime());
        }
        if(Objects.nonNull(vo.getType())){
            criteria.eq("type", vo.getType());
        }
    }
}
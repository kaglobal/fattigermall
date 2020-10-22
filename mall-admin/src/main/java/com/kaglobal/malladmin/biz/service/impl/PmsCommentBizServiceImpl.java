package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsCommentBizService;
import com.kaglobal.malladmin.dto.PmsCommentDTO;
import com.kaglobal.malladmin.entity.PmsComment;
import com.kaglobal.malladmin.vo.PmsCommentQueryVO;
import com.kaglobal.malladmin.vo.PmsCommentSaveVO;
import com.kaglobal.malladmin.service.PmsCommentService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 商品评价表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsCommentBizServiceImpl implements PmsCommentBizService {
    
	private PmsCommentService pmsCommentService;

	PmsCommentBizServiceImpl(PmsCommentService pmsCommentService){
		this.pmsCommentService = pmsCommentService;
	}

    
    protected void setCriteriaForQuery(PmsCommentQueryVO vo, QueryWrapper<PmsComment> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getMemberNickName())){
            criteria.eq("member_nick_name", vo.getMemberNickName());
        }
        if(Objects.nonNull(vo.getProductName())){
            criteria.eq("product_name", vo.getProductName());
        }
        if(Objects.nonNull(vo.getStar())){
            criteria.eq("star", vo.getStar());
        }
        if(Objects.nonNull(vo.getMemberIp())){
            criteria.eq("member_ip", vo.getMemberIp());
        }
        if(Objects.nonNull(vo.getCreateTime())){
            criteria.eq("create_time", vo.getCreateTime());
        }
        if(Objects.nonNull(vo.getShowStatus())){
            criteria.eq("show_status", vo.getShowStatus());
        }
        if(Objects.nonNull(vo.getProductAttribute())){
            criteria.eq("product_attribute", vo.getProductAttribute());
        }
        if(Objects.nonNull(vo.getCollectCouont())){
            criteria.eq("collect_couont", vo.getCollectCouont());
        }
        if(Objects.nonNull(vo.getReadCount())){
            criteria.eq("read_count", vo.getReadCount());
        }
        if(Objects.nonNull(vo.getContent())){
            criteria.eq("content", vo.getContent());
        }
        if(Objects.nonNull(vo.getPics())){
            criteria.eq("pics", vo.getPics());
        }
        if(Objects.nonNull(vo.getMemberIcon())){
            criteria.eq("member_icon", vo.getMemberIcon());
        }
        if(Objects.nonNull(vo.getReplayCount())){
            criteria.eq("replay_count", vo.getReplayCount());
        }
    }
}
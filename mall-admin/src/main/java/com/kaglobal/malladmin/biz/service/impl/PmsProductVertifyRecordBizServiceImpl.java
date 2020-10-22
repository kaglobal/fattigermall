package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductVertifyRecordBizService;
import com.kaglobal.malladmin.dto.PmsProductVertifyRecordDTO;
import com.kaglobal.malladmin.entity.PmsProductVertifyRecord;
import com.kaglobal.malladmin.vo.PmsProductVertifyRecordQueryVO;
import com.kaglobal.malladmin.vo.PmsProductVertifyRecordSaveVO;
import com.kaglobal.malladmin.service.PmsProductVertifyRecordService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 商品审核记录 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductVertifyRecordBizServiceImpl implements PmsProductVertifyRecordBizService {
    
	private PmsProductVertifyRecordService pmsProductVertifyRecordService;

	PmsProductVertifyRecordBizServiceImpl(PmsProductVertifyRecordService pmsProductVertifyRecordService){
		this.pmsProductVertifyRecordService = pmsProductVertifyRecordService;
	}

    
    protected void setCriteriaForQuery(PmsProductVertifyRecordQueryVO vo, QueryWrapper<PmsProductVertifyRecord> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getCreateTime())){
            criteria.eq("create_time", vo.getCreateTime());
        }
        if(Objects.nonNull(vo.getVertifyMan())){
            criteria.eq("vertify_man", vo.getVertifyMan());
        }
        if(Objects.nonNull(vo.getStatus())){
            criteria.eq("status", vo.getStatus());
        }
        if(Objects.nonNull(vo.getDetail())){
            criteria.eq("detail", vo.getDetail());
        }
    }
}
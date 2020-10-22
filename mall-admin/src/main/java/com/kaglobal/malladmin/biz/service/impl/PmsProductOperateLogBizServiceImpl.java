package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductOperateLogBizService;
import com.kaglobal.malladmin.dto.PmsProductOperateLogDTO;
import com.kaglobal.malladmin.entity.PmsProductOperateLog;
import com.kaglobal.malladmin.vo.PmsProductOperateLogQueryVO;
import com.kaglobal.malladmin.vo.PmsProductOperateLogSaveVO;
import com.kaglobal.malladmin.service.PmsProductOperateLogService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 *  业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductOperateLogBizServiceImpl implements PmsProductOperateLogBizService {
    
	private PmsProductOperateLogService pmsProductOperateLogService;

	PmsProductOperateLogBizServiceImpl(PmsProductOperateLogService pmsProductOperateLogService){
		this.pmsProductOperateLogService = pmsProductOperateLogService;
	}

    
    protected void setCriteriaForQuery(PmsProductOperateLogQueryVO vo, QueryWrapper<PmsProductOperateLog> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getPriceOld())){
            criteria.eq("price_old", vo.getPriceOld());
        }
        if(Objects.nonNull(vo.getPriceNew())){
            criteria.eq("price_new", vo.getPriceNew());
        }
        if(Objects.nonNull(vo.getSalePriceOld())){
            criteria.eq("sale_price_old", vo.getSalePriceOld());
        }
        if(Objects.nonNull(vo.getSalePriceNew())){
            criteria.eq("sale_price_new", vo.getSalePriceNew());
        }
        if(Objects.nonNull(vo.getGiftPointOld())){
            criteria.eq("gift_point_old", vo.getGiftPointOld());
        }
        if(Objects.nonNull(vo.getGiftPointNew())){
            criteria.eq("gift_point_new", vo.getGiftPointNew());
        }
        if(Objects.nonNull(vo.getUsePointLimitOld())){
            criteria.eq("use_point_limit_old", vo.getUsePointLimitOld());
        }
        if(Objects.nonNull(vo.getUsePointLimitNew())){
            criteria.eq("use_point_limit_new", vo.getUsePointLimitNew());
        }
        if(Objects.nonNull(vo.getOperateMan())){
            criteria.eq("operate_man", vo.getOperateMan());
        }
        if(Objects.nonNull(vo.getCreateTime())){
            criteria.eq("create_time", vo.getCreateTime());
        }
    }
}
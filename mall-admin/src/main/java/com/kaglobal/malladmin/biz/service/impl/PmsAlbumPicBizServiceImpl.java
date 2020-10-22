package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsAlbumPicBizService;
import com.kaglobal.malladmin.dto.PmsAlbumPicDTO;
import com.kaglobal.malladmin.entity.PmsAlbumPic;
import com.kaglobal.malladmin.vo.PmsAlbumPicQueryVO;
import com.kaglobal.malladmin.vo.PmsAlbumPicSaveVO;
import com.kaglobal.malladmin.service.PmsAlbumPicService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 画册图片表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsAlbumPicBizServiceImpl implements PmsAlbumPicBizService {
    
	private PmsAlbumPicService pmsAlbumPicService;

	PmsAlbumPicBizServiceImpl(PmsAlbumPicService pmsAlbumPicService){
		this.pmsAlbumPicService = pmsAlbumPicService;
	}

    
    protected void setCriteriaForQuery(PmsAlbumPicQueryVO vo, QueryWrapper<PmsAlbumPic> criteria) {
        if(Objects.nonNull(vo.getAlbumId())){
            criteria.eq("album_id", vo.getAlbumId());
        }
        if(Objects.nonNull(vo.getPic())){
            criteria.eq("pic", vo.getPic());
        }
    }
}
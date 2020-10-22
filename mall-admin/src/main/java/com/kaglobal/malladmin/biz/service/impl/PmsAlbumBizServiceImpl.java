package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsAlbumBizService;
import com.kaglobal.malladmin.dto.PmsAlbumDTO;
import com.kaglobal.malladmin.entity.PmsAlbum;
import com.kaglobal.malladmin.vo.PmsAlbumQueryVO;
import com.kaglobal.malladmin.vo.PmsAlbumSaveVO;
import com.kaglobal.malladmin.service.PmsAlbumService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 相册表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsAlbumBizServiceImpl implements PmsAlbumBizService {
    
	private PmsAlbumService pmsAlbumService;

	PmsAlbumBizServiceImpl(PmsAlbumService pmsAlbumService){
		this.pmsAlbumService = pmsAlbumService;
	}

    
    protected void setCriteriaForQuery(PmsAlbumQueryVO vo, QueryWrapper<PmsAlbum> criteria) {
        if(Objects.nonNull(vo.getName())){
            criteria.eq("name", vo.getName());
        }
        if(Objects.nonNull(vo.getCoverPic())){
            criteria.eq("cover_pic", vo.getCoverPic());
        }
        if(Objects.nonNull(vo.getPicCount())){
            criteria.eq("pic_count", vo.getPicCount());
        }
        if(Objects.nonNull(vo.getSort())){
            criteria.eq("sort", vo.getSort());
        }
        if(Objects.nonNull(vo.getDescription())){
            criteria.eq("description", vo.getDescription());
        }
    }
}
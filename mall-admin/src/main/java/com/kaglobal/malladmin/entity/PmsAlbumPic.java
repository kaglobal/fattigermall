package com.kaglobal.malladmin.entity;


import lombok.*;

/**
 * 画册图片表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsAlbumPic {
    /** id */
    private Long id;
    /** albumId */
    private Long albumId;
    /** pic */
    private String pic;
}
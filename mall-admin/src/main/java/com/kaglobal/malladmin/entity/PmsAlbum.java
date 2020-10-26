package com.kaglobal.malladmin.entity;


import lombok.*;

/**
 * 相册表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsAlbum {
    /** id */
    private Long id;
    /** name */
    private String name;
    /** coverPic */
    private String coverPic;
    /** picCount */
    private Integer picCount;
    /** sort */
    private Integer sort;
    /** description */
    private String description;
}
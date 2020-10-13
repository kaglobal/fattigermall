package com.kaglobal.malladmin.entity;

import java.io.Serializable;

/**
 * @ClassName Role
 * @Description TODO
 * @Author fuhang
 * @Date 2020/10/13 17:03
 * @Version 1.0.0
 **/
public class Role implements Serializable {

    private Integer id;
    private String name;

    public Role() {
        super();
    }
    public Role(String name) {
        super();
        this.name = name;
    }

    // getter & setter

    @Override
    public String toString() {
        return "Role [id=" + id + ", name=" + name + "]";
    }
}
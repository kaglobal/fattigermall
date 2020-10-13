package com.kaglobal.malladmin.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName User
 * @Description TODO
 * @Author fuhang
 * @Date 2020/10/13 17:03
 * @Version 1.0.0
 **/
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Set<Role> roles = new HashSet<Role>();
    private Date createTime;

    // getter & setter

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        if (id == null) {
            return other.id == null;
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password="
                + password + ", phone=" + phone + ", email=" + email
                + ", roles=" + roles + ", createTime=" + createTime + "]";
    }
}
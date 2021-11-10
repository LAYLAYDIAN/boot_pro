package com.demo.boot_pro.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2021-11-10
 */
@TableName("app_user")
@ApiModel(value = "AppUser对象", description = "")
public class AppUser implements Serializable {

    private static final long serialVersionUID = 1L;

      private Long id;

    private String username;

    private String password;

    private String fullname;

    private String moblie;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    @Override
    public String toString() {
        return "AppUser{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", fullname=" + fullname +
        ", moblie=" + moblie +
        "}";
    }
}

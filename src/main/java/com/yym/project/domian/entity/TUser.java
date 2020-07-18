package com.yym.project.domian.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 用户表
    */
@Data
public class TUser implements Serializable {
    /**
    * 主键id
    */
    private Integer tId;

    /**
    * 用户名
    */
    private String tUsername;

    /**
    * 用户密码
    */
    private String tPassword;

    /**
    * 注册时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 0代表未删除 1代表删除
    */
    private Integer isDel;
}
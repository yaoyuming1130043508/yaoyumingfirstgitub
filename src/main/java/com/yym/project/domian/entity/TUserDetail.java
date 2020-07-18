package com.yym.project.domian.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 会员详情表
    */
@Data
public class TUserDetail implements Serializable {
    /**
    * 会员详情id
    */
    private Integer tUid;

    /**
    * 会员性别
    */
    private String tSex;

    /**
    * 会员手机号
    */
    private String tPhone;

    /**
    * 会员邮箱
    */
    private String tEmail;

    /**
    * 注册时间
    */
    private Date createTime;

    /**
    * 0代表未删除 1代表删除
    */
    private Integer isDel;

    private Integer tTuid;
}
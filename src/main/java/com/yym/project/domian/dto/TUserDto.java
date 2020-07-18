package com.yym.project.domian.dto;

import lombok.Data;

import java.util.List;

@Data
public class TUserDto {
    private  Integer tId;
    private  String tUserName;
    private String tPassWord;
    private  String createTime;
    private  String updateTime;
    private  Integer isDel;
    private List<TUserDetail> tUserDetailList;
}

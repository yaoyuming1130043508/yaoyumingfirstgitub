package com.yym.project.mapper;

import com.yym.project.domian.entity.TUserDetail;

public interface TUserDetailMapper {
    int deleteByPrimaryKey(Integer tUid);

    int insert(TUserDetail record);

    int insertSelective(TUserDetail record);

    TUserDetail selectByPrimaryKey(Integer tUid);

    int updateByPrimaryKeySelective(TUserDetail record);

    int updateByPrimaryKey(TUserDetail record);
}
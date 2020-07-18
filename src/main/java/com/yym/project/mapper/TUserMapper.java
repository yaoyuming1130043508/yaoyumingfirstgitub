package com.yym.project.mapper;

import com.yym.project.domian.entity.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}
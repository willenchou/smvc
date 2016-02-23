package com.test.Dao;

import com.test.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long positionInt);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long positionInt);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
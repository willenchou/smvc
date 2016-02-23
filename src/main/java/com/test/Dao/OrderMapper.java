package com.test.Dao;

import com.test.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long positionInt);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long positionInt);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
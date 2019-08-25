package com.github.wxiaoqi.security.tenant.mapper;

import com.github.wxiaoqi.security.tenant.entity.Node;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Node record);

    int insertSelective(Node record);

    Node selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}
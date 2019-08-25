package com.github.wxiaoqi.security.tenant.mapper;

import com.github.wxiaoqi.security.common.util.Query;
import com.github.wxiaoqi.security.tenant.entity.Tenant;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface TenantMapper extends Mapper<Tenant> {

    List<Tenant> findList(Query query);
}
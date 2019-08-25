package com.github.wxiaoqi.security.tenant.biz;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.github.wxiaoqi.security.common.util.Query;
import com.github.wxiaoqi.security.tenant.entity.Tenant;
import com.github.wxiaoqi.security.tenant.mapper.TenantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class TenantBiz extends BaseBiz<TenantMapper, Tenant> {
    @Autowired
    private TenantMapper tenantMapper;

    public List<Tenant> findList(Query query){
        return tenantMapper.findList(query);
    }

}

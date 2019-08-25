package com.github.wxiaoqi.security.tenant.rest;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.wxiaoqi.security.common.msg.TableResultResponse;
import com.github.wxiaoqi.security.common.util.Query;
import com.github.wxiaoqi.security.tenant.biz.TenantBiz;
import com.github.wxiaoqi.security.tenant.entity.Tenant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@Slf4j
@RestController
@RequestMapping("/user")
public class TenantController {

    @Autowired
    private TenantBiz tenantBiz;

    @GetMapping(value = "/page")
    public TableResultResponse page(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        Page<Object> result = PageHelper.startPage(query.getPage(), query.getLimit());
        List<Tenant> list = tenantBiz.findList(query);
        return new TableResultResponse<Tenant>(result.getTotal(), list);
    }
}

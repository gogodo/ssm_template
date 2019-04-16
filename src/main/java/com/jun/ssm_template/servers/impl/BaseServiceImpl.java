package com.jun.ssm_template.servers.impl;

import com.jun.ssm_template.repository.common.BaseMapper;
import com.jun.ssm_template.servers.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService {

    protected abstract BaseMapper<T> getMapper();

    @Override
    public Integer insert(T record) {
        return getMapper().insert(record);
    }
}

package com.udgrp.service;

import com.udgrp.mapper.KylinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author kejw
 * @version V1.0
 * @Project phoenix-test
 * @Description: TODO
 * @date 2018/5/7
 */
@Service
public class QueryService {
    @Autowired
    private KylinMapper kylinMapper;

    public int count(int pageSize) {
        return kylinMapper.queryCount(pageSize);
    }
}

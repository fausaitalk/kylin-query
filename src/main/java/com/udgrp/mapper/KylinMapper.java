package com.udgrp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author kejw
 * @version V1.0
 * @Project kylinquery-test
 * @Description: TODO
 * @date 2018/5/16
 */
@Mapper
public interface KylinMapper {

    @Select("select count(*) from fact_traffic_accident")
    int queryCount(@Param("pageSize") int pageSize);
}

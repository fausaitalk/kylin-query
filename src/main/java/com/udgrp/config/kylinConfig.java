package com.udgrp.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author kejw
 * @version V1.0
 * @Project phoenix-test
 * @Description: TODO
 * @date 2018/5/7
 */
@Configuration
public class kylinConfig {
    @Autowired
    private Environment env;

    @Bean(name = "kylinJdbcDataSource")
    @Qualifier("kylinJdbcDataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("kylin.url"));
        dataSource.setDriverClassName(env.getProperty("kylin.driver-class-name"));
        dataSource.setUsername(env.getProperty("kylin.username"));//
        dataSource.setPassword(env.getProperty("kylin.password"));//
        dataSource.setDefaultAutoCommit(Boolean.valueOf(env.getProperty("kylin.default-auto-commit")));

        return dataSource;
    }

    @Bean(name = "kylinJdbcTemplate")
    public JdbcTemplate kylinJdbcTemplate(@Qualifier("kylinJdbcDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}

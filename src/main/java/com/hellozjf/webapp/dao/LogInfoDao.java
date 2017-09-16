package com.hellozjf.webapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LogInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}

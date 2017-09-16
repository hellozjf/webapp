package com.hellozjf.webapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.hellozjf.webapp.domain.User;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public int getIdByUsernameAndPassword(String username, String password) {
        try {
            String sql = "select id from t_user where username=? and password=?";
            int id = jdbcTemplate.queryForObject(sql, new Object[] {username, password},  Integer.class);
            return id;
        } catch (Exception e) {
            return -1;
        }
    }

    public User getUserById(int id) {
        String sql = "select * from t_user where id=?";
        User user = new User();
        jdbcTemplate.query(sql, new Object[] {id}, (rs) -> {
            user.setId(id);
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setIsAdmin(rs.getInt("isAdmin"));
        });
        return user;
    }
}

package com.hellozjf.webapp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.hellozjf.webapp.domain.User;

@Repository
public class UserDao {
    
    public static final String SQL_INSERT = "INSERT INTO t_user(id, username, password, isAdmin) VALUES(?, ?, ?, ?)";
    public static final String SQL_INSERT_WITHOUT_ID = "INSERT INTO t_user(username, password, isAdmin) VALUES(?, ?, ?)";
    public static final String SQL_DELETE = "DELETE FROM t_user WHERE id=?";
    public static final String SQL_UPDATE = "UPDATE t_user SET username=?, password=?, isAdmin=? WHERE id=?";
    public static final String SQL_QUERY_ALL = "SELECT * FROM t_user";

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
    
    public void addUser(User user) {
        Object[] params = new Object[] {user.getId(), user.getUsername(), user.getPassword(), user.getIsAdmin()};
        int[] types = new int[] {Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.INTEGER};
        jdbcTemplate.update(SQL_INSERT, params, types);
    }
    
    public int addUser(String username, String password, int isAdmin) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(conn -> {
            PreparedStatement ps = conn.prepareStatement(SQL_INSERT_WITHOUT_ID);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3, isAdmin);
            return ps;
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }
    
    public void delUser(User user) {
        Object[] params = new Object[] {user.getId()};
        int[] types = new int[] {Types.INTEGER};
        jdbcTemplate.update(SQL_DELETE, params, types);
    }
    
    public void updateUser(int id, User user) {
        Object[] params = new Object[] {user.getUsername(), user.getPassword(), user.getIsAdmin(), id};
        int[] types = new int[] {Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.INTEGER};
        jdbcTemplate.update(SQL_UPDATE, params, types);
    }
    
    public List<User> getAllUser() {
        List<User> users = new ArrayList<User>();
        jdbcTemplate.query(SQL_QUERY_ALL, (rs) -> {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setIsAdmin(rs.getInt("isAdmin"));
            users.add(user);
        });
        return users;
    }
}

package com.hellozjf.webapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Service;

import com.hellozjf.webapp.dao.LogInfoDao;
import com.hellozjf.webapp.dao.UserDao;
import com.hellozjf.webapp.domain.User;

@Service
public class UserService {
    
    public Log log = LogFactory.getLog(this.getClass());

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private LogInfoDao logInfoDao;
    
    @Autowired
    private MySQLMaxValueIncrementer incre;
    
    public int login(String username, String password) {
        return userDao.getIdByUsernameAndPassword(username, password);
    }
    
    public User getUserById(int id) {
       return userDao.getUserById(id);
    }
    
    public void addUser(User user) {
        userDao.addUser(user);
    }
    
    public User addUser(String username, String password, int isAdmin) {
        User user = new User();
        user.setId(incre.nextIntValue());
        user.setUsername(username);
        user.setPassword(password);
        user.setIsAdmin(isAdmin);
        userDao.addUser(user);
        return user;
    }
}

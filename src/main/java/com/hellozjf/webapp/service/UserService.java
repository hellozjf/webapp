package com.hellozjf.webapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    public int login(String username, String password) {
        return userDao.getIdByUsernameAndPassword(username, password);
    }
    
    public User getUserById(int id) {
       return userDao.getUserById(id);
    }
}

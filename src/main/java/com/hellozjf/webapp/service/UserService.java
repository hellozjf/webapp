package com.hellozjf.webapp.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Service;

import com.hellozjf.webapp.dao.LogInfoDao;
import com.hellozjf.webapp.dao.TLoginfoMapper;
import com.hellozjf.webapp.dao.TUserMapper;
import com.hellozjf.webapp.dao.UserDao;
import com.hellozjf.webapp.domain.TLoginfo;
import com.hellozjf.webapp.domain.TUser;
import com.hellozjf.webapp.domain.TUserExample;
import com.hellozjf.webapp.domain.User;

@Service
public class UserService {
    
    public Log log = LogFactory.getLog(this.getClass());

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private LogInfoDao logInfoDao;
    
    @Autowired
    private TUserMapper tUserMapper;
    
    @Autowired
    private TLoginfoMapper tLogInfo;
    
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
    
    public TUser addTUser(String username, String password, int isAdmin) {
        TUser tUser = new TUser();
        tUser.setId(incre.nextIntValue());
        tUser.setUsername(username);
        tUser.setPassword(password);
        tUser.setIsadmin(isAdmin);
        tUserMapper.insert(tUser);
        return tUser;
    }
    
    public List<TUser> getTUsersBetween2And20() {
        TUserExample tUserExample = new TUserExample();
        tUserExample.or().andIdBetween(2, 20);
        List<TUser> tUsers = tUserMapper.selectByExample(tUserExample);
        return tUsers;
    }
}

package com.hellozjf.webapp.service;

import static org.testng.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hellozjf.webapp.domain.User;

@ContextConfiguration("classpath*:/webapp-context.xml")
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private UserService userService;
    
    @Test
    public void loginSuccess() {
        String username = "root";
        String password = "123456";
        assertTrue(userService.login(username, password) > 0);
    }
    
    @Test
    public void loginFail() {
        String username = "root";
        String password = "11111";
        assertTrue(userService.login(username, password) < 0);
    }
    
    @Test
    @Rollback(false)
    public void testAddUser() {
        User user = new User();
        user.setId(2);
        user.setUsername("zjf");
        user.setPassword("123456");
        user.setIsAdmin(0);
        userService.addUser(user);
    }
    
    @Test
    @Rollback(false)
    public void testAddUserWithoutId() {
        String username = "zjf";
        String password = "123456";
        int isAdmin = 0;
        userService.addUser(username, password, isAdmin);
    }
    
    @Test
    @Rollback(false)
    public void testAddTUserWithoutId() {
        String username = "hellozjf";
        String password = "654321";
        int isAdmin = 1;
        userService.addTUser(username, password, isAdmin);
    }
}

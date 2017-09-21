package com.hellozjf.webapp.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hellozjf.webapp.domain.TUser;
import com.hellozjf.webapp.domain.User;

@ContextConfiguration("classpath*:/webapp-context.xml")
@Rollback(false)
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
    public void testAddUser() {
        User user = new User();
        user.setId(2);
        user.setUsername("zjf");
        user.setPassword("123456");
        user.setIsAdmin(0);
        userService.addUser(user);
    }
    
    @Test
    public void testAddUserWithoutId() {
        String username = "zjf";
        String password = "123456";
        int isAdmin = 0;
        userService.addUser(username, password, isAdmin);
    }
    
    @Test
    public void testAddTUserWithoutId() {
        String username = "hellozjf";
        String password = "654321";
        int isAdmin = 1;
        userService.addTUser(username, password, isAdmin);
    }
    
    @Test
    public void testGetTUserBetween2And20() {
        List<TUser> tUsers = userService.getTUsersBetween2And20();
        assertEquals(tUsers.size(), 2);
    }
}

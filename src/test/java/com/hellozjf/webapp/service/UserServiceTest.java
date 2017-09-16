package com.hellozjf.webapp.service;

import static org.testng.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}

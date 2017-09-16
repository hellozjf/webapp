package com.hellozjf.webapp.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hellozjf.webapp.domain.User;
import com.hellozjf.webapp.service.UserService;
import com.hellozjf.webapp.view.LoginCommand;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/index.html")
    public ModelAndView loginPage() {
        return new ModelAndView("login");
    }
    
    @RequestMapping(value="/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        int id = userService.login(loginCommand.getUsername(), loginCommand.getPassword());
        if (id < 0) {
            return new ModelAndView("login", "error", "用户名或密码错误！");
        } else {
            User user = userService.getUserById(id);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }
}

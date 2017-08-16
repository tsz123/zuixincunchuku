package com.czbank.stscreditcard.controller;

import com.czbank.stscreditcard.service.UserService;
import com.czbank.stscreditcard.service.UserServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by syx on 2017/7/22.
 */
@RestController
public class LoginController {

    @Autowired
    UserServiceLogin userServiceLogin;

    @RequestMapping(path = {"/login/"}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int login(@RequestParam("login_name") String login_name, @RequestParam("pwd") String pwd) {
        Map<String, Object> map = userServiceLogin.login(login_name, pwd);
        if (!map.containsKey("user_id"))
            return 0;
        else return Integer.parseInt(map.get("user_id").toString());
    }
}

package com.czbank.stscreditcard.service;



import com.czbank.stscreditcard.dao.UserDao;
import com.czbank.stscreditcard.po.LoginUser;
import com.czbank.stscreditcard.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserServiceLogin {
    @Autowired
    private UserDao userDao;

    public Map<String, Object> login(String login_name, String pwd) {
        Map<String, Object> map = new HashMap<String, Object>();
        /*if (StringUtils.isBlank(login_name)) {
            map.put("msgname", "用户名不能为空");
            return map;
        }

        if (StringUtils.isBlank(pwd)) {
            map.put("msgpwd", "密码不能为空");
            return map;
        }*/
        LoginUser loginUser = userDao.selectByLoginName(login_name);
        if (loginUser == null) {
            map.put("msgname", "用户名不存在");
            return map;
        }

        if (!pwd.equals(loginUser.getPwd())) {
            map.put("msgpwd", "密码不正确");
            return map;
        }

        map.put("user_id", loginUser.getUser_id());
        return map;
    }

    public int addUser(User user) {
        return userDao.addUser(user.getUser_id(), user.getUser_name(), user.getAge(), user.getSex(), user.getPhone(),
                user.getAddress(), user.getID_number(), user.getUrl1(), user.getUrl2(), user.getDebt(),
                user.getIncome(), user.getGuaranteer(), user.getGuaranteer_phone(), user.getEmail());
    }

    public User getById(int user_id) {
        return userDao.getUser_id(user_id);
    }

}

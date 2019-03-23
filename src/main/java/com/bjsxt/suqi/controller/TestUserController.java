package com.bjsxt.suqi.controller;

import com.bjsxt.suqi.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suqi
 * 控制类demo
 */
@RestController
public class TestUserController {
    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUserAll(){
        User user = new User();
        user.setId(1);
        user.setUname("suqi");
        user.setAge(22);
        return user;
    }

}

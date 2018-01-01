package com.ziroom.contract.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/28.
 */
@RestController
@RequestMapping("/user")
public class GetUserController {

    @RequestMapping("/getUser")
    public Map<String, String> getUser() {
        Map<String, String> user = new HashMap<>();
        user.put("ming","123456");
        return user;
    }

}

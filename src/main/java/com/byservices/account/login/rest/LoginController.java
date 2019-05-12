package com.byservices.account.login.rest;

import com.byservices.account.login.dto.LoginDetails;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginDetails loginDetails) {
        if (StringUtils.equalsIgnoreCase(loginDetails.getUserName(), "username@emaildomain.com") &&
                StringUtils.equalsIgnoreCase(loginDetails.getPassword(), "Password$$$")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}

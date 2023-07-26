package com.springboot.demosecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/loginPage")
    public String showLoginPage(){
        return "fancy-login";
    }
    @GetMapping("/accessDeniedPage")
    public String accessDenied(){
        return "access-denied";
    }

}

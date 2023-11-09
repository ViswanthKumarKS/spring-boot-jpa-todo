package com.codewithViswanth.springbootjpa.Controller;

import com.codewithViswanth.springbootjpa.model.AppUser;
import com.codewithViswanth.springbootjpa.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping("/login")
    private AppUser login(@RequestBody AppUser appUser) {
        return appUserService.login(appUser);
    }

    @PostMapping("/register")
    private AppUser register(@RequestBody AppUser appUser) {
        return appUserService.register(appUser);
    }

}

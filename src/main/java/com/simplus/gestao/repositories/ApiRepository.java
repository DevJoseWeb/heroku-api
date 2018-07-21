package com.simplus.gestao.repositories;

import com.simplus.gestao.domain.User;
import com.simplus.gestao.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ApiRepository {
    @Autowired
    private UserService userService;

    /**
     * Handle request to the default page
     */
    @GetMapping("/")
    public List<User> viewHome() {

        return userService.findAllUsers();
    }


}
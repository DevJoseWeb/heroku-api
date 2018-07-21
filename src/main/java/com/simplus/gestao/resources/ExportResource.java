package com.simplus.gestao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplus.gestao.services.UserService;

public class ExportResource {
    @Autowired
    private UserService userService;

    /**
     * Handle request to download an Excel document
     */
    @GetMapping("/download")
    public String download(Model model) {

        model.addAttribute("users", userService.findAllUsers());
        return "";
    }


}
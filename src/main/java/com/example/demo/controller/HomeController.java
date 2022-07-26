package com.example.demo.controller;

import com.example.demo.model.BaseModel;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private UsersService usersService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public BaseModel index(){
        return new BaseModel(true,null,usersService.selectAll());
    }
}

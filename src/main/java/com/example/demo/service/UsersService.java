package com.example.demo.service;

import com.example.demo.dao.UsersDAO;
import com.example.demo.model.UsersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersService {
    @Autowired
    private UsersDAO usersDAO;

    public List<UsersModel> selectAll(){
        return usersDAO.selectAll();
    }

}

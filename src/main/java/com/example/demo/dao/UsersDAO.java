package com.example.demo.dao;

import com.example.demo.model.UsersModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersDAO {

    /**
     * 重新users表中的所有数据
     *
     * @return 返回查看到的数据
     */
    @Select("select * from users")
    List<UsersModel> selectAll();
}

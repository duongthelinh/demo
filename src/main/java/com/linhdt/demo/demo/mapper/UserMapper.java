package com.linhdt.demo.demo.mapper;

import com.linhdt.demo.demo.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * Created by linhdt on 13/07/2018.
 */
@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<Users> findAll() ;

    @Insert("INSERT INTO USERS(name,salary) VALUES (#{name},#{salary})")
    @SelectKey(statement = "SELECT 1",keyProperty = "id",before = false,resultType = Integer.class)
    void insert(Users users) ;
}

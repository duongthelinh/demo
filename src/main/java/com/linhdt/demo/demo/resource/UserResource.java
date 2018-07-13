package com.linhdt.demo.demo.resource;

import com.linhdt.demo.demo.mapper.UserMapper;
import com.linhdt.demo.demo.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by linhdt on 13/07/2018.
 */
@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UserMapper userMapper;
    public UserResource (UserMapper userMapper){
        this.userMapper = userMapper;
    }


    @GetMapping("/all")
    public List<Users> getAll(){
        return userMapper.findAll();

    }

    @GetMapping("/update")
    public List<Users> update(){
        Users users = new Users();
        users.setName("Youtube");
        users.setSalary("1232132");
        userMapper.insert(users);
        return userMapper.findAll();

    }
}

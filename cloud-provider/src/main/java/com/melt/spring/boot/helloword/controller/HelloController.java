package com.melt.spring.boot.helloword.controller;

import com.melt.spring.boot.helloword.entity.User;
import com.melt.spring.boot.helloword.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author melt
 * @create 2018/4/9 15:10
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService ;

    @GetMapping("/hello/{name}")
    public String print(@PathVariable String name){

        return "Hello " + name ;
    }

    @GetMapping("/getUserById/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
        System.out.println("dev...");
        return userService.getUserById(id) ;
    }

    @PostMapping("/postUser")
    public User post(@RequestBody User user){
        System.out.println(user.getName());
        return user ;
    }
}

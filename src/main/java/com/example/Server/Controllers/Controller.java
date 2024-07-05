package com.example.Server.Controllers;

import com.example.Server.Models.User;
import com.example.Server.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements IController {
    @Autowired
    private UsersService usersService;


    @GetMapping("/Hello")
    public String hello() {
        return "HELLO WELCOME TO OUR SERVER OR API WHATEVER YOU WANT TO CALL IT!!!";
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, produces = "application/json")
    public Iterable<User> getAllUsers() {
        return usersService.getAllStudents();
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST, produces = "application/json")
    public User saveUser(User user) {
        return usersService.addSUser(user);
    }

    @RequestMapping(value = "/upDate/{id}",method = RequestMethod.POST,produces = "application/json")
    public User upDateUsers(Integer id, User user) {
        return usersService.upDateUsers(id,user);
    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE,produces ="application/json" )
    public User deleteUser(Integer id) {
        return usersService.deleteUsers(id);
    }

}

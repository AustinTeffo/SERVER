package com.example.Server.Controllers;

import com.example.Server.Models.User;
import org.springframework.web.bind.annotation.*;

public interface IController {
    @RequestMapping(value = "/Hello",method = RequestMethod.GET, produces = "application/json")
    String hello();

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, produces = "application/json")
    Iterable<User> getAllUsers();

    @RequestMapping(value = "/addUser",method = RequestMethod.POST, produces = "application/json")
    User saveUser(@RequestBody User user);

    @RequestMapping(value = "/upDate/{id}",method = RequestMethod.POST,produces = "application/json")
    User upDateUsers(@PathVariable Integer id, @RequestBody User user);

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE,produces ="application/json" )
    User deleteUser(@PathVariable Integer id);


}

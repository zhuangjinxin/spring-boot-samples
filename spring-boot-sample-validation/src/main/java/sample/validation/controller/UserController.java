package sample.validation.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.validation.bean.User;

@RestController
public class UserController {

    @RequestMapping("/user")
    public User userLogin(@RequestBody User user){
        return user;
    }

}

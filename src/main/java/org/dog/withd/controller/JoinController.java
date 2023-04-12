package org.dog.withd.controller;

import org.dog.withd.dao.UserDao;
import org.dog.withd.dao.UserDaoImp;
import org.dog.withd.dto.UserDto;
import org.dog.withd.service.UserService;
import org.dog.withd.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class JoinController {
    @Autowired
    UserServiceImp userService;

    //    @GetMapping("/join")
//    @GetMapping("/join")
//    public String main() {
//        return "joinForm";
//    }

//    private static final Logger
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String home(Model model) {
     return "/main";
    }
    @GetMapping("/login")
    public String loginform() {
        return "/login";
    }

    @PostMapping("/join")
    public String join(UserDto userDto) {
        if (userService.join(userDto)) {
            return "redirect:/main";//성공
        } else {
            return "/login";
        }
    }

}

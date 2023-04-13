package org.dog.withd.controller;

import org.dog.withd.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String home(Model model) {
     return "/main";
    }
    @GetMapping("/login")
    public String loginform() {
        return "/login";
    }


}

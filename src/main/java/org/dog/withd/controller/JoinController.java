package org.dog.withd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {


    //    @GetMapping("/join")
    @GetMapping("/join")
    public String main() {
        return "joinForm";
    }
}

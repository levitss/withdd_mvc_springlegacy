package org.dog.withd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping({"/", "/main"})
    public String main() {
        return "/main";
    }

    @RequestMapping("/dangoffice")
    public String dangOffice() {
        return "/dangoffice";
    }
    @RequestMapping("/buy")
    public String buy() {
        return "/buy";
    }
    @RequestMapping("/chat")
    public String chat() {
        return "/chat";
    }
    @RequestMapping("/dangcare")
    public String dangcare() {
        return "/dangcare";
    }
    @RequestMapping("/dangcomu")
    public String dangcomu() {
        return "/dangcomu";
    }
    @RequestMapping("/dangguen")
    public String dangguen() {
        return "/dangguen";
    }





}

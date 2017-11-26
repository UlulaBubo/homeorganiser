package com.bnb.homeorganiser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = { "/", "/index", "/home" }, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = { "/todo" }, method = RequestMethod.GET)
    public String todo() {
        return "coming_soon";
    }

    @RequestMapping(value = { "/template" }, method = RequestMethod.GET)
    public String template() {
        return "template_page";
    }

}

package com.bnb.homeorganiser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LinksController {

    @RequestMapping(value = { "/links" }, method = RequestMethod.GET)
    public String links() {
        return "links";
    }

    @RequestMapping(value = { "/addNewLink" }, method = RequestMethod.POST)
    public String addNewLink() {
        // TODO logic to save new link
        return "links";
    }

}

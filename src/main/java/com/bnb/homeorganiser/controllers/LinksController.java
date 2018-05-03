package com.bnb.homeorganiser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bnb.homeorganiser.model.Link;
import com.bnb.homeorganiser.repository.LinkRepository;

@Controller
public class LinksController {

    @Autowired
    private LinkRepository linkRepository;

    @RequestMapping(value = { "/links" }, method = RequestMethod.GET)
    public String links() {
        System.out.println("repository autowired = " + (linkRepository != null));
        linkRepository.save(new Link("Dupa", "Dupa"));
        Iterable<Link> findAll = linkRepository.findAll();
        System.out.println(findAll);
        return "links";
    }

    @RequestMapping(value = { "/addNewLink" }, method = RequestMethod.POST)
    public String addNewLink() {
        // TODO logic to save new link
        return "links";
    }

}

package com.bnb.homeorganiser.controllers;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

public class LinksControllerTest extends AbstractControllerTest {

    @Test
    public void showLinksPage() throws Exception {
        mockMvc.perform(get("/links")).andExpect(status().isOk());
    }

    @Test
    public void saveNewLink() throws Exception {
        mockMvc.perform(post("/addNewLink")).andExpect(status().isOk());
        fail("test logic");
    }

}

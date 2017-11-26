package com.bnb.homeorganiser.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

public class IndexControllerTest extends AbstractControllerTest {

    @Test
    public void showRootPage() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
    }

    @Test
    public void showIndexPage() throws Exception {
        mockMvc.perform(get("/index")).andExpect(status().isOk());
    }

    @Test
    public void showHomePage() throws Exception {
        mockMvc.perform(get("/home")).andExpect(status().isOk());
    }

    @Test
    public void showUnderConstructionPage() throws Exception {
        mockMvc.perform(get("/todo")).andExpect(status().isOk());
    }

}

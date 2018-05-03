package com.bnb.homeorganiser.controllers;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.bnb.homeorganiser.HomeOrganiserApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { HomeOrganiserApplication.class })
@WebAppConfiguration
public abstract class AbstractControllerTest {

    @Autowired
    private WebApplicationContext context;

    protected MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

}
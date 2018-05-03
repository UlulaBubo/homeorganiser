package com.bnb.homeorganiser.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LinkTest {

    @Test
    void testEquals() {
        Link l1 = new Link();
        l1.setUrl("url");
        l1.setDesc("desc");

        Link l2 = new Link("url", "desc");

        assertTrue(l1.equals(l2));
        assertTrue(l2.equals(l1));
    }

    @Test
    @Disabled
    void testToString() {
        Link l = new Link("url", "desc");

        String result = l.toString();

        assertNotNull(result);
    }

}

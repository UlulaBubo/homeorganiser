package com.bnb.homeorganiser.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class LinkRepositoryTest {

    @Autowired
    private LinkRepository linkRepository;

    @Test
    @Disabled
    void testFindByUrl() {
        System.out.println("repository autowired = " + (linkRepository != null));
        assertNotNull(linkRepository);
        fail("Not yet implemented");
    }

}

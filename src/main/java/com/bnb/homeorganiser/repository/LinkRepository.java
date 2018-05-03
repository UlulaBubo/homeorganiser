package com.bnb.homeorganiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bnb.homeorganiser.model.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {

    public Link findByUrl(String url);

}

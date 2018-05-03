package com.bnb.homeorganiser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "links")
@Data
public class Link {

    @Id
    @GeneratedValue
    private Long id;

    private String url;

    private String desc;

    protected Link() {
        // NOP
    }

    public Link(String url, String desc) {
        this.url = url;
        this.desc = desc;
    }

}

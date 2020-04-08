package com.github.ramannbg.maprdbspringdatasample.model;

import com.mapr.springframework.data.maprdb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class User {
    private String id;
    private String name;
    private String mail;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
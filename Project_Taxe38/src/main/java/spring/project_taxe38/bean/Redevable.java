package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Redevable {


    @Id
    private Long id;
    private String code ;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}


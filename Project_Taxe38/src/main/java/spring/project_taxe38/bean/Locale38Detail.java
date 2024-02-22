package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Locale38Detail {
    @Id
    private long id;
    private String typeLocale38Detail;
    private  double superficie;
    private boolean active;

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeLocale38Detail() {
        return typeLocale38Detail;
    }

    public void setTypeLocale38Detail(String typeLocale38Detail) {
        this.typeLocale38Detail = typeLocale38Detail;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

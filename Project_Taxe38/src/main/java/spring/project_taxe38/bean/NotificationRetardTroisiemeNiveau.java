package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class NotificationRetardTroisiemeNiveau {
    @Id
    private Long id;
    @ManyToOne
    private Locale locale;
    @ManyToOne
    private Redevable redevable;
    private  int anne;
    private double trim;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

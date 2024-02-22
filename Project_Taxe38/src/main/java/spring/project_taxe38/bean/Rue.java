package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Rue {
    @Id
    private long id;
    private String libelle;
   @ManyToOne
   Quartie quartie;
    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Quartie getQuartie() {
        return quartie;
    }

    public void setQuartie(Quartie quartie) {
        this.quartie = quartie;
    }
}
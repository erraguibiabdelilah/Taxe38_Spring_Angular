package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Locale {
    @Id
    private long id;
    private String ref;

    private  String complementAdressse;
    private String CategorieLocale;

    @ManyToOne
    private Rue rue ;


    public void setId(long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getComplementAdressse() {
        return complementAdressse;
    }

    public void setComplementAdressse(String complementAdressse) {
        this.complementAdressse = complementAdressse;
    }

    public String getCategorieLocale() {
        return CategorieLocale;
    }

    public void setCategorieLocale(String categorieLocale) {
        CategorieLocale = categorieLocale;
    }

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

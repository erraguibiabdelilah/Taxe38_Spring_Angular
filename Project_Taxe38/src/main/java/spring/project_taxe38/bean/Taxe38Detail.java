package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Taxe38Detail {
    @Id
    private Long id;
    @ManyToOne
    private Locale38Detail locale38Detail;
    private double montantBase;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;

    public Locale38Detail getLocale38Detail() {
        return locale38Detail;
    }

    public void setLocale38Detail(Locale38Detail locale38Detail) {
        this.locale38Detail = locale38Detail;
    }




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }

    public double getMontantRetardPremierMois() {
        return montantRetardPremierMois;
    }

    public void setMontantRetardPremierMois(double montantRetardPremierMois) {
        this.montantRetardPremierMois = montantRetardPremierMois;
    }

    public double getMontantRetardAutreMois() {
        return montantRetardAutreMois;
    }

    public void setMontantRetardAutreMois(double montantRetardAutreMois) {
        this.montantRetardAutreMois = montantRetardAutreMois;
    }
}

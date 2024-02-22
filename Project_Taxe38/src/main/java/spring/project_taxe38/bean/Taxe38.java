package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;
@Entity
public class Taxe38 {
    @Id
    private Long id;
    @ManyToOne
    private  Redevable redevable;
    @ManyToOne
    private TauxTaxe38 tauxTaxe38;
    @ManyToOne
    private  Locale locale;
    private double trim;
    private Date  datePresentation;
    private  int nombreMoisRetard;
    private  double montantBase;
    private double montantRetardPremierMois;
    private  double montantTotal;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }






    public double getTrim() {
        return trim;
    }

    public void setTrim(double trim) {
        this.trim = trim;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public double getNombreMoisRetard() {
        return nombreMoisRetard;
    }

    public void setNombreMoisRetard(int nombreMoisRetard) {
        this.nombreMoisRetard = nombreMoisRetard;
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

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public TauxTaxe38 getTauxTaxe38() {
        return tauxTaxe38;
    }

    public void setTauxTaxe38(TauxTaxe38 tauxTaxe38) {
        this.tauxTaxe38 = tauxTaxe38;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}

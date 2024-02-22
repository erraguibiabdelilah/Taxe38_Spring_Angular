package com.example.spring_project_taxe38.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class TauxTaxe38 {
    @Id
    private Long id;
    private String CategorieLocale ;
    private double montantParMetreCarre;
    private Date dateMin;
    private Date dateMax;
    private double  pourcentagePremierRetard;
    private double pourcentageAutreMoisRetard;

    public String getCategorieLocale() {
        return CategorieLocale;
    }

    public void setCategorieLocale(String categorieLocale) {
        CategorieLocale = categorieLocale;
    }

    public double getMontantParMetreCarre() {
        return montantParMetreCarre;
    }

    public void setMontantParMetreCarre(double montantParMetreCarre) {
        this.montantParMetreCarre = montantParMetreCarre;
    }

    public Date getDateMin() {
        return dateMin;
    }

    public void setDateMin(Date dateMin) {
        this.dateMin = dateMin;
    }

    public Date getDateMax() {
        return dateMax;
    }

    public void setDateMax(Date dateMax) {
        this.dateMax = dateMax;
    }

    public double getPourcentagePremierRetard() {
        return pourcentagePremierRetard;
    }

    public void setPourcentagePremierRetard(double pourcentagePremierRetard) {
        this.pourcentagePremierRetard = pourcentagePremierRetard;
    }

    public double getPourcentageAutreMoisRetard() {
        return pourcentageAutreMoisRetard;
    }

    public void setPourcentageAutreMoisRetard(double pourcentageAutreMoisRetard) {
        this.pourcentageAutreMoisRetard = pourcentageAutreMoisRetard;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

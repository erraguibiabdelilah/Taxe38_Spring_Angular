package  ma.zs.univ.dao.criteria.core.taxe38Bean;


import ma.zs.univ.dao.criteria.core.communBean.LocaleCriteria;
import ma.zs.univ.dao.criteria.core.communBean.RedevableCriteria;

import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;

public class Taxe38Criteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String anne;
    private String anneMin;
    private String anneMax;
    private String trim;
    private String trimMin;
    private String trimMax;
    private LocalDate datePresentaion;
    private LocalDate datePresentaionFrom;
    private LocalDate datePresentaionTo;
    private String nombreMoisRetard;
    private String nombreMoisRetardMin;
    private String nombreMoisRetardMax;
    private String montantBase;
    private String montantBaseMin;
    private String montantBaseMax;
    private String montantRetardPremeirMois;
    private String montantRetardPremeirMoisMin;
    private String montantRetardPremeirMoisMax;
    private String montantTotal;
    private String montantTotalMin;
    private String montantTotalMax;

    private RedevableCriteria redevable ;
    private List<RedevableCriteria> redevables ;
    private LocaleCriteria locale ;
    private List<LocaleCriteria> locales ;


    public Taxe38Criteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getAnne(){
        return this.anne;
    }
    public void setAnne(String anne){
        this.anne = anne;
    }   
    public String getAnneMin(){
        return this.anneMin;
    }
    public void setAnneMin(String anneMin){
        this.anneMin = anneMin;
    }
    public String getAnneMax(){
        return this.anneMax;
    }
    public void setAnneMax(String anneMax){
        this.anneMax = anneMax;
    }
      
    public String getTrim(){
        return this.trim;
    }
    public void setTrim(String trim){
        this.trim = trim;
    }   
    public String getTrimMin(){
        return this.trimMin;
    }
    public void setTrimMin(String trimMin){
        this.trimMin = trimMin;
    }
    public String getTrimMax(){
        return this.trimMax;
    }
    public void setTrimMax(String trimMax){
        this.trimMax = trimMax;
    }
      
    public LocalDate getDatePresentaion(){
        return this.datePresentaion;
    }
    public void setDatePresentaion(LocalDate datePresentaion){
        this.datePresentaion = datePresentaion;
    }
    public LocalDate getDatePresentaionFrom(){
        return this.datePresentaionFrom;
    }
    public void setDatePresentaionFrom(LocalDate datePresentaionFrom){
        this.datePresentaionFrom = datePresentaionFrom;
    }
    public LocalDate getDatePresentaionTo(){
        return this.datePresentaionTo;
    }
    public void setDatePresentaionTo(LocalDate datePresentaionTo){
        this.datePresentaionTo = datePresentaionTo;
    }
    public String getNombreMoisRetard(){
        return this.nombreMoisRetard;
    }
    public void setNombreMoisRetard(String nombreMoisRetard){
        this.nombreMoisRetard = nombreMoisRetard;
    }   
    public String getNombreMoisRetardMin(){
        return this.nombreMoisRetardMin;
    }
    public void setNombreMoisRetardMin(String nombreMoisRetardMin){
        this.nombreMoisRetardMin = nombreMoisRetardMin;
    }
    public String getNombreMoisRetardMax(){
        return this.nombreMoisRetardMax;
    }
    public void setNombreMoisRetardMax(String nombreMoisRetardMax){
        this.nombreMoisRetardMax = nombreMoisRetardMax;
    }
      
    public String getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(String montantBase){
        this.montantBase = montantBase;
    }   
    public String getMontantBaseMin(){
        return this.montantBaseMin;
    }
    public void setMontantBaseMin(String montantBaseMin){
        this.montantBaseMin = montantBaseMin;
    }
    public String getMontantBaseMax(){
        return this.montantBaseMax;
    }
    public void setMontantBaseMax(String montantBaseMax){
        this.montantBaseMax = montantBaseMax;
    }
      
    public String getMontantRetardPremeirMois(){
        return this.montantRetardPremeirMois;
    }
    public void setMontantRetardPremeirMois(String montantRetardPremeirMois){
        this.montantRetardPremeirMois = montantRetardPremeirMois;
    }   
    public String getMontantRetardPremeirMoisMin(){
        return this.montantRetardPremeirMoisMin;
    }
    public void setMontantRetardPremeirMoisMin(String montantRetardPremeirMoisMin){
        this.montantRetardPremeirMoisMin = montantRetardPremeirMoisMin;
    }
    public String getMontantRetardPremeirMoisMax(){
        return this.montantRetardPremeirMoisMax;
    }
    public void setMontantRetardPremeirMoisMax(String montantRetardPremeirMoisMax){
        this.montantRetardPremeirMoisMax = montantRetardPremeirMoisMax;
    }
      
    public String getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(String montantTotal){
        this.montantTotal = montantTotal;
    }   
    public String getMontantTotalMin(){
        return this.montantTotalMin;
    }
    public void setMontantTotalMin(String montantTotalMin){
        this.montantTotalMin = montantTotalMin;
    }
    public String getMontantTotalMax(){
        return this.montantTotalMax;
    }
    public void setMontantTotalMax(String montantTotalMax){
        this.montantTotalMax = montantTotalMax;
    }
      

    public RedevableCriteria getRedevable(){
        return this.redevable;
    }

    public void setRedevable(RedevableCriteria redevable){
        this.redevable = redevable;
    }
    public List<RedevableCriteria> getRedevables(){
        return this.redevables;
    }

    public void setRedevables(List<RedevableCriteria> redevables){
        this.redevables = redevables;
    }
    public LocaleCriteria getLocale(){
        return this.locale;
    }

    public void setLocale(LocaleCriteria locale){
        this.locale = locale;
    }
    public List<LocaleCriteria> getLocales(){
        return this.locales;
    }

    public void setLocales(List<LocaleCriteria> locales){
        this.locales = locales;
    }
}

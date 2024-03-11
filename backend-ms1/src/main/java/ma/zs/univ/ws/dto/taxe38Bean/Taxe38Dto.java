package  ma.zs.univ.ws.dto.taxe38Bean;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


import ma.zs.univ.ws.dto.communBean.LocaleDto;
import ma.zs.univ.ws.dto.communBean.RedevableDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Taxe38Dto  extends AuditBaseDto {

    private String code  ;
    private Integer anne  = 0 ;
    private Integer trim  = 0 ;
    private LocalDate datePresentaion  ;
    private Integer nombreMoisRetard  = 0 ;
    private BigDecimal montantBase  ;
    private BigDecimal montantRetardPremeirMois  ;
    private BigDecimal montantTotal  ;

    private RedevableDto redevable ;
    private LocaleDto locale ;



    public Taxe38Dto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public Integer getAnne(){
        return this.anne;
    }
    public void setAnne(Integer anne){
        this.anne = anne;
    }

    @Log
    public Integer getTrim(){
        return this.trim;
    }
    public void setTrim(Integer trim){
        this.trim = trim;
    }

    @Log
    public LocalDate getDatePresentaion(){
        return this.datePresentaion;
    }
    public void setDatePresentaion(LocalDate datePresentaion){
        this.datePresentaion = datePresentaion;
    }

    @Log
    public Integer getNombreMoisRetard(){
        return this.nombreMoisRetard;
    }
    public void setNombreMoisRetard(Integer nombreMoisRetard){
        this.nombreMoisRetard = nombreMoisRetard;
    }

    @Log
    public BigDecimal getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(BigDecimal montantBase){
        this.montantBase = montantBase;
    }

    @Log
    public BigDecimal getMontantRetardPremeirMois(){
        return this.montantRetardPremeirMois;
    }
    public void setMontantRetardPremeirMois(BigDecimal montantRetardPremeirMois){
        this.montantRetardPremeirMois = montantRetardPremeirMois;
    }

    @Log
    public BigDecimal getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(BigDecimal montantTotal){
        this.montantTotal = montantTotal;
    }


    public RedevableDto getRedevable(){
        return this.redevable;
    }

    public void setRedevable(RedevableDto redevable){
        this.redevable = redevable;
    }
    public LocaleDto getLocale(){
        return this.locale;
    }

    public void setLocale(LocaleDto locale){
        this.locale = locale;
    }






}

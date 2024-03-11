package ma.zs.univ.bean.core.taxe38Bean;

import java.util.Objects;


import java.time.LocalDate;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.univ.bean.core.communBean.Locale;
import ma.zs.univ.bean.core.communBean.Redevable;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taxe38")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taxe38_seq",sequenceName="taxe38_seq",allocationSize=1, initialValue = 1)
public class Taxe38   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private Integer anne = 0;
    private Integer trim = 0;
    private LocalDate datePresentaion ;
    private Integer nombreMoisRetard = 0;
    private BigDecimal montantBase = BigDecimal.ZERO;
    private BigDecimal montantRetardPremeirMois = BigDecimal.ZERO;
    private BigDecimal montantTotal = BigDecimal.ZERO;

    private Redevable redevable ;
    private Locale locale ;


    public Taxe38(){
        super();
    }

    public Taxe38(Long id){
        this.id = id;
    }

    public Taxe38(Long id,String code){
        this.id = id;
        this.code = code ;
    }
    public Taxe38(String code){
        this.code = code ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taxe38_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "redevable")
    public Redevable getRedevable(){
        return this.redevable;
    }
    public void setRedevable(Redevable redevable){
        this.redevable = redevable;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locale")
    public Locale getLocale(){
        return this.locale;
    }
    public void setLocale(Locale locale){
        this.locale = locale;
    }
    public Integer getAnne(){
        return this.anne;
    }
    public void setAnne(Integer anne){
        this.anne = anne;
    }
    public Integer getTrim(){
        return this.trim;
    }
    public void setTrim(Integer trim){
        this.trim = trim;
    }
    public LocalDate getDatePresentaion(){
        return this.datePresentaion;
    }
    public void setDatePresentaion(LocalDate datePresentaion){
        this.datePresentaion = datePresentaion;
    }
    public Integer getNombreMoisRetard(){
        return this.nombreMoisRetard;
    }
    public void setNombreMoisRetard(Integer nombreMoisRetard){
        this.nombreMoisRetard = nombreMoisRetard;
    }
    public BigDecimal getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(BigDecimal montantBase){
        this.montantBase = montantBase;
    }
    public BigDecimal getMontantRetardPremeirMois(){
        return this.montantRetardPremeirMois;
    }
    public void setMontantRetardPremeirMois(BigDecimal montantRetardPremeirMois){
        this.montantRetardPremeirMois = montantRetardPremeirMois;
    }
    public BigDecimal getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(BigDecimal montantTotal){
        this.montantTotal = montantTotal;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxe38 taxe38 = (Taxe38) o;
        return id != null && id.equals(taxe38.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


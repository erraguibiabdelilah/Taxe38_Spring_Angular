package  ma.zs.univ.ws.converter.taxe38Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.communBean.LocaleConverter;
import ma.zs.univ.ws.converter.communBean.RedevableConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import ma.zs.univ.ws.dto.taxe38Bean.Taxe38Dto;

@Component
public class Taxe38Converter extends AbstractConverter<Taxe38, Taxe38Dto> {

    @Autowired
    private LocaleConverter localeConverter ;
    @Autowired
    private RedevableConverter redevableConverter ;
    private boolean redevable;
    private boolean locale;

    public  Taxe38Converter() {
        super(Taxe38.class, Taxe38Dto.class);
        init(true);
    }

    @Override
    public Taxe38 toItem(Taxe38Dto dto) {
        if (dto == null) {
            return null;
        } else {
        Taxe38 item = new Taxe38();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getAnne()))
                item.setAnne(dto.getAnne());
            if(StringUtil.isNotEmpty(dto.getTrim()))
                item.setTrim(dto.getTrim());
            if(StringUtil.isNotEmpty(dto.getDatePresentaion()))
                item.setDatePresentaion(dto.getDatePresentaion());
            if(StringUtil.isNotEmpty(dto.getNombreMoisRetard()))
                item.setNombreMoisRetard(dto.getNombreMoisRetard());
            if(StringUtil.isNotEmpty(dto.getMontantBase()))
                item.setMontantBase(dto.getMontantBase());
            if(StringUtil.isNotEmpty(dto.getMontantRetardPremeirMois()))
                item.setMontantRetardPremeirMois(dto.getMontantRetardPremeirMois());
            if(StringUtil.isNotEmpty(dto.getMontantTotal()))
                item.setMontantTotal(dto.getMontantTotal());
            if(this.redevable && dto.getRedevable()!=null &&  dto.getRedevable().getId() != null)
                item.setRedevable(redevableConverter.toItem(dto.getRedevable())) ;

            if(this.locale && dto.getLocale()!=null &&  dto.getLocale().getId() != null)
                item.setLocale(localeConverter.toItem(dto.getLocale())) ;




        return item;
        }
    }

    @Override
    public Taxe38Dto toDto(Taxe38 item) {
        if (item == null) {
            return null;
        } else {
            Taxe38Dto dto = new Taxe38Dto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getAnne()))
                dto.setAnne(item.getAnne());
            if(StringUtil.isNotEmpty(item.getTrim()))
                dto.setTrim(item.getTrim());
            if(StringUtil.isNotEmpty(item.getDatePresentaion()))
                dto.setDatePresentaion(item.getDatePresentaion());
            if(StringUtil.isNotEmpty(item.getNombreMoisRetard()))
                dto.setNombreMoisRetard(item.getNombreMoisRetard());
            if(StringUtil.isNotEmpty(item.getMontantBase()))
                dto.setMontantBase(item.getMontantBase());
            if(StringUtil.isNotEmpty(item.getMontantRetardPremeirMois()))
                dto.setMontantRetardPremeirMois(item.getMontantRetardPremeirMois());
            if(StringUtil.isNotEmpty(item.getMontantTotal()))
                dto.setMontantTotal(item.getMontantTotal());
            if(this.redevable && item.getRedevable()!=null) {
                dto.setRedevable(redevableConverter.toDto(item.getRedevable())) ;

            }
            if(this.locale && item.getLocale()!=null) {
                dto.setLocale(localeConverter.toDto(item.getLocale())) ;

            }


        return dto;
        }
    }

    public void copy(Taxe38Dto dto, Taxe38 t) {
    super.copy(dto, t);
    if (dto.getRedevable() != null)
        redevableConverter.copy(dto.getRedevable(), t.getRedevable());
    if (dto.getLocale() != null)
        localeConverter.copy(dto.getLocale(), t.getLocale());
    }



    public void initObject(boolean value) {
        this.redevable = value;
        this.locale = value;
    }


    public LocaleConverter getLocaleConverter(){
        return this.localeConverter;
    }
    public void setLocaleConverter(LocaleConverter localeConverter ){
        this.localeConverter = localeConverter;
    }
    public RedevableConverter getRedevableConverter(){
        return this.redevableConverter;
    }
    public void setRedevableConverter(RedevableConverter redevableConverter ){
        this.redevableConverter = redevableConverter;
    }
    public boolean  isRedevable(){
        return this.redevable;
    }
    public void  setRedevable(boolean redevable){
        this.redevable = redevable;
    }
    public boolean  isLocale(){
        return this.locale;
    }
    public void  setLocale(boolean locale){
        this.locale = locale;
    }
}

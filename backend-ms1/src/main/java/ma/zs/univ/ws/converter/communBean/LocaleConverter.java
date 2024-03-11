package  ma.zs.univ.ws.converter.communBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.communBean.RueConverter;
import ma.zs.univ.ws.converter.communBean.RedevableConverter;
import ma.zs.univ.ws.converter.taxe38Bean.CategorieLocaleConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.communBean.Locale;
import ma.zs.univ.ws.dto.communBean.LocaleDto;

@Component
public class LocaleConverter extends AbstractConverter<Locale, LocaleDto> {

    @Autowired
    private RueConverter rueConverter ;
    @Autowired
    private RedevableConverter redevableConverter ;
    @Autowired
    private CategorieLocaleConverter categorieLocaleConverter ;
    private boolean rue;
    private boolean redevable;
    private boolean categorieLocale;

    public  LocaleConverter() {
        super(Locale.class, LocaleDto.class);
        init(true);
    }

    @Override
    public Locale toItem(LocaleDto dto) {
        if (dto == null) {
            return null;
        } else {
        Locale item = new Locale();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getComplementAdresse()))
                item.setComplementAdresse(dto.getComplementAdresse());
            if(this.rue && dto.getRue()!=null &&  dto.getRue().getId() != null)
                item.setRue(rueConverter.toItem(dto.getRue())) ;

            if(this.redevable && dto.getRedevable()!=null &&  dto.getRedevable().getId() != null)
                item.setRedevable(redevableConverter.toItem(dto.getRedevable())) ;

            if(this.categorieLocale && dto.getCategorieLocale()!=null &&  dto.getCategorieLocale().getId() != null)
                item.setCategorieLocale(categorieLocaleConverter.toItem(dto.getCategorieLocale())) ;




        return item;
        }
    }

    @Override
    public LocaleDto toDto(Locale item) {
        if (item == null) {
            return null;
        } else {
            LocaleDto dto = new LocaleDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getComplementAdresse()))
                dto.setComplementAdresse(item.getComplementAdresse());
            if(this.rue && item.getRue()!=null) {
                dto.setRue(rueConverter.toDto(item.getRue())) ;

            }
            if(this.redevable && item.getRedevable()!=null) {
                dto.setRedevable(redevableConverter.toDto(item.getRedevable())) ;

            }
            if(this.categorieLocale && item.getCategorieLocale()!=null) {
                dto.setCategorieLocale(categorieLocaleConverter.toDto(item.getCategorieLocale())) ;

            }


        return dto;
        }
    }

    public void copy(LocaleDto dto, Locale t) {
    super.copy(dto, t);
    if (dto.getRue() != null)
        rueConverter.copy(dto.getRue(), t.getRue());
    if (dto.getRedevable() != null)
        redevableConverter.copy(dto.getRedevable(), t.getRedevable());
    if (dto.getCategorieLocale() != null)
        categorieLocaleConverter.copy(dto.getCategorieLocale(), t.getCategorieLocale());
    }



    public void initObject(boolean value) {
        this.rue = value;
        this.redevable = value;
        this.categorieLocale = value;
    }


    public RueConverter getRueConverter(){
        return this.rueConverter;
    }
    public void setRueConverter(RueConverter rueConverter ){
        this.rueConverter = rueConverter;
    }
    public RedevableConverter getRedevableConverter(){
        return this.redevableConverter;
    }
    public void setRedevableConverter(RedevableConverter redevableConverter ){
        this.redevableConverter = redevableConverter;
    }
    public CategorieLocaleConverter getCategorieLocaleConverter(){
        return this.categorieLocaleConverter;
    }
    public void setCategorieLocaleConverter(CategorieLocaleConverter categorieLocaleConverter ){
        this.categorieLocaleConverter = categorieLocaleConverter;
    }
    public boolean  isRue(){
        return this.rue;
    }
    public void  setRue(boolean rue){
        this.rue = rue;
    }
    public boolean  isRedevable(){
        return this.redevable;
    }
    public void  setRedevable(boolean redevable){
        this.redevable = redevable;
    }
    public boolean  isCategorieLocale(){
        return this.categorieLocale;
    }
    public void  setCategorieLocale(boolean categorieLocale){
        this.categorieLocale = categorieLocale;
    }
}

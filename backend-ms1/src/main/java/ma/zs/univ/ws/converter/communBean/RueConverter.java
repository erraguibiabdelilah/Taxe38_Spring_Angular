package  ma.zs.univ.ws.converter.communBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.communBean.Rue;
import ma.zs.univ.ws.dto.communBean.RueDto;

@Component
public class RueConverter extends AbstractConverter<Rue, RueDto> {


    public  RueConverter() {
        super(Rue.class, RueDto.class);
    }

    @Override
    public Rue toItem(RueDto dto) {
        if (dto == null) {
            return null;
        } else {
        Rue item = new Rue();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());



        return item;
        }
    }

    @Override
    public RueDto toDto(Rue item) {
        if (item == null) {
            return null;
        } else {
            RueDto dto = new RueDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}

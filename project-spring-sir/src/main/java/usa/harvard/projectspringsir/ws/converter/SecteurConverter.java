package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.commun.Secteur;
import usa.harvard.projectspringsir.ws.dto.SecteurDto;

import java.util.List;
import java.util.stream.Collectors;

public class SecteurConverter {
    public Secteur toBean(SecteurDto dto){
        if(dto == null){
            return null ;
        }
        else {
            Secteur bean = new Secteur();
            BeanUtils.copyProperties(dto,bean);
            return bean ;
        }
    }

    public SecteurDto toDto (Secteur bean){
        if(bean == null){
            return null ;
        }
        else {
            SecteurDto dto = new SecteurDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<Secteur> toBean(List<SecteurDto> dtos){
    if (dtos == null){
        return null;
    }else {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }
    }
    public List<SecteurDto> toDto(List<Secteur> beans){
        if (beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }

}

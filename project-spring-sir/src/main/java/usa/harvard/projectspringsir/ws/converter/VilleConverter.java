package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.commun.Ville;
import usa.harvard.projectspringsir.ws.dto.VilleDto;

import java.util.List;
import java.util.stream.Collectors;

public class VilleConverter {
    public Ville toBean(VilleDto dto){
        if(dto == null){
            return null ;
        }else {
            Ville bean = new Ville();
            BeanUtils.copyProperties(dto , bean);
            return bean ;
        }
    }
    public VilleDto toDto(Ville bean){
        if(bean == null){
            return null ;
        }else {
            VilleDto dto = new VilleDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<VilleDto> toDto(List<Ville> beans){
        if(beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }
    public List<Ville> toBean(List<VilleDto> dtos){
        if(dtos == null){
            return null ;
        }else {
            return dtos.stream().map(this::toBean).collect(Collectors.toList());
        }
    }
}

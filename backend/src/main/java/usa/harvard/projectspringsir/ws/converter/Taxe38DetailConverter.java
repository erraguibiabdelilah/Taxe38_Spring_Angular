package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.taxe38Bean.Taxe38Detail;
import usa.harvard.projectspringsir.ws.dto.taxe38Dto.Taxe38DetailDto;

import java.util.List;
import java.util.stream.Collectors;

public class Taxe38DetailConverter {
    public Taxe38Detail toBean(Taxe38DetailDto dto){
        if (dto == null){
            return null ;
        }else {
            Taxe38Detail bean = new Taxe38Detail();
            BeanUtils.copyProperties(dto , bean);
            return bean ;
        }
    }
    public Taxe38DetailDto toDto(Taxe38Detail bean){
        if (bean == null){
            return null ;
        }else {
            Taxe38DetailDto dto = new Taxe38DetailDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<Taxe38Detail> toBean(List<Taxe38DetailDto> dtos){
        if (dtos == null){
            return null ;
        }else {
            return dtos.stream().map(this::toBean).collect(Collectors.toList());
        }

    }
    public List<Taxe38DetailDto> toDto(List<Taxe38Detail> beans){
        if (beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }
}

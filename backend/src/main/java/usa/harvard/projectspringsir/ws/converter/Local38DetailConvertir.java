package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.taxe38Bean.Locale38Detail;
import usa.harvard.projectspringsir.ws.dto.taxe38Dto.Locale38DetailDto;

import java.util.List;
import java.util.stream.Collectors;

public class Local38DetailConvertir {
    public Locale38Detail toBean(Locale38DetailDto dto){
        if (dto == null){
            return null ;
        }else {
            Locale38Detail bean = new Locale38Detail();
            BeanUtils.copyProperties(dto , bean);
            return bean ;
        }
    }
    public Locale38DetailDto toDto(Locale38Detail bean){
        if (bean == null){
            return null ;
        }else {
            Locale38DetailDto dto = new Locale38DetailDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<Locale38Detail> toBean(List<Locale38DetailDto> dtos){
        if (dtos == null){
            return null ;
        }else {
            return dtos.stream().map(this::toBean).collect(Collectors.toList());
        }

    }
    public List<Locale38DetailDto> toDto(List<Locale38Detail> beans){
        if (beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }
}

package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import usa.harvard.projectspringsir.bean.communBean.Locale;
import usa.harvard.projectspringsir.ws.dto.communDto.LocaleDto;


import java.util.List;
import java.util.stream.Collectors;

@Component
public class LocalConverter {
    public Locale toBean(LocaleDto dto){
        if (dto == null){
            return null ;
        }else {
            Locale bean = new Locale();
            BeanUtils.copyProperties(dto , bean);
            return bean ;
        }
    }
    public LocaleDto toDto(Locale bean){
        if (bean == null){
            return null ;
        }else {
            LocaleDto dto = new LocaleDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<Locale> toBean(List<LocaleDto> dtos){
        if (dtos == null){
            return null ;
        }else {
            return dtos.stream().map(this::toBean).collect(Collectors.toList());
        }

    }
    public List<LocaleDto> toDto(List<Locale> beans){
        if (beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }
}

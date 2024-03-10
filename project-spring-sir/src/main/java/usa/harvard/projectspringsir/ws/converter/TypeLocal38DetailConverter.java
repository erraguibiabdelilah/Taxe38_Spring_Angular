package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.taxe38Bean.TypeLocale38Detail;
import usa.harvard.projectspringsir.ws.dto.taxe38Dto.TypeLocale38DetailDto;

import java.util.List;
import java.util.stream.Collectors;

public class TypeLocal38DetailConverter {
    public TypeLocale38Detail toBean(TypeLocale38DetailDto dto){
        if (dto == null){
            return null ;
        }else {
            TypeLocale38Detail bean = new TypeLocale38Detail();
            BeanUtils.copyProperties(dto , bean);
            return bean ;
        }
    }
    public TypeLocale38DetailDto toDto(TypeLocale38Detail bean){
        if (bean == null){
            return null ;
        }else {
            TypeLocale38DetailDto dto = new TypeLocale38DetailDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<TypeLocale38Detail> toBean(List<TypeLocale38DetailDto> dtos){
        if (dtos == null){
            return null ;
        }else {
            return dtos.stream().map(this::toBean).collect(Collectors.toList());
        }

    }
    public List<TypeLocale38DetailDto> toDto(List<TypeLocale38Detail> beans){
        if (beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }
}

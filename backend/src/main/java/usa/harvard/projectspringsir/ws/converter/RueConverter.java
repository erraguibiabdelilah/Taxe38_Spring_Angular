package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.communBean.Rue;
import usa.harvard.projectspringsir.ws.dto.communDto.RueDto;

import java.util.List;
import java.util.stream.Collectors;

public class RueConverter {
    public Rue toBean(RueDto dto) {
        Rue bean = new Rue();
        BeanUtils.copyProperties(dto, bean);
        return bean;
    }

    public RueDto toDto(RueDto bean) {
        RueDto dto=new RueDto();
        BeanUtils.copyProperties(bean, dto);
        return  dto;
    }

    public List<Rue> toBean(List<RueDto> dtos) {
        return dtos.stream().map(e->toBean(e)).collect(Collectors.toList());
    }

    public List<RueDto> toDto(List<RueDto> beans) {
        return beans.stream().map(e->toDto(e)).collect(Collectors.toList());
    }
}

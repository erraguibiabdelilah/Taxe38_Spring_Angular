package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.commun.Quartie;
import usa.harvard.projectspringsir.bean.commun.Redevable;
import usa.harvard.projectspringsir.ws.dto.QuartieDto;
import usa.harvard.projectspringsir.ws.dto.RedevableDto;

import java.util.List;
import java.util.stream.Collectors;

public class RedevableConverter {
    public Redevable toBean(RedevableDto dto) {
        Redevable bean = new Redevable();
        BeanUtils.copyProperties(dto, bean);
        return bean;
    }

    public RedevableDto toDto(Redevable bean) {
        RedevableDto dto=new RedevableDto();
        BeanUtils.copyProperties(bean, dto);
        return  dto;
    }

    public List<Redevable> toBean(List<RedevableDto> dtos) {
        return dtos.stream().map(e->toBean(e)).collect(Collectors.toList());
    }

    public List<RedevableDto> toDto(List<Redevable> beans) {
        return beans.stream().map(e->toDto(e)).collect(Collectors.toList());
    }
}

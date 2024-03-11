package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.communBean.Quartie;
import usa.harvard.projectspringsir.ws.dto.communDto.QuartieDto;

import java.util.List;
import java.util.stream.Collectors;

public class QuartieConverter {

    public Quartie toBean(QuartieDto dto) {
        Quartie bean = new Quartie();
        BeanUtils.copyProperties(dto, bean);
        return bean;
    }

    public QuartieDto toDto(Quartie bean) {
        QuartieDto dto=new QuartieDto();
        BeanUtils.copyProperties(bean, dto);
        return  dto;
    }

    public List<Quartie> toBean(List<QuartieDto> dtos) {
        return dtos.stream().map(e->toBean(e)).collect(Collectors.toList());
    }

    public List<QuartieDto> toDto(List<Quartie> beans) {
        return beans.stream().map(e->toDto(e)).collect(Collectors.toList());
    }

}

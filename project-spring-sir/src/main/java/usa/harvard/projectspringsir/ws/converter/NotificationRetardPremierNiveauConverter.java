package usa.harvard.projectspringsir.ws.converter;


import org.springframework.beans.BeanUtils;
import usa.harvard.projectspringsir.bean.notifaction1NivBean.NotificationRetardPremierNiveau;
import usa.harvard.projectspringsir.ws.dto.notifaction1NivDto.NotificationRetardPremierNiveauDto;

import java.util.List;
import java.util.stream.Collectors;

public class NotificationRetardPremierNiveauConverter {
    public NotificationRetardPremierNiveau toBean(NotificationRetardPremierNiveauDto dto){
        if (dto == null){
            return null ;
        }else {
            NotificationRetardPremierNiveau bean = new NotificationRetardPremierNiveau();
            BeanUtils.copyProperties(dto , bean);
            return bean ;
        }
    }
    public NotificationRetardPremierNiveauDto toDto(NotificationRetardPremierNiveau bean){
        if (bean == null){
            return null ;
        }else {
            NotificationRetardPremierNiveauDto dto = new NotificationRetardPremierNiveauDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<NotificationRetardPremierNiveau> toBean(List<NotificationRetardPremierNiveauDto> dtos){
        if (dtos == null){
            return null ;
        }else {
            return dtos.stream().map(this::toBean).collect(Collectors.toList());
        }

    }
    public List<NotificationRetardPremierNiveauDto> toDto(List<NotificationRetardPremierNiveau> beans){
        if (beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }
}

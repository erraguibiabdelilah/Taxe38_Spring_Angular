package usa.harvard.projectspringsir.ws.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import usa.harvard.projectspringsir.bean.communBean.Locale;
import usa.harvard.projectspringsir.bean.notifiication3NivBean.NotificationRetardTroisiemeNiveau;
import usa.harvard.projectspringsir.ws.dto.communDto.LocaleDto;
import usa.harvard.projectspringsir.ws.dto.notifiication3NivDto.NotificationRetardTroisiemeNiveauDto;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class NotificationRetardTroisiemeNiveauConverter {
    public NotificationRetardTroisiemeNiveau toBean(NotificationRetardTroisiemeNiveauDto dto){
        if (dto == null){
            return null ;
        }else {
            NotificationRetardTroisiemeNiveau bean = new NotificationRetardTroisiemeNiveau();
            BeanUtils.copyProperties(dto , bean);
            return bean ;
        }
    }
    public NotificationRetardTroisiemeNiveauDto toDto(NotificationRetardTroisiemeNiveau bean){
        if (bean == null){
            return null ;
        }else {
            NotificationRetardTroisiemeNiveauDto dto = new NotificationRetardTroisiemeNiveauDto();
            BeanUtils.copyProperties(bean , dto);
            return dto ;
        }
    }
    public List<NotificationRetardTroisiemeNiveau> toBean(List<NotificationRetardTroisiemeNiveauDto> dtos){
        if (dtos == null){
            return null ;
        }else {
            return dtos.stream().map(this::toBean).collect(Collectors.toList());
        }

    }
    public List<NotificationRetardTroisiemeNiveauDto> toDto(List<NotificationRetardTroisiemeNiveau> beans){
        if (beans == null){
            return null ;
        }else {
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }

}

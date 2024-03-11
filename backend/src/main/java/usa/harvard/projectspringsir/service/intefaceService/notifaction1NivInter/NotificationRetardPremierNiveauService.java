package usa.harvard.projectspringsir.service.intefaceService.notifaction1NivInter;

import usa.harvard.projectspringsir.bean.notifaction1NivBean.NotificationRetardPremierNiveau;

import java.util.List;

public interface NotificationRetardPremierNiveauService {
    int deleteByCode(String code);
    NotificationRetardPremierNiveau findByCode(String code);
    NotificationRetardPremierNiveau save(NotificationRetardPremierNiveau notificationRetardPremierNiveau);
    List<NotificationRetardPremierNiveau> findAll();
}
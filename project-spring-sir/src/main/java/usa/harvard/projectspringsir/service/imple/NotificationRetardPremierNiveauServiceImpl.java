package usa.harvard.projectspringsir.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.notifaction1Niv.NotificationRetardPremierNiveau;
import usa.harvard.projectspringsir.dao.notifaction1NivDao.NotificationRetardPremierNiveauDao;
import usa.harvard.projectspringsir.service.intefaceService.NotificationRetardPremierNiveauService;

import java.util.List;
@Service
public class NotificationRetardPremierNiveauServiceImpl implements NotificationRetardPremierNiveauService {

    @Override
    public int deleteByCode(String code) {
        return dao.deleteByCode(code);
    }

    @Override
    public NotificationRetardPremierNiveau findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    public NotificationRetardPremierNiveau save(NotificationRetardPremierNiveau notificationRetardPremierNiveau) {
        return dao.save(notificationRetardPremierNiveau);
    }

    @Override
    public List<NotificationRetardPremierNiveau> findAll() {
        return dao.findAll();
    }
    @Autowired
    private NotificationRetardPremierNiveauDao dao ;
}

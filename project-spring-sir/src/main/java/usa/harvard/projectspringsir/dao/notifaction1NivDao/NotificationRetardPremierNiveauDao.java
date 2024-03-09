package usa.harvard.projectspringsir.dao.notifaction1NivDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.notifaction1Niv.NotificationRetardPremierNiveau;

@Repository
public interface NotificationRetardPremierNiveauDao extends JpaRepository<NotificationRetardPremierNiveau, Long> {
    NotificationRetardPremierNiveau findByCode(String code);
    int  deleteByCode (String code);
}

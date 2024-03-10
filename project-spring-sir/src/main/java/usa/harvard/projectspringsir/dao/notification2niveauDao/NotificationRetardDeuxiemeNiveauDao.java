package usa.harvard.projectspringsir.dao.notification2niveauDao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.notification2niveauBean.NotificationRetardDeuxiemeNiveau;

public interface NotificationRetardDeuxiemeNiveauDao extends JpaRepository<NotificationRetardDeuxiemeNiveau,Long> {
    NotificationRetardDeuxiemeNiveau findByCode(String code);
    int deleteByCode(String code);
}

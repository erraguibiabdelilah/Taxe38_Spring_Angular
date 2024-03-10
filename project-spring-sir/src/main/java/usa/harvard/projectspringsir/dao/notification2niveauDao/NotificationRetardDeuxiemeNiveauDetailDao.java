package usa.harvard.projectspringsir.dao.notification2niveauDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.notification2niveauBean.NotificationRetardDeuxiemeNiveauDetail;

@Repository
public interface NotificationRetardDeuxiemeNiveauDetailDao extends JpaRepository <NotificationRetardDeuxiemeNiveauDetail , Long> {
    NotificationRetardDeuxiemeNiveauDetail findByCode(String code);
    int deleteByCode(String code);
}

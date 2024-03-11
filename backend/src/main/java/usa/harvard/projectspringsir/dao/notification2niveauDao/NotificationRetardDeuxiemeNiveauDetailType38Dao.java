package usa.harvard.projectspringsir.dao.notification2niveauDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.notification2niveauBean.NotificationRetardDeuxiemeNiveauDetailType38;

@Repository
public interface NotificationRetardDeuxiemeNiveauDetailType38Dao extends JpaRepository<NotificationRetardDeuxiemeNiveauDetailType38 , Long> {
    NotificationRetardDeuxiemeNiveauDetailType38 findByCode(String code);
    int deleteByCode(String code);
}

package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.notification2niveau.NotificationRetardDeuxiemeNiveauDetailType38;

@Repository
public interface NotificationRetardDeuxiemeNiveauDetailType38Dao extends JpaRepository<NotificationRetardDeuxiemeNiveauDetailType38 , Long> {
    NotificationRetardDeuxiemeNiveauDetailType38 findByCode(String code);
    int deleteByCode(String code);
}

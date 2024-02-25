package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.NotificationRetardDeuxiemeNiveauDetail;

import java.util.Optional;

@Repository
public interface NotificationRetardDeuxiemeNiveauDetailDao extends JpaRepository <NotificationRetardDeuxiemeNiveauDetail , Long> {
    NotificationRetardDeuxiemeNiveauDetail findByCode(String code);
    int deleteByCode(String code);
}

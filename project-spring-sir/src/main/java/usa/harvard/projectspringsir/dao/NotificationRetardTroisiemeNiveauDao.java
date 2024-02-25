package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.NotificationRetardTroisiemeNiveau;

import java.util.Optional;

@Repository
public interface NotificationRetardTroisiemeNiveauDao extends JpaRepository<NotificationRetardTroisiemeNiveau, Long> {
    NotificationRetardTroisiemeNiveau findByCode (String code);
    int deleteByCode(String code);
}

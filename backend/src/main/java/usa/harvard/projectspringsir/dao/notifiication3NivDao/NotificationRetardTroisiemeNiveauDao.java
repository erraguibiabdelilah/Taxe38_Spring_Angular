package usa.harvard.projectspringsir.dao.notifiication3NivDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.notifiication3NivBean.NotificationRetardTroisiemeNiveau;
@Repository
public interface NotificationRetardTroisiemeNiveauDao extends JpaRepository<NotificationRetardTroisiemeNiveau, Long> {
    NotificationRetardTroisiemeNiveau findByCode (String code);
    int deleteByCode(String code);
}

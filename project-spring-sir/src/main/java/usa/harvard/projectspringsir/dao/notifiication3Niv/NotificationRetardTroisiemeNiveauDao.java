package usa.harvard.projectspringsir.dao.notifiication3Niv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.notifiication3Niv.NotificationRetardTroisiemeNiveau;
@Repository
public interface NotificationRetardTroisiemeNiveauDao extends JpaRepository<NotificationRetardTroisiemeNiveau, Long> {
    NotificationRetardTroisiemeNiveau findByCode (String code);
    int deleteByCode(String code);
}

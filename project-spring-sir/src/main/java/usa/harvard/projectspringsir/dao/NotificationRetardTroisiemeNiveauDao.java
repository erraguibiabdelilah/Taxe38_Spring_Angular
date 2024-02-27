package usa.harvard.projectspringsir.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
import usa.harvard.projectspringsir.bean.notifiication3Niv.NotificationRetardTroisiemeNiveau;

=======
import usa.harvard.projectspringsir.bean.NotificationRetardTroisiemeNiveau;
import java.util.Optional;
>>>>>>> origin/main
@Repository
public interface NotificationRetardTroisiemeNiveauDao extends JpaRepository<NotificationRetardTroisiemeNiveau, Long> {
    NotificationRetardTroisiemeNiveau findByCode (String code);
    int deleteByCode(String code);
}

package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotificationRetardTroisiemeNiveau extends JpaRepository<NotificationRetardTroisiemeNiveau , Long> {
    Optional<NotificationRetardTroisiemeNiveau> findByCode (String code);
    void deleteByCode(String code);
}

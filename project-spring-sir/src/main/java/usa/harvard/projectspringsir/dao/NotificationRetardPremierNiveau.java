package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotificationRetardPremierNiveau extends JpaRepository<NotificationRetardPremierNiveau , Long> {
    Optional<NotificationRetardPremierNiveau> findByCode(String code);
    void deleteByCode (String code);
}

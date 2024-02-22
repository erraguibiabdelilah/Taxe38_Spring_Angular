package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Locale;
import usa.harvard.projectspringsir.bean.NotificationRetardDeuxiemeNiveau;

import java.util.Optional;

public interface NotificationRetardDeuxiemeNiveauDao extends JpaRepository<NotificationRetardDeuxiemeNiveau,Long> {
    @Override
    Optional<NotificationRetardDeuxiemeNiveau> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}

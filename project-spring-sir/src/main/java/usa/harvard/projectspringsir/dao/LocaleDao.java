package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Locale;
import usa.harvard.projectspringsir.bean.Locale38Detail;

import java.util.Optional;

public interface LocaleDao extends JpaRepository<Locale,Long> {
    Optional<Locale> findByCode(String code);
    void deleteByCode(String code);
}

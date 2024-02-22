package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Locale;
import usa.harvard.projectspringsir.bean.Taxe38;

import java.util.Optional;

public interface Taxe38Dao extends JpaRepository<Taxe38,Long> {
    Optional<Taxe38> findByCode(String code);
    void deleteByCode(String code);
}

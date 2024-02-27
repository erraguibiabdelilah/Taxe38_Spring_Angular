package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.commun.Locale;

@Repository
public interface LocaleDao extends JpaRepository<Locale,Long> {
    Locale findByCode(String code);
    void deleteByCode(String code);
}

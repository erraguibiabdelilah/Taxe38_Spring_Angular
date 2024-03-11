package usa.harvard.projectspringsir.dao.communDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.communBean.Locale;

@Repository
public interface LocaleDao extends JpaRepository<Locale,Long> {
    Locale findByCode(String code);
    int deleteByCode(String code);
}

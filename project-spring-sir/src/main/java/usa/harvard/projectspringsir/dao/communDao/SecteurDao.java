package usa.harvard.projectspringsir.dao.communDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.communBean.Secteur;
@Repository
public interface SecteurDao extends JpaRepository<Secteur,Long> {
     int deleteByCode(String code);
     Secteur findByCode(String code);
}

package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.commun.Secteur;
@Repository
public interface SecteurDao extends JpaRepository<Secteur,Long> {
     int deleteByCode(String code);
     Secteur findByCode(String code);
}

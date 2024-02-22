package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.Secteur;
@Repository
public interface SecteurDao extends JpaRepository<Secteur,Long> {
    public int deleteByCode(String code);
    public Secteur findByCode(String code);
}

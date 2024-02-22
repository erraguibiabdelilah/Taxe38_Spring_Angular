package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Secteur;

public interface SecteurDao extends JpaRepository<Secteur,Long> {
    public int deleteByCode(String code);
    public Secteur findByLibelle(String code);
}

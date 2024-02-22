package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usa.harvard.projectspringsir.bean.Taxe38Detail;

public interface Taxe38DetailDao extends JpaRepository<Taxe38Detail,Long> {
        public int deleteBy(String libelle);
        public Taxe38Detail findByLibelle(String libelle);


}

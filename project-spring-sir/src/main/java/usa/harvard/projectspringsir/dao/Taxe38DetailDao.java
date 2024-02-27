package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.taxe38.Taxe38Detail;
@Repository
public interface Taxe38DetailDao extends JpaRepository<Taxe38Detail,Long> {
        public int deleteByCode(String libelle);
        public Taxe38Detail findByCode(String libelle);


}

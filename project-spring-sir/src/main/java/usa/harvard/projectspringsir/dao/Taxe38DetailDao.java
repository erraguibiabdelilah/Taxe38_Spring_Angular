package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.Taxe38Detail;
@Repository
public interface Taxe38DetailDao extends JpaRepository<Taxe38Detail,Long> {
         int deleteByCode(String libelle);
         Taxe38Detail findByCode(String libelle);


}

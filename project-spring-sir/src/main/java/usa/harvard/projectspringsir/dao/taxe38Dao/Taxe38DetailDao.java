package usa.harvard.projectspringsir.dao.taxe38Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.taxe38Bean.Taxe38Detail;
@Repository
public interface Taxe38DetailDao extends JpaRepository<Taxe38Detail,Long> {
         int deleteByCode(String libelle);
         Taxe38Detail findByCode(String libelle);


}
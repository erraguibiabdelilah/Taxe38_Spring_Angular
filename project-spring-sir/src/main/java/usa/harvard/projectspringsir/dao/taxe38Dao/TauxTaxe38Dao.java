package usa.harvard.projectspringsir.dao.taxe38Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.taxe38.TauxTaxe38;

@Repository
public interface TauxTaxe38Dao extends JpaRepository<TauxTaxe38,Long> {
    int deleteByCode(String code );
    TauxTaxe38 findByCode(String code );
}

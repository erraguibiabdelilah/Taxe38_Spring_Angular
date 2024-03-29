package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.taxe38.Taxe38;

@Repository
public interface Taxe38Dao extends JpaRepository<Taxe38,Long> {
    Taxe38 findByCode(String code);
    int deleteByCode(String code);
}

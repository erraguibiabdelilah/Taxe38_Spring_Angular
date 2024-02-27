package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.commun.Redevable;
@Repository
public interface RedevableDao extends JpaRepository<Redevable,Long> {
    Redevable findByCode(String code ) ;
    int deleteByCode(String code ) ;
}

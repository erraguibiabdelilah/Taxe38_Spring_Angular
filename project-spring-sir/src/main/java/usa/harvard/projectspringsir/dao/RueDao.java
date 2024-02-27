package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.commun.Rue;
@Repository
public interface RueDao extends JpaRepository<Rue,Long > {
    Rue findByCode(String code ) ;
    int deleteByCode(String code ) ;
}

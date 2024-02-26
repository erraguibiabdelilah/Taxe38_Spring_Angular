package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.Rue;
@Repository
public interface RueDao extends JpaRepository<Rue,Long > {
    Rue FindByCode(String code ) ;
    int DeleteByCode(String code ) ;
}

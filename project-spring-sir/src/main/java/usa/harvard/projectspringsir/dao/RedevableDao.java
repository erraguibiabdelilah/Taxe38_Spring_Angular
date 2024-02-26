package usa.harvard.projectspringsir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.Redevable;
@Repository
public interface RedevableDao extends JpaRepository<Redevable,Long> {
    Redevable FindByCode(String code ) ;
    int DeleteByCode(String code ) ;
}

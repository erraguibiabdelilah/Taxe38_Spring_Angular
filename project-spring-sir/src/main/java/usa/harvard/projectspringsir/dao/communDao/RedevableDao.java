package usa.harvard.projectspringsir.dao.communDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.communBean.Redevable;
@Repository
public interface RedevableDao extends JpaRepository<Redevable,Long> {
    Redevable findByCin(String code ) ;
    int deleteByCin(String code ) ;
}

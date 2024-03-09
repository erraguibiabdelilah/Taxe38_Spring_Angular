package usa.harvard.projectspringsir.dao.communDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.commun.Quartie;
@Repository
public interface QuartieDao extends JpaRepository<Quartie,Long > {
    Quartie findByCode(String code ) ;
    int deleteByCode(String code) ;
}

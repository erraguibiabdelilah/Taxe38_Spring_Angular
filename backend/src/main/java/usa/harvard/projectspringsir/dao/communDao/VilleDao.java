package usa.harvard.projectspringsir.dao.communDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.harvard.projectspringsir.bean.communBean.Ville;
@Repository
public interface VilleDao extends JpaRepository <Ville,Long>{
    int deleteByCode(String code);
    Ville findByCode(String code );
}
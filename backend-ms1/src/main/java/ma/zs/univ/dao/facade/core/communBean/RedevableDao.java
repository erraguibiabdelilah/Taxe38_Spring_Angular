package ma.zs.univ.dao.facade.core.communBean;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.communBean.Redevable;
import org.springframework.stereotype.Repository;
import ma.zs.univ.bean.core.communBean.Redevable;
import java.util.List;


@Repository
public interface RedevableDao extends AbstractRepository<Redevable,Long>  {
    Redevable findByCin(String cin);
    int deleteByCin(String cin);

    Redevable findByUsername(String username);

    @Query("SELECT NEW Redevable(item.id,item.nom) FROM Redevable item")
    List<Redevable> findAllOptimized();

}

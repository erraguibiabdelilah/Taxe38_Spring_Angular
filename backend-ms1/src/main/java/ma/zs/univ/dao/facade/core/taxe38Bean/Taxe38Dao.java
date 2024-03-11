package ma.zs.univ.dao.facade.core.taxe38Bean;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import org.springframework.stereotype.Repository;
import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import java.util.List;


@Repository
public interface Taxe38Dao extends AbstractRepository<Taxe38,Long>  {
    Taxe38 findByCode(String code);
    int deleteByCode(String code);

    List<Taxe38> findByRedevableId(Long id);
    int deleteByRedevableId(Long id);
    long countByRedevableCin(String cin);
    List<Taxe38> findByLocaleId(Long id);
    int deleteByLocaleId(Long id);
    long countByLocaleId(Long id);

    @Query("SELECT NEW Taxe38(item.id,item.code) FROM Taxe38 item")
    List<Taxe38> findAllOptimized();

}

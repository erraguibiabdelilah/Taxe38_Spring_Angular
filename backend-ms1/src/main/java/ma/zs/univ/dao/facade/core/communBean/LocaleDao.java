package ma.zs.univ.dao.facade.core.communBean;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.communBean.Locale;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LocaleDao extends AbstractRepository<Locale,Long>  {

    List<Locale> findByRueId(Long id);
    int deleteByRueId(Long id);
    long countByRueCode(String code);
    List<Locale> findByRedevableId(Long id);
    int deleteByRedevableId(Long id);
    long countByRedevableCin(String cin);
    List<Locale> findByCategorieLocaleId(Long id);
    int deleteByCategorieLocaleId(Long id);
    long countByCategorieLocaleId(Long id);


}

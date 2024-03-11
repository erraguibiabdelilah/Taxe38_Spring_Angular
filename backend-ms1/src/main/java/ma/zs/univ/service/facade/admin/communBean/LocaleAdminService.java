package ma.zs.univ.service.facade.admin.communBean;

import java.util.List;
import ma.zs.univ.bean.core.communBean.Locale;
import ma.zs.univ.dao.criteria.core.communBean.LocaleCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface LocaleAdminService extends  IService<Locale,LocaleCriteria>  {

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

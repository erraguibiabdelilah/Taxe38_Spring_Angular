package ma.zs.univ.service.facade.admin.taxe38Bean;

import java.util.List;
import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import ma.zs.univ.dao.criteria.core.taxe38Bean.Taxe38Criteria;
import ma.zs.univ.zynerator.service.IService;



public interface Taxe38AdminService extends  IService<Taxe38,Taxe38Criteria>  {

    List<Taxe38> findByRedevableId(Long id);
    int deleteByRedevableId(Long id);
    long countByRedevableCin(String cin);
    List<Taxe38> findByLocaleId(Long id);
    int deleteByLocaleId(Long id);
    long countByLocaleId(Long id);




}

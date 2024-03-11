package ma.zs.univ.service.impl.admin.taxe38Bean;


import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import ma.zs.univ.dao.criteria.core.taxe38Bean.Taxe38Criteria;
import ma.zs.univ.dao.facade.core.taxe38Bean.Taxe38Dao;
import ma.zs.univ.dao.specification.core.taxe38Bean.Taxe38Specification;
import ma.zs.univ.service.facade.admin.taxe38Bean.Taxe38AdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.communBean.LocaleAdminService ;
import ma.zs.univ.bean.core.communBean.Locale ;
import ma.zs.univ.service.facade.admin.communBean.RedevableAdminService ;
import ma.zs.univ.bean.core.communBean.Redevable ;

import java.util.List;
@Service
public class Taxe38AdminServiceImpl extends AbstractServiceImpl<Taxe38, Taxe38Criteria, Taxe38Dao> implements Taxe38AdminService {






    public Taxe38 findByReferenceEntity(Taxe38 t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(Taxe38 t){
        if( t != null) {
            t.setRedevable(redevableService.findOrSave(t.getRedevable()));
            t.setLocale(localeService.findOrSave(t.getLocale()));
        }
    }

    public List<Taxe38> findByRedevableId(Long id){
        return dao.findByRedevableId(id);
    }
    public int deleteByRedevableId(Long id){
        return dao.deleteByRedevableId(id);
    }
    public long countByRedevableCin(String cin){
        return dao.countByRedevableCin(cin);
    }
    public List<Taxe38> findByLocaleId(Long id){
        return dao.findByLocaleId(id);
    }
    public int deleteByLocaleId(Long id){
        return dao.deleteByLocaleId(id);
    }
    public long countByLocaleId(Long id){
        return dao.countByLocaleId(id);
    }

    public List<Taxe38> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Taxe38.class, Taxe38Specification.class);
    }


    @Autowired
    private LocaleAdminService localeService ;
    @Autowired
    private RedevableAdminService redevableService ;

    public Taxe38AdminServiceImpl(Taxe38Dao dao) {
        super(dao);
    }

}

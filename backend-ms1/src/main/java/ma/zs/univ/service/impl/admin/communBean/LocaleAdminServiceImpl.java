package ma.zs.univ.service.impl.admin.communBean;


import ma.zs.univ.bean.core.communBean.Locale;
import ma.zs.univ.dao.criteria.core.communBean.LocaleCriteria;
import ma.zs.univ.dao.facade.core.communBean.LocaleDao;
import ma.zs.univ.dao.specification.core.communBean.LocaleSpecification;
import ma.zs.univ.service.facade.admin.communBean.LocaleAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.communBean.RueAdminService ;
import ma.zs.univ.bean.core.communBean.Rue ;
import ma.zs.univ.service.facade.admin.communBean.RedevableAdminService ;
import ma.zs.univ.bean.core.communBean.Redevable ;
import ma.zs.univ.service.facade.admin.taxe38Bean.CategorieLocaleAdminService ;
import ma.zs.univ.bean.core.taxe38Bean.CategorieLocale ;

import java.util.List;
@Service
public class LocaleAdminServiceImpl extends AbstractServiceImpl<Locale, LocaleCriteria, LocaleDao> implements LocaleAdminService {






    public void findOrSaveAssociatedObject(Locale t){
        if( t != null) {
            t.setRue(rueService.findOrSave(t.getRue()));
            t.setRedevable(redevableService.findOrSave(t.getRedevable()));
            t.setCategorieLocale(categorieLocaleService.findOrSave(t.getCategorieLocale()));
        }
    }

    public List<Locale> findByRueId(Long id){
        return dao.findByRueId(id);
    }
    public int deleteByRueId(Long id){
        return dao.deleteByRueId(id);
    }
    public long countByRueCode(String code){
        return dao.countByRueCode(code);
    }
    public List<Locale> findByRedevableId(Long id){
        return dao.findByRedevableId(id);
    }
    public int deleteByRedevableId(Long id){
        return dao.deleteByRedevableId(id);
    }
    public long countByRedevableCin(String cin){
        return dao.countByRedevableCin(cin);
    }
    public List<Locale> findByCategorieLocaleId(Long id){
        return dao.findByCategorieLocaleId(id);
    }
    public int deleteByCategorieLocaleId(Long id){
        return dao.deleteByCategorieLocaleId(id);
    }
    public long countByCategorieLocaleId(Long id){
        return dao.countByCategorieLocaleId(id);
    }






    public void configure() {
        super.configure(Locale.class, LocaleSpecification.class);
    }


    @Autowired
    private RueAdminService rueService ;
    @Autowired
    private RedevableAdminService redevableService ;
    @Autowired
    private CategorieLocaleAdminService categorieLocaleService ;

    public LocaleAdminServiceImpl(LocaleDao dao) {
        super(dao);
    }

}

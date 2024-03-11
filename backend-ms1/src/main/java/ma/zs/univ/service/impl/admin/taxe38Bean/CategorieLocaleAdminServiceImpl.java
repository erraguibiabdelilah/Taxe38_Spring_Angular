package ma.zs.univ.service.impl.admin.taxe38Bean;


import ma.zs.univ.bean.core.taxe38Bean.CategorieLocale;
import ma.zs.univ.dao.criteria.core.taxe38Bean.CategorieLocaleCriteria;
import ma.zs.univ.dao.facade.core.taxe38Bean.CategorieLocaleDao;
import ma.zs.univ.dao.specification.core.taxe38Bean.CategorieLocaleSpecification;
import ma.zs.univ.service.facade.admin.taxe38Bean.CategorieLocaleAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class CategorieLocaleAdminServiceImpl extends AbstractServiceImpl<CategorieLocale, CategorieLocaleCriteria, CategorieLocaleDao> implements CategorieLocaleAdminService {













    public void configure() {
        super.configure(CategorieLocale.class, CategorieLocaleSpecification.class);
    }



    public CategorieLocaleAdminServiceImpl(CategorieLocaleDao dao) {
        super(dao);
    }

}

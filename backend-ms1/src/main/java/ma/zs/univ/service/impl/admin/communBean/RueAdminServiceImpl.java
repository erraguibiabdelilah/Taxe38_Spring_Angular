package ma.zs.univ.service.impl.admin.communBean;


import ma.zs.univ.bean.core.communBean.Rue;
import ma.zs.univ.dao.criteria.core.communBean.RueCriteria;
import ma.zs.univ.dao.facade.core.communBean.RueDao;
import ma.zs.univ.dao.specification.core.communBean.RueSpecification;
import ma.zs.univ.service.facade.admin.communBean.RueAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class RueAdminServiceImpl extends AbstractServiceImpl<Rue, RueCriteria, RueDao> implements RueAdminService {






    public Rue findByReferenceEntity(Rue t){
        return  dao.findByCode(t.getCode());
    }


    public List<Rue> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Rue.class, RueSpecification.class);
    }



    public RueAdminServiceImpl(RueDao dao) {
        super(dao);
    }

}

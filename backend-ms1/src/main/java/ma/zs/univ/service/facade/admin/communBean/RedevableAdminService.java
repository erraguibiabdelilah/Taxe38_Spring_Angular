package ma.zs.univ.service.facade.admin.communBean;

import java.util.List;
import ma.zs.univ.bean.core.communBean.Redevable;
import ma.zs.univ.dao.criteria.core.communBean.RedevableCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface RedevableAdminService extends  IService<Redevable,RedevableCriteria>  {
    Redevable findByUsername(String username);
    boolean changePassword(String username, String newPassword);





}

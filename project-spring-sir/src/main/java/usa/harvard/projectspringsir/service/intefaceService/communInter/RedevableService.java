package usa.harvard.projectspringsir.service.intefaceService.communInter;

import usa.harvard.projectspringsir.bean.communBean.Redevable;
import usa.harvard.projectspringsir.bean.communBean.Ville;

import java.util.List;

public interface RedevableService {
    int deleteByCode(String code);
    Redevable findByCode(String code);
    int save(Redevable redevable);
    List<Redevable> findAll();
}

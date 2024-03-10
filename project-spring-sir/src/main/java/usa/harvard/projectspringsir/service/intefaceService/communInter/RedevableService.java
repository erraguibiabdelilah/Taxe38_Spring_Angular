package usa.harvard.projectspringsir.service.intefaceService.communInter;

import usa.harvard.projectspringsir.bean.communBean.Redevable;
import usa.harvard.projectspringsir.bean.communBean.Ville;

import java.util.List;

public interface RedevableService {
    int deleteByCin(String cin);
    Redevable findByCin(String cin);
    int save(Redevable redevable);
    List<Redevable> findAll();
}

package usa.harvard.projectspringsir.service.intefaceService.communInter;

import usa.harvard.projectspringsir.bean.communBean.Ville;

import java.util.List;

public interface VilleService {
     int deleteByCode(String code);
     Ville findByCode(String code);
     int save(Ville ville);
     List<Ville> findAll();
}

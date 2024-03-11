package usa.harvard.projectspringsir.service.intefaceService.communInter;

import usa.harvard.projectspringsir.bean.communBean.Quartie;

import java.util.List;

public interface QuartieService {
    int deleteByCode(String code);
    Quartie findByCode(String code);
    int save(Quartie quartie);
    List<Quartie> findAll();
}

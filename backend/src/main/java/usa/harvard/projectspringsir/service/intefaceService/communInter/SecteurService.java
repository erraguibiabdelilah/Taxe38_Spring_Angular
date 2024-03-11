package usa.harvard.projectspringsir.service.intefaceService.communInter;

import usa.harvard.projectspringsir.bean.communBean.Secteur;

import java.util.List;

public interface SecteurService {
    int deleteByCode(String code);
    Secteur findByCode(String code);
    int save(Secteur secteur);
    List<Secteur> findAll();
}

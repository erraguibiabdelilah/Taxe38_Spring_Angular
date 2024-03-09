package usa.harvard.projectspringsir.service.intefaceService;

import usa.harvard.projectspringsir.bean.commun.Secteur;

import java.util.List;

public interface SecteurService {
    int deleteByCode(String code);
    Secteur findByCode(String code);
    Secteur save(Secteur secteur);
    List<Secteur> findAll();
}

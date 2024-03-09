package usa.harvard.projectspringsir.service.intefaceService;

import usa.harvard.projectspringsir.bean.commun.Ville;

import java.util.List;

public interface VilleService {
     int deleteByCode(String code);
     Ville findByCode(String code);
     Ville save(Ville ville);
     List<Ville> findAll();
}

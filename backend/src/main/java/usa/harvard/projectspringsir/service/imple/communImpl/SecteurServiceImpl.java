package usa.harvard.projectspringsir.service.imple.communImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.communBean.Secteur;
import usa.harvard.projectspringsir.bean.communBean.Ville;
import usa.harvard.projectspringsir.dao.communDao.SecteurDao;
import usa.harvard.projectspringsir.dao.communDao.VilleDao;
import usa.harvard.projectspringsir.service.intefaceService.communInter.SecteurService;

import java.util.List;

@Service
public class SecteurServiceImpl implements SecteurService {
    @Autowired
    private SecteurDao secteurDao;

    @Autowired
    private VilleDao villeDao;

    @Override
    public int deleteByCode(String code) {
        return secteurDao.deleteByCode(code);
    }

    @Override
    public Secteur findByCode(String code) {
        return secteurDao.findByCode(code);
    }

    @Override
    public int save(Secteur secteur) {
            Ville ville=secteur.getVille();
            villeDao.save(ville);
            secteurDao.save(secteur);
            return 1;
        }

    @Override
    public List<Secteur> findAll() {
        return secteurDao.findAll();
    }
}

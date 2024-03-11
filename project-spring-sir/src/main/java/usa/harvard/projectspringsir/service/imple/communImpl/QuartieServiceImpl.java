package usa.harvard.projectspringsir.service.imple.communImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.communBean.Quartie;
import usa.harvard.projectspringsir.bean.communBean.Secteur;
import usa.harvard.projectspringsir.dao.communDao.QuartieDao;
import usa.harvard.projectspringsir.service.intefaceService.communInter.QuartieService;
import usa.harvard.projectspringsir.service.intefaceService.communInter.SecteurService;

import java.util.List;

@Service
public class QuartieServiceImpl implements QuartieService {
    @Autowired
    private QuartieDao quartieDao;

    @Autowired
    private SecteurService secteurService;

    @Override
    public int deleteByCode(String code) {
        return quartieDao.deleteByCode(code);
    }

    @Override
    public Quartie findByCode(String code) {
        return quartieDao.findByCode(code);
    }

    @Override
    public int save(Quartie quartie) {
        if (quartieDao.findByCode(quartie.getCode()) != null) {
            return -1;
        }
        else {
            Secteur secteur = quartie.getSecteur();
            secteurService.save(secteur);
            quartieDao.save(quartie);
            return 1;

            }
        }
    @Override
    public List<Quartie> findAll() {
        return quartieDao.findAll();
    }

}

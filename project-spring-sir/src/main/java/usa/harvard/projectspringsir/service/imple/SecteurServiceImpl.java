package usa.harvard.projectspringsir.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.commun.Secteur;
import usa.harvard.projectspringsir.dao.communDao.SecteurDao;
import usa.harvard.projectspringsir.service.intefaceService.SecteurService;

import java.util.List;

@Service
public class SecteurServiceImpl implements SecteurService {
    @Override
    public int deleteByCode(String code) {
        return dao.deleteByCode(code);
    }

    @Override
    public Secteur findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    public Secteur save(Secteur secteur) {
        return dao.save(secteur);
    }

    @Override
    public List<Secteur> findAll() {
        return dao.findAll();
    }
    @Autowired
    private SecteurDao dao ;
}

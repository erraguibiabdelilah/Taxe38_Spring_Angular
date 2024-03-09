package usa.harvard.projectspringsir.service.imple;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.commun.Ville;
import usa.harvard.projectspringsir.dao.communDao.VilleDao;
import usa.harvard.projectspringsir.service.intefaceService.VilleService;

import java.util.List;
@Data
@Service
public class VilleServiceImpl implements VilleService {
    public int deleteByCode(String code) {
        return villeDao.deleteByCode(code);
    }

    public Ville findByCode(String code) {
        return villeDao.findByCode(code);
    }

    public Ville save(Ville ville) {
        return villeDao.save(ville);
    }

    public List<Ville> findAll() {
        return villeDao.findAll();
    }

    @Autowired
    private VilleDao villeDao;
}

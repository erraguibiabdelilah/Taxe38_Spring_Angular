package usa.harvard.projectspringsir.service.imple.communImpl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.communBean.Ville;
import usa.harvard.projectspringsir.dao.communDao.VilleDao;
import usa.harvard.projectspringsir.service.intefaceService.communInter.VilleService;

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

    public int save(Ville ville) {
        if(villeDao.findByCode(ville.getCode())!=null){
            return -1;
        }
        else {
            villeDao.save(ville);
            return 1;
        }
    }

    public List<Ville> findAll() {
        return villeDao.findAll();
    }

    @Autowired
    private VilleDao villeDao;
}

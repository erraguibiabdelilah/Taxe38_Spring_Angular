package usa.harvard.projectspringsir.service.imple.communImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.communBean.Quartie;
import usa.harvard.projectspringsir.bean.communBean.Rue;
import usa.harvard.projectspringsir.dao.communDao.RueDao;
import usa.harvard.projectspringsir.service.intefaceService.communInter.QuartieService;
import usa.harvard.projectspringsir.service.intefaceService.communInter.RueService;

import java.util.List;

@Service
public class RueServiceImpl implements RueService {
    @Override
    public int deleteByCode(String code) {
        return rueDao.deleteByCode(code);
    }

    @Override
    public Rue findByCode(String code) {
        return rueDao.findByCode(code);
    }

    @Override
    public int save(Rue rue) {
       if(rueDao.findByCode(rue.getCode())!=null){
           return -1;
       }
       else {
           Quartie quartie=rue.getQuartie();
           quartieService.save(quartie);
           rueDao.save(rue);
           return 1;
       }
    }

    @Override
    public List<Rue> findAll() {
        return rueDao.findAll();
    }


    @Autowired
    private RueDao rueDao;
    @Autowired
    private QuartieService quartieService;
}

package usa.harvard.projectspringsir.service.imple.communImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.communBean.Redevable;
import usa.harvard.projectspringsir.dao.communDao.RedevableDao;
import usa.harvard.projectspringsir.service.intefaceService.communInter.RedevableService;

import java.util.List;

@Service
public class RedevableServiceImpl implements RedevableService {
    @Autowired
    private RedevableDao redevableDao;
    @Override
    public int deleteByCin(String cin) {
        return redevableDao.deleteByCin(cin);
    }

    @Override
    public Redevable findByCin(String cin) {
        return  redevableDao.findByCin(cin);
    }

    @Override
    public int save(Redevable redevable) {
        if(redevableDao.findByCin(redevable.getCin())!=null){
            return -1;
        }
        else {
            redevableDao.save(redevable);
            return 1;
        }
    }
    @Override
    public List<Redevable> findAll() {
        return redevableDao.findAll();
    }
}

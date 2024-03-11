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
    public int deleteByCode(String code) {
        return redevableDao.deleteByCode(code);
    }

    @Override
    public Redevable findByCode(String code) {
        return  redevableDao.findByCode(code);
    }

    @Override
    public int save(Redevable redevable) {
        if(redevableDao.findByCode(redevable.getCode())!=null){
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

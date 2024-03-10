package usa.harvard.projectspringsir.service.imple.communImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.communBean.Locale;
import usa.harvard.projectspringsir.bean.communBean.Redevable;
import usa.harvard.projectspringsir.bean.communBean.Rue;
import usa.harvard.projectspringsir.bean.taxe38Bean.CategorieLocale;
import usa.harvard.projectspringsir.dao.communDao.LocaleDao;
import usa.harvard.projectspringsir.service.intefaceService.taxe38Inter.CategorieLocaleService;
import usa.harvard.projectspringsir.service.intefaceService.communInter.Localservice;
import usa.harvard.projectspringsir.service.intefaceService.communInter.RedevableService;
import usa.harvard.projectspringsir.service.intefaceService.communInter.RueService;

import java.util.List;

@Service
public class LocalServiceImpl implements Localservice {


    @Autowired
    private LocaleDao localeDao;
    @Autowired
    private RueService rueService;
    @Autowired
    private CategorieLocaleService categorieLocaleService;
    @Autowired
    private RedevableService redevableDao;
    @Override
    public int deleteByCode(String code) {
        return localeDao.deleteByCode(code);
    }

    @Override
    public Locale findByCode(String code) {
        return localeDao.findByCode(code);
    }

    @Override
    public int save(Locale locale) {
       if(localeDao.findByCode(locale.getCode())!=null){
           return -1;
       }
       else {
           Rue rue=locale.getRue();
           CategorieLocale c=locale.getCategorieLocale();
           Redevable redevable=locale.getRedevable();
           categorieLocaleService.save(c);
           rueService.save(rue);
           redevableDao.save(redevable);
           localeDao.save(locale);
           return 1;
       }
    }

    @Override
    public List<Locale> findAll() {
        return localeDao.findAll();
    }
}

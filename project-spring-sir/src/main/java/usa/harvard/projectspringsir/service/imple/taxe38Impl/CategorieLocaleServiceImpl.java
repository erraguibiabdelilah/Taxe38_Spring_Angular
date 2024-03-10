package usa.harvard.projectspringsir.service.imple.taxe38Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.harvard.projectspringsir.bean.taxe38Bean.CategorieLocale;
import usa.harvard.projectspringsir.dao.taxe38Dao.CategorieLocaleDao;
import usa.harvard.projectspringsir.service.intefaceService.taxe38Inter.CategorieLocaleService;

import java.util.List;
@Service
public class CategorieLocaleServiceImpl implements CategorieLocaleService {
    @Autowired
    private CategorieLocaleDao categorieLocaleDao;
    @Override
    public int deleteByCode(String code) {
        return categorieLocaleDao.deleteByCode(code);
    }

    @Override
    public CategorieLocale findByCode(String code) {
        return categorieLocaleDao.findByCode(code);
    }

    @Override
    public int save(CategorieLocale c) {
        if(categorieLocaleDao.findByCode(c.getCode())!=null){
            return -1;
        }
        else {
            categorieLocaleDao.save(c);
            return 1;
        }
    }

    @Override
    public List<CategorieLocale> findAll() {
        return categorieLocaleDao.findAll();
    }
}

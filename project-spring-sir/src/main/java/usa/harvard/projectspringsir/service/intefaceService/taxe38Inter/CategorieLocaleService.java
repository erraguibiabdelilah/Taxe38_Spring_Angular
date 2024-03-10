package usa.harvard.projectspringsir.service.intefaceService.taxe38Inter;

import usa.harvard.projectspringsir.bean.taxe38Bean.CategorieLocale;

import java.util.List;

public interface CategorieLocaleService {
    int deleteByCode(String code);
    CategorieLocale findByCode(String code);
    int save(CategorieLocale ville);
    List<CategorieLocale> findAll();
}
